package features.home.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import theme.shapeRadius10

@Composable
fun EducationCard(
    title: String,
    description: String,
    thumbnail: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier =
            modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(170.dp)
                .shapeRadius10()
                .background(MaterialTheme.colors.surface),
    ) {
        KamelImage(
            resource = asyncPainterResource(data = thumbnail),
            contentDescription = title,
            modifier =
                Modifier
                    .fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = title,
                modifier =
                    Modifier.padding(
                        horizontal = 8.dp,
                        vertical = 4.dp,
                    ),
                style =
                    MaterialTheme.typography.h6.copy(
                        shadow =
                            Shadow(
                                color = Color.White.toComposeColor(),
                                offset = Offset(0f, 1f),
                                blurRadius = 3f,
                            ),
                    ),
                textAlign = TextAlign.Center,
            )

            Text(
                text = description,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                style = MaterialTheme.typography.caption.copy(
                    shadow =
                    Shadow(
                        color = Color.Black.toComposeColor(),
                        offset = Offset(0f, 1f),
                        blurRadius = 3f,
                    ),
                ),
                textAlign = TextAlign.Center,
            )
        }
    }
}
