package features.home.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import theme.shapeRadius15

@Composable
fun ExploreCard( title: String,
                 description: String,
                 thumbnail: String, modifier: Modifier = Modifier) {

    Column(
        modifier =
        modifier
            .padding(16.dp)
            .size(width = 250.dp, height = 350.dp)
            .padding(vertical = 8.dp)
            .shapeRadius15()
            .background(MaterialTheme.colors.surface),
    ) {
        KamelImage(
            resource = asyncPainterResource(data = thumbnail),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .height(200.dp).shapeRadius15(),
        )
        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(8.dp),
        )
    }

}