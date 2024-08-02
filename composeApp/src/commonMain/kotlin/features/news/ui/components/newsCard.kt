package features.news.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun newsHomeCard(
    title: String,
    thumbnail: String,
    modifier: Modifier,
) {
    Box(modifier = modifier) {
        val image = asyncPainterResource(data = thumbnail)
        KamelImage(
            image,
            contentScale = ContentScale.Crop,
            contentAlignment = Alignment.Center,
            contentDescription = title,
            modifier = Modifier.fillMaxSize(),
        )

        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .background(
                        brush =
                            Brush.verticalGradient(
                                colors =
                                    listOf(
                                        androidx.compose.ui.graphics.Color.Transparent,
                                        MaterialTheme.colors.background,
                                    ),
                            ),
                    ).align(Alignment.BottomStart)
                    .padding(16.dp),
        )
    }
}
