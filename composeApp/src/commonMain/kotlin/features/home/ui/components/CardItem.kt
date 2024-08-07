package features.home.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import theme.shapeRadius15

@Composable
fun CardItem(
    title: String,
    description: String,
    thumbnail: String,
    onClick: (() -> Unit)? = null,
) {
    Column(
        modifier =
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .shapeRadius15()
                .clickable { onClick?.invoke() }
                .background(MaterialTheme.colors.surface),
    ) {
        KamelImage(
            resource = asyncPainterResource(data = thumbnail),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .shapeRadius15(),
        )
        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(16.dp),
        )
        Text(
            text = description,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        )
    }
}
