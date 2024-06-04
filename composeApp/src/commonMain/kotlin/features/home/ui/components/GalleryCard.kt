package features.home.ui.components

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import utils.fadingEdgeTop

@Composable
fun GalleryCard(
    title: String,
    description: String,
    thumbnail: String,
) {
    Box(
        modifier =
            Modifier
                .fillMaxWidth(0.5f)
                .height(400.dp),
    ) {
        KamelImage(
            resource = asyncPainterResource(data = thumbnail),
            contentDescription = title,
            modifier = Modifier.fillMaxSize().fadingEdgeTop(),
            contentScale = ContentScale.Crop,
        )
        Column(modifier = Modifier.align(Alignment.BottomStart)) {
            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                style = MaterialTheme.typography.body1,
            )

            Text(
                text = description,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                style = MaterialTheme.typography.caption,
            )
        }
    }
}
