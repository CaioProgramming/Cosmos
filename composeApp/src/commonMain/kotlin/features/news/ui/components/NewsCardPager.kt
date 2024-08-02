@file:OptIn(ExperimentalFoundationApi::class)

package features.news.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import features.home.data.model.DefaultCard
import features.news.data.model.Reference
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import kotlinx.coroutines.launch
import theme.shapeRadius10

@Composable
fun NewsCardPager(
    items: List<DefaultCard>,
    reference: Reference,
) {
    val requestedLink = mutableStateOf<String?>(null)
    val uriHandler = LocalUriHandler.current

    fun openUrl(link: String) {
        uriHandler.openUri(link)
        requestedLink.value = null
    }

    val pagerState = rememberPagerState(pageCount = { items.size })
    val currentItem = items[pagerState.currentPage]
    val coroutineScope = rememberCoroutineScope()
    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .shapeRadius10()
                .background(MaterialTheme.colors.surface)
                .animateContentSize(),
    ) {
        HorizontalPager(pagerState) {
            val item = items[it]
            KamelImage(
                resource = asyncPainterResource(item.thumbnailURL),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(200.dp),
            )
        }

        AnimatedVisibility(
            currentItem == items.last(),
            enter = fadeIn(),
            exit = fadeOut(tween(1000)),
        ) {
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.primary)
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                        .clickable { openUrl(reference.link) },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Veja mais em ${reference.author}",
                    style = MaterialTheme.typography.caption.copy(fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Start,
                )
                Icon(
                    Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                    contentDescription = null,
                )
            }
        }

        PagerIndicator(Modifier.padding(4.dp).align(Alignment.CenterHorizontally), items.size, pagerState.currentPage) {
            coroutineScope.launch {
                pagerState.animateScrollToPage(it)
            }
        }

        AnimatedVisibility(currentItem.title.isNotEmpty(), enter = fadeIn(), exit = fadeOut()) {
            Text(
                text = currentItem.title,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(horizontal = 16.dp, 8.dp),
                textAlign = TextAlign.Start,
            )
        }
        AnimatedContent(
            currentItem,
            transitionSpec = {
                fadeIn(
                    animationSpec = tween(3000),
                ) togetherWith fadeOut(animationSpec = tween(3000))
            },
        ) {
            Text(
                text = currentItem.description,
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify,
            )
        }
    }
}
