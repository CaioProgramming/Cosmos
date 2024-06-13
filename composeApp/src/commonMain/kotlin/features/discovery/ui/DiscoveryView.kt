@file:OptIn(ExperimentalFoundationApi::class, ExperimentalAnimationApi::class)

package features.discovery.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import animations.createGradientAnimation
import features.discovery.model.data.Discovery
import features.discovery.presentation.DiscoveryState
import features.discovery.presentation.DiscoveryViewModel
import features.discovery.ui.components.DiscoveryCard
import features.discovery.ui.components.ExpandedDiscoveryCard
import org.koin.compose.koinInject
import theme.CosmosApp

@Composable
fun DiscoveryView(viewModel: DiscoveryViewModel = koinInject()) {
    val state = viewModel.state.collectAsState().value
    val navController = LocalNavController.current


    LaunchedEffect(state) {
        if (state == null) {
            viewModel.getDiscoveryCards()
        }
    }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        if (state is DiscoveryState.Loading) {
            item {
                CosmosApp.Resources.icon(modifier = Modifier.createGradientAnimation())
            }
        }

        if (state is DiscoveryState.Success) {
            val discoveryItems = state.data
            items(discoveryItems.size) { position ->
                val curiosity = discoveryItems[position]
                DiscoveryCard(
                    curiosity.title,
                    curiosity.callOut,
                    curiosity.thumbnailURL,
                    modifier =
                    Modifier.clickable {
                        val route = DiscoveryDetail.routeImpl(curiosity.id)
                        navController.navigate(route)
                    },
                )
            }
        }
    }
}
