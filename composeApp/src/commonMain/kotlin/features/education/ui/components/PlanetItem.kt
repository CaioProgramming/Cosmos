@file:OptIn(ExperimentalAnimationApi::class)

package features.education.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.earth_ic
import com.ilustris.cosmos.resources.ic_calendar
import com.ilustris.cosmos.resources.ic_earth
import com.ilustris.cosmos.resources.ic_rotation
import com.ilustris.cosmos.resources.ic_sun
import com.ilustris.cosmos.resources.ic_thermometer
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import theme.CosmosApp
import theme.Dimensions
import utils.glow
import kotlin.math.max
import kotlin.math.roundToInt

@Composable
fun PlanetItem(
    title: String,
    iconVector: DrawableResource,
    modifier: Modifier = Modifier,
) {
    Image(
        painterResource(iconVector),
        modifier = modifier,
        contentDescription = title,
        contentScale = ContentScale.Fit,
    )
}

@Composable
fun PlanetInfos(
    description: String,
    earthDistance: Float,
    sunDistance: Float,
    temperature: Float,
    yearDuration: Int,
    rotationSpeed: Float,
    maxDistance: Float,
    sunMinDistance: Float,
    planetColor: Color,
    modifier: Modifier = Modifier,
) {
    val distanceAnimation = animateFloatAsState(targetValue = earthDistance / maxDistance, animationSpec = tween(2000))
    val sunDistanceAnimation = animateFloatAsState(targetValue = 1 - (sunDistance / sunMinDistance), animationSpec = tween(2000))
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
    ) {
        item(span = { GridItemSpan(this.maxLineSpan) }) {
            AnimatedContent(targetState = description, transitionSpec = {
                slideInVertically(tween(500)) + fadeIn(tween(1000)) with slideOutVertically() + fadeOut(tween(500))
            }) {
                Text(
                    text = it,
                    style = MaterialTheme.typography.subtitle1,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(vertical = Dimensions.padding8),
                )
            }

        }

        if (earthDistance > 0) {
            item {
                DetailCard(
                    title = "Distância da Terra",
                    suffix = "km",
                    iconVector = Res.drawable.ic_earth,
                    counting = earthDistance,
                    progress = distanceAnimation.value,
                    tint = planetColor
                )
            }
        }

        item {
            DetailCard(
                title = "Distância do sol",
                suffix = "km",
                iconVector = Res.drawable.ic_sun,
                counting = sunDistance,
                tint = planetColor,
                progress = sunDistanceAnimation.value
            )
        }

        item {
            DetailCard(
                title = "Temperatura",
                suffix = "°C",
                iconVector = Res.drawable.ic_thermometer,
                counting = temperature,
                tint = planetColor
            )
        }

        item {
            DetailCard(
                title = "Duração do ano",
                suffix = "dias",
                iconVector = Res.drawable.ic_calendar,
                counting = yearDuration.toFloat(),
                tint = planetColor
            )
        }

        item {
            DetailCard(
                title = "Velocidade de rotação",
                suffix = "km/h",
                iconVector = Res.drawable.ic_rotation,
                counting = rotationSpeed,
                tint = planetColor
            )
        }
    }
}

@Composable
fun CounterText(value: Int, suffix: String = "", style: TextStyle = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.W700)) {
    val valueAnimation = animateIntAsState(targetValue = value, animationSpec = tween(500)).value
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = valueAnimation.toString(),
            style = style,
        )
        Text(
            text = suffix,
            style = MaterialTheme.typography.caption,
            modifier = Modifier.padding(horizontal = Dimensions.padding4)
        )
    }

}

@Composable
fun DetailCard(title: String, suffix: String = "", iconVector: DrawableResource, counting: Float, progress: Float? = null, tint: Color) {
    Column(modifier = Modifier
        .padding(Dimensions.padding8)
        .fillMaxWidth()
        .background(MaterialTheme.colors.background.copy(alpha = 0.3f), RoundedCornerShape(CosmosApp.Resources.defaultRadius))
        .padding(Dimensions.padding8)
    ) {
        Text(text = title, style = MaterialTheme.typography.caption)
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(painterResource(iconVector),
                contentDescription = title,
                tint = tint,
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = Dimensions.padding4)
            )
            CounterText(
                counting.roundToInt(),
                suffix,
                style = MaterialTheme.typography.h6.copy(color = tint)
            )
        }

        AnimatedVisibility(progress != null, enter = fadeIn(), exit = fadeOut()) {
            LinearProgressIndicator(
                progress = progress ?: 0.0f,
                color = tint,
                strokeCap = StrokeCap.Round,
                backgroundColor = Color.Transparent,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
