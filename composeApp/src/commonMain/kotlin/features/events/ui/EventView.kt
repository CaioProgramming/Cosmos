@file:OptIn(ExperimentalFoundationApi::class)

package features.events.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseInElastic
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import animations.createGradientAnimation
import features.events.data.model.EventData
import features.events.presentation.EventState
import features.events.presentation.EventViewModel
import features.events.ui.components.EventCard
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun EventView() {
    val rootController = LocalNavController.current
    val viewModel = koinInject<EventViewModel>()
    val state = viewModel.state.collectAsState().value

    AnimatedContent(state, transitionSpec = {
        fadeIn() with fadeOut()
    }) {
        Box(Modifier.fillMaxSize()) {
            when (state) {
                is EventState.Error ->
                    Text(
                        text = "Ocorreu um erro ao carregar os eventos.",
                        modifier =
                            Modifier.align(
                                Alignment.Center,
                            ),
                    )
                EventState.Loading -> CosmosApp.Resources.icon(modifier = Modifier.createGradientAnimation().align(Alignment.Center))
                is EventState.Success -> {
                    eventPager(state.events, onSelectEvent = {})
                }
                null -> Box(Modifier.size(0.dp))
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.getEvents()
    }
}

@Composable
fun eventPager(
    events: List<EventData>,
    modifier: Modifier = Modifier,
    onSelectEvent: ((EventData) -> Unit)? = null,
) {
    val eventList = remember { events }
    val pagerState = rememberPagerState(pageCount = { eventList.size })
    val padding = Dimensions.padding8
    val eventDetail = remember { mutableStateOf<EventData?>(null) }

    eventDialog(eventDetail.value, onDismiss = { eventDetail.value = null })

    HorizontalPager(
        pagerState,
        pageSize =
            object : PageSize {
                override fun Density.calculateMainAxisPageSize(
                    availableSpace: Int,
                    pageSpacing: Int,
                ): Int = ((availableSpace - 2 * pageSpacing) * .85f).toInt()
            },
        pageSpacing = padding.unaryMinus() * .5f,
        modifier = modifier.fillMaxHeight(.75f),
    ) {
        val event = events[it]
        val scaleAnimation =
            animateFloatAsState(
                targetValue = if (pagerState.currentPage == it) 1f else .8f,
            ).value
        EventCard(
            modifier =
                Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .graphicsLayer {
                        scaleX = scaleAnimation
                        scaleY = scaleAnimation
                    }.clip(RoundedCornerShape(CosmosApp.Resources.defaultRadius))
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onDoubleTap = {
                                eventDetail.value = event
                            },
                            onLongPress = {
                                eventDetail.value = event
                            },
                            onTap = {
                                onSelectEvent?.invoke(event)
                            },
                        )
                    },
            title = event.title,
            description = event.description,
            date = event.date,
            imageURL = event.thumbnailURL,
            countries = event.visiblePlaces,
            extraInfo = event.extraInfo,
            showFullText = true,
        )
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun eventDialog(
    eventData: EventData?,
    onDismiss: () -> Unit,
) {
    AnimatedVisibility(
        visible = eventData != null,
        enter = fadeIn(),
        exit = fadeOut(),
    ) {
        Dialog(
            onDismissRequest = {
                onDismiss()
            },
            properties =
                DialogProperties(
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true,
                    usePlatformDefaultWidth = false,
                ),
        ) {
            AnimatedContent(eventData, transitionSpec = {
                scaleIn(tween(2000, delayMillis = 1000, easing = EaseIn)) with
                    slideOutVertically(
                        tween(1000, easing = EaseInElastic),
                    ) { -1 }
            }) {
                it?.let {
                    Column {
                        IconButton(
                            onClick = {
                                onDismiss()
                            },
                            modifier =
                                Modifier
                                    .padding(Dimensions.padding16)
                                    .size(24.dp)
                                    .align(Alignment.Start),
                        ) {
                            Icon(Icons.Rounded.Close, contentDescription = "Fechar")
                        }

                        EventCard(
                            title = it.title,
                            description = it.description,
                            date = it.date,
                            imageURL = it.thumbnailURL,
                            countries = it.visiblePlaces,
                            extraInfo = it.extraInfo,
                            showFullText = true,
                            modifier =
                                Modifier
                                    .padding(Dimensions.padding8)
                                    .fillMaxWidth()
                                    .fillMaxHeight(.75f)
                                    .clip(
                                        RoundedCornerShape(CosmosApp.Resources.defaultRadius),
                                    ).align(Alignment.CenterHorizontally),
                        )

                        Row(
                            modifier =
                                Modifier
                                    .padding(Dimensions.padding16)
                                    .align(Alignment.CenterHorizontally),
                        ) {
                            IconButton(
                                onClick = { },
                                modifier =
                                    Modifier
                                        .padding(horizontal = Dimensions.padding8)
                                        .border(1.dp, CosmosApp.Resources.brush(), CircleShape)
                                        .background(MaterialTheme.colors.surface.copy(alpha = 0.8f), CircleShape)
                                        .padding(8.dp)
                                        .size(24.dp),
                            ) {
                                Icon(Icons.Rounded.FavoriteBorder, contentDescription = "Fechar")
                            }
                            IconButton(
                                onClick = { },
                                modifier =
                                    Modifier
                                        .padding(horizontal = Dimensions.padding8)
                                        .border(1.dp, CosmosApp.Resources.brush(), CircleShape)
                                        .background(MaterialTheme.colors.surface.copy(alpha = 0.8f), CircleShape)
                                        .padding(8.dp)
                                        .size(24.dp),
                            ) {
                                Icon(Icons.Rounded.Share, contentDescription = "Fechar")
                            }
                        }
                    }
                }
            }
        }
    }
}
