@file:OptIn(ExperimentalComposeUiApi::class)

package features.gallery.ui

import LocalNavController
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import features.gallery.presentation.GalleryState
import features.gallery.presentation.GalleryViewModel
import features.home.data.model.DefaultCard
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions
import utils.fadingEdgeTop
import utils.fadingEdgeTopAndBottom

@Composable
fun GalleryView(viewModel: GalleryViewModel = koinInject()) {
    val state = viewModel.state.collectAsState().value
    val configuration = LocalWindowInfo.current
    val navController = LocalNavController.current

    AnimatedVisibility(visible = state is GalleryState.Loading, enter = scaleIn(), exit = scaleOut()) {
        Box {
            CosmosApp.Resources.animatedIcon(modifier = Modifier.align(Alignment.Center))
        }
    }

    if (state is GalleryState.Error) {
        Box {
            Text("Ocorreu um erro inesperado", modifier = Modifier.align(Alignment.Center))
        }
    }

    if (state is GalleryState.Success) {
        val collections = state.collections

        fun navigateToSlides(item: DefaultCard) {
            val flatList = collections.map { it.items }.flatten()
            val position = flatList.indexOf(item)
            val flatItem = flatList.getOrNull(position)
            flatItem?.let {
                print("Navigating to slides at position $position\n")
                val page = CosmosApp.Navigation.Pages.GallerySlides
                CosmosApp.Navigation.navigateWithArgs(page,
                    mapOf(
                        page.pageConfig.arguments.first().name to position.toString()
                    ), navController)
            }

        }

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            collections.forEach { collection ->
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    Text(
                        text = collection.title,
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(Dimensions.padding16),
                    )
                }

                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    Text(text = collection.description,
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(vertical = Dimensions.padding8,
                                horizontal = Dimensions.padding16
                            )
                            .alpha(0.6f)
                    )
                }

                items(collection.items.size, span = { index ->
                    val span = if (index % 3 == 0) this.maxLineSpan else 1
                    GridItemSpan(span)
                }) { index ->
                    val item = collection.items[index]
                    GalleryCard(
                        item.title,
                        item.description,
                        item.thumbnailURL,
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .height(300.dp)
                                .clickable { navigateToSlides(item) }
                                .let { if(item == collection.items.first()) it.fadingEdgeTop()  else it },
                    )
                }
            }
            item { Text("Todas as imagens estão disponíveis publicamente.",
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(Dimensions.padding16))
            }
        }
    }
    LaunchedEffect(Unit) {
        if (state == null) {
            viewModel.fetchGallery()
        }
    }
}

fun calculateColumns(
    screenWidthDp: Int,
    minColumnWidthDp: Int,
): Int = (screenWidthDp / minColumnWidthDp).coerceAtLeast(1)
