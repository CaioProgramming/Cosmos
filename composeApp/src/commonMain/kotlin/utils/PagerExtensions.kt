@file:OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
)

package utils

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.util.lerp
import kotlin.math.absoluteValue

fun Modifier.pagerCubeInScalingTransition(pagerState: PagerState) =
    graphicsLayer {
        cameraDistance = 32f
        // Calculate the absolute offset for the current page from the
        // scroll position.
        val page = pagerState.currentPage
        val pageOffset = pagerState.getOffsetFractionForPage(page)

        if (pageOffset < -1f) {
            // page is far off screen
            alpha = 0f
        } else if (pageOffset <= 0) {
            // page is to the right of the selected page or the selected page
            alpha = 1f
            transformOrigin = TransformOrigin(0f, 0.5f)
            // rotationY = -90f * pageOffset.absoluteValue
        } else if (pageOffset <= 1) {
            // page is to the left of the selected page
            alpha = 1f
            transformOrigin = TransformOrigin(1f, 0.5f)
            // rotationY = 90f * pageOffset.absoluteValue
        } else {
            alpha = 0f
        }

        if (pageOffset.absoluteValue <= 0.5) {
            scaleY = .4f.coerceAtLeast(1 - pageOffset.absoluteValue)
            scaleX = .4f.coerceAtLeast(1 - pageOffset.absoluteValue)
        } else if (pageOffset.absoluteValue <= 1) {
            scaleY = .4f.coerceAtLeast(pageOffset.absoluteValue)
            scaleX = .4f.coerceAtLeast(pageOffset.absoluteValue)
        }
    }

fun Modifier.pagerCubeInScalingTransitionVertical(pagerState: PagerState) =
    graphicsLayer {
        cameraDistance = 32f
        // Calculate the absolute offset for the current page from the
        // scroll position.
        val page = pagerState.currentPage
        val pageOffset = pagerState.getOffsetFractionForPage(page)

        if (pageOffset < -1f) {
            // page is far off screen
            alpha = 0f
        } else if (pageOffset <= 0) {
            // page is to the right of the selected page or the selected page
            alpha = 1f
            transformOrigin = TransformOrigin(0.5f, 0f)
            // rotationY = -90f * pageOffset.absoluteValue
        } else if (pageOffset <= 1) {
            // page is to the left of the selected page
            alpha = 1f
            transformOrigin = TransformOrigin(0.5f, 1f)
            // rotationY = 90f * pageOffset.absoluteValue
        } else {
            alpha = 0f
        }

        if (pageOffset.absoluteValue <= 0.5) {
            scaleY = .4f.coerceAtLeast(1 - pageOffset.absoluteValue)
            scaleX = .4f.coerceAtLeast(1 - pageOffset.absoluteValue)
        } else if (pageOffset.absoluteValue <= 1) {
            scaleY = .4f.coerceAtLeast(pageOffset.absoluteValue)
            scaleX = .4f.coerceAtLeast(pageOffset.absoluteValue)
        }
    }

fun Modifier.pagerFadeTransition(pagerState: PagerState) =
    graphicsLayer {
        // Calculate the absolute offset for the current page from the
        // scroll position.
        val page = pagerState.currentPage
        val pageOffset = pagerState.getOffsetFractionForPage(page)

        if (pageOffset < -1f) {
            // page is far off screen
            alpha = 0f
        } else if (pageOffset <= 0) {
            // page is to the right of the selected page or the selected page
            alpha = 1f + pageOffset
        } else if (pageOffset <= 1) {
            // page is to the left of the selected page
            alpha = 1f - pageOffset
        } else {
            alpha = 0f
        }
    }

@Composable
fun Modifier.pagerZoomTransition(pagerState: PagerState) =
    graphicsLayer {
        // Calculate the absolute offset for the current page from the
        // scroll position.
        val page = pagerState.currentPage
        val pageOffset = pagerState.getOffsetFractionForPage(page)
        val targetValue = if (pageOffset < 0) 1.3f else 1f

        // Adjust the scale of the page based on its offset from the center
        val minScale = 1.85f
        val maxScale = 1f
        val scale = lerp(minScale, maxScale, 1 - pageOffset.absoluteValue)

        scaleX = scale
        scaleY = scale
    }

@Composable
fun Modifier.pagerStack(
    position: Int,
    pagerState: PagerState,
) = graphicsLayer {
    val pageOffSet =
        (
            (pagerState.currentPage - position) +
                pagerState
                    .currentPageOffsetFraction
        ).absoluteValue
    alpha =
        lerp(
            start = 0.5f,
            stop = 1f,
            fraction = 1f - pageOffSet.coerceIn(0f, 1f),
        )
    scaleY =
        lerp(
            start = 0.75f,
            stop = 1f,
            fraction = 1f - pageOffSet.coerceIn(0f, 1f),
        )
}
