@file:OptIn(ExperimentalFoundationApi::class)

package features.discovery.ui

import LocalNavController
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import features.discovery.presentation.DiscoveryDetailState
import features.discovery.presentation.DiscoveryDetailViewModel
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions

object DiscoveryDetail {

    val argumentKey = "id"

    fun routeImpl(id: Int): String {
        val route = CosmosApp.Navigation.Pages.DiscoveryDetail.pageConfig.route
        return route.replace("{$argumentKey}", id.toString())
    }


}

@Composable
fun DiscoveryDetail(
    id: String?,
    viewModel: DiscoveryDetailViewModel = koinInject(),
) {
    val state = viewModel.state.collectAsState().value
    val navController = LocalNavController.current
    LaunchedEffect(state) {
        if (state == null) {
            viewModel.getDiscoveryDetail(id?.toInt())
        }
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(bottom = 50.dp)) {
        if (state == DiscoveryDetailState.Loading) {
            item {
                CosmosApp.Resources.animatedIcon()
            }
        }

        if (state is DiscoveryDetailState.Success) {
            item {
                Box {
                    KamelImage(
                        asyncPainterResource(state.data.thumbnailURL),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth().height(350.dp),
                    )

                    IconButton({ navController.popBackStack() },
                        modifier = Modifier
                        .displayCutoutPadding()
                        .padding(Dimensions.padding16)
                        .padding(8.dp)
                        .background(MaterialTheme.colors.background.copy(alpha = 0.2f), CircleShape)
                    ) {
                        Icon(
                            Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                            contentDescription = null,
                            tint = MaterialTheme.colors.onSurface,
                        )
                    }
                }
            }

            stickyHeader {
                Text(state.data.title, style = MaterialTheme.typography.h4,
                    modifier = Modifier.fillMaxWidth().background(MaterialTheme.colors.background)
                        .displayCutoutPadding().padding(16.dp)
                )
            }

            item {
                Text(state.data.description, style = MaterialTheme.typography.body1, modifier = Modifier.padding(16.dp))
            }
        }
    }
}
