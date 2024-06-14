package features.discovery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import theme.Dimensions
import theme.defaultRadius

@Composable
fun DiscoveryCard(
    title: String,
    description: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {

    Column(modifier) {
        Text(
            title,
            style = MaterialTheme.typography.h6,
            modifier =
                Modifier.padding(
                    horizontal = Dimensions.padding16,
                    vertical = Dimensions.padding4,
                ),
        )

        KamelImage(
            asyncPainterResource(imageUrl),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier =
                Modifier
                    .padding(Dimensions.padding16)
                    .fillMaxWidth()
                    .height(300.dp)
                    .defaultRadius(),
        )

        Text(
            description,
            maxLines = 5,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(Dimensions.padding16),
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().background(MaterialTheme.colors.secondary.copy(alpha = 0.2f))
                .defaultRadius()
                .padding(Dimensions.padding16),
        ) {
            Text("Ver mais")
            Icon(Icons.AutoMirrored.Rounded.KeyboardArrowRight, contentDescription = null)
        }
    }
}


@Composable
fun ExpandedDiscoveryCard(
    title: String,
    description: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {


        KamelImage(
            asyncPainterResource(imageUrl),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier =
            Modifier
                .fillMaxWidth()
                .height(300.dp),
        )

        Text(
            title,
            style = MaterialTheme.typography.h4,
            modifier =
            Modifier.padding( Dimensions.padding16),
        )

        Text(
            description,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(Dimensions.padding16),
        )
    }
}
