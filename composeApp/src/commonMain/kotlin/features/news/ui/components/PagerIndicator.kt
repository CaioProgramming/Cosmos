package features.news.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    count: Int,
    currentIndex: Int,
    onRequestPage: (Int) -> Unit = {},
) {
    val activeColor = MaterialTheme.colors.onBackground
    val disabledColor = MaterialTheme.colors.onBackground.copy(alpha = 0.3f)
    Row(modifier = modifier) {
        repeat(count) {
            val targetColor = if (currentIndex == it) activeColor else disabledColor
            val colorAnimation = animateColorAsState(targetValue = targetColor, tween(500, easing = FastOutLinearInEasing)).value

            Box(
                modifier =
                    Modifier
                        .padding(2.dp)
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(
                            color = colorAnimation,
                        ).clickable {
                            onRequestPage(it)
                        },
            )
        }
    }
}
