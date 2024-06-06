@file:OptIn(ExperimentalFoundationApi::class)

package features.events.ui

import LocalNavController
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import animations.createGradientAnimation
import features.events.presentation.EventState
import features.events.presentation.EventViewModel
import features.events.ui.components.EventLargeCard
import org.koin.compose.koinInject
import theme.CosmosIcon
import theme.getAppColors

object EventsPage {
    val tag = "EventPage"
}

@Composable
fun EventView() {
    val rootController = LocalNavController.current
    val viewModel = koinInject<EventViewModel>()
    val state = viewModel.state.collectAsState().value

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        TopAppBar(
            title = { Text(text = "Eventos") },
            backgroundColor = MaterialTheme.colors.background,
            navigationIcon = {
                IconButton(onClick = { rootController.popBackStack() }) {
                    Icon(Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "Back")
                }
            },
        )

        when (state) {
            is EventState.Error -> Text(text = "Ocorreu um erro ao carregar os eventos.")
            EventState.Loading ->
                CosmosIcon(
                    modifier =
                        Modifier.createGradientAnimation(
                            getAppColors(),
                        ),
                )
            is EventState.Success -> {
                val events = state.events
                val pagerState = rememberPagerState(pageCount = { events.size })
                VerticalPager(pagerState) {
                    val event = events[it]
                    EventLargeCard(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        title = event.title,
                        description = event.description,
                        date = event.date,
                        imageURL = event.thumbnailURL,
                        countries = event.visiblePlaces,
                        extraInfo = event.extraInfo,
                    )
                }
            }
            null -> Box(Modifier.size(0.dp))
        }
    }

    LaunchedEffect(Unit) {
        viewModel.getEvents()
    }
}
