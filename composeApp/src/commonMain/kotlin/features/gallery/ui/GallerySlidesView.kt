@file:OptIn(ExperimentalFoundationApi::class)

package features.gallery.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import features.gallery.presentation.GalleryState
import features.gallery.presentation.GalleryViewModel
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions
import utils.pagerZoomTransition

object GallerySlides

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun GallerySlidesView(
    itemPosition: Int?,
    navController: NavController = LocalNavController.current,
) {
    val galleryViewModel = koinInject<GalleryViewModel>()
    val state = galleryViewModel.state.collectAsState().value

    if (state is GalleryState.Loading) {
        Box(modifier = Modifier.fillMaxSize()) {
            CosmosApp.Resources.animatedIcon(modifier = Modifier.align(Alignment.Center))
        }
    }

    if (state is GalleryState.Success) {
        val collections = state.collections
        val images = collections.map { it.items }.flatten()
        val pagerState =
            rememberPagerState(pageCount = {
                images.size
            })
        val currentItem = images[pagerState.currentPage]
        val collectionReference = collections.find { it.items.contains(currentItem) }
        val resource = asyncPainterResource(currentItem.thumbnailURL)
        var imageExpanded by remember {
            mutableStateOf(true)
        }
        Box(modifier = Modifier.fillMaxSize()) {
            val infiniteAnimation = rememberInfiniteTransition()
            val zoomAnimation =
                infiniteAnimation.animateFloat(
                    initialValue = 1f,
                    targetValue = 1.4f,
                    animationSpec =
                        infiniteRepeatable(
                            animation = tween(30000, easing = EaseIn, delayMillis = 2000),
                            repeatMode = RepeatMode.Reverse,
                        ),
                )
            AnimatedContent(currentItem, transitionSpec = {
                fadeIn() with fadeOut()
            }) {
                AnimatedVisibility(
                    visible = !imageExpanded,
                    enter = fadeIn(tween(1500)),
                    exit = fadeOut(tween(1500)),
                ) {
                    KamelImage(
                        resource,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier =
                            Modifier
                                .fillMaxSize()
                                .blur(25.dp, BlurredEdgeTreatment.Unbounded)
                                .graphicsLayer {
                                    scaleX = zoomAnimation.value
                                    scaleY = zoomAnimation.value
                                },
                    )
                }
            }

            HorizontalPager(pagerState, modifier = Modifier.background(Color.Transparent).fillMaxSize()) { page ->
                val item = images[page]
                AnimatedContent(
                    targetState = imageExpanded,
                    transitionSpec = {
                        fadeIn(tween(200)) + scaleIn(tween(), initialScale = 0.8f) with
                            fadeOut(tween(200)) + scaleOut(tween(), targetScale = 0.8f)
                    },
                ) {
                    val scale = if (it) ContentScale.Crop else ContentScale.Fit

                    KamelImage(
                        asyncPainterResource(item.thumbnailURL),
                        contentDescription = item.title,
                        contentScale = scale,
                        contentAlignment = Alignment.Center,
                        modifier =
                            Modifier
                                .background(Color.Transparent)
                                .let { modifier ->
                                    if (it) {
                                        modifier
                                            .fillMaxSize()
                                            .pagerZoomTransition(pagerState)
                                            .graphicsLayer {
                                                scaleX = zoomAnimation.value
                                                scaleY = zoomAnimation.value
                                            }
                                    } else {
                                        modifier
                                            .padding(Dimensions.padding16)
                                            .wrapContentSize()
                                    }
                                }.pointerInput(Unit) {
                                    detectTapGestures(
                                        onDoubleTap = {
                                            imageExpanded = !imageExpanded
                                        },
                                        onLongPress = {
                                            imageExpanded = !imageExpanded
                                        },
                                    )
                                },
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color.Transparent,
                                    MaterialTheme.colors.background.copy(alpha = 0.5f),
                                    MaterialTheme.colors.background,
                                ).reversed(),
                            ),
                        ).padding(Dimensions.padding16)
                        .displayCutoutPadding(),
            ) {
                IconButton(
                    { navController.popBackStack() },
                ) {
                    Icon(Icons.Rounded.Close, contentDescription = "Close", tint = Color.White)
                }
            }

            AnimatedContent(
                currentItem,
                transitionSpec = {
                    fadeIn(tween(1500)) with fadeOut(tween(2500))
                },
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .align(
                            Alignment.BottomCenter,
                        ),
            ) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color.Transparent,
                                    MaterialTheme.colors.background.copy(alpha = 0.5f),
                                    MaterialTheme.colors.background,
                                ),
                            ),
                        ).navigationBarsPadding(),
                ) {
                    Text(
                        collectionReference?.title ?: "",
                        style = MaterialTheme.typography.caption,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(horizontal = Dimensions.padding16),
                    )
                    Text(
                        currentItem.title,
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(Dimensions.padding16),
                    )
                    Text(
                        currentItem.description,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.padding(horizontal = Dimensions.padding16),
                    )
                    Box(modifier = Modifier.height(32.dp))
                }
            }

            LaunchedEffect(Unit) {
                print("Received arg: $itemPosition \n")
                itemPosition?.let { pagerState.animateScrollToPage(it) }
            }
        }
    }
    LaunchedEffect(Unit) {
        if (state == null) {
            galleryViewModel.fetchGallery()
        }
    }
}
