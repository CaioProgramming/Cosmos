@file:OptIn(ExperimentalFoundationApi::class)

package features.events.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.composables.ui.Menu
import com.composables.ui.MenuButton
import com.composables.ui.MenuContent
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.ic_binocular
import com.ilustris.cosmos.resources.more_horizontal
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format
import org.jetbrains.compose.resources.painterResource
import theme.CosmosApp
import theme.Dimensions
import theme.defaultRadius
import utils.CountryUtils
import utils.DateFormats

@Composable
fun EventCard(
    title: String,
    description: String,
    date: String,
    imageURL: String,
    countries: List<String> = emptyList(),
    extraInfo: List<String> = emptyList(),
    showFullText: Boolean = false,
    modifier: Modifier,
) {
    val dateText by remember {
        val parsedDate = LocalDate.parse(date)
        mutableStateOf(DateFormats.DD_OF_MMM.localDateFormat?.format(parsedDate) ?: "")
    }

    Box(modifier = modifier) {
        val detailShape = RoundedCornerShape(30.dp)
        KamelImage(
            resource = asyncPainterResource(imageURL),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
        )

        Text(
            text = buildAnnotatedString { append(dateText) },
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.subtitle1,
            modifier =
                Modifier
                    .padding(Dimensions.padding16)
                    .border(1.dp, CosmosApp.Resources.brush(), detailShape)
                    .background(
                        MaterialTheme.colors.surface.copy(alpha = 0.8f),
                        detailShape,
                    ).padding(Dimensions.padding8)
                    .align(Alignment.TopStart),
        )

        Row(
            modifier = Modifier.padding(Dimensions.padding16).align(Alignment.TopEnd),
        ) {
            AnimatedVisibility(visible = countries.isNotEmpty(), enter = scaleIn(), exit = scaleOut()) {
                PopupButton(
                    "Visibilidade",
                    countries.map { CountryUtils.mapCountry(it) }.filter { it.isNotEmpty() },
                    painterResource(Res.drawable.ic_binocular),
                )
            }
            AnimatedVisibility(visible = extraInfo.isNotEmpty()) {
                PopupButton(
                    "Informações adicionais",
                    extraInfo,
                    painterResource(Res.drawable.more_horizontal),
                )
            }
        }

        Column(
            modifier =
                Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                MaterialTheme.colors.surface,
                            ),
                            tileMode = TileMode.Decal,
                        ),
                    ).padding(vertical = Dimensions.padding16),
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5,
                maxLines = 2,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(Dimensions.padding16),
            )

            Text(
                text = description,
                style = MaterialTheme.typography.body1,
                maxLines = if (showFullText) Int.MAX_VALUE else 3,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = Dimensions.padding16),
            )
        }
    }
}

@Composable
fun PopupButton(
    title: String,
    items: List<String>,
    icon: Painter,
    modifier: Modifier = Modifier,
) {
    Menu(modifier) {
        MenuButton(modifier = Modifier.clip(CircleShape)) {
            Icon(
                icon,
                contentDescription = title,
                modifier =
                    Modifier
                        .padding(horizontal = Dimensions.padding8)
                        .border(1.dp, CosmosApp.Resources.brush(), CircleShape)
                        .background(MaterialTheme.colors.surface.copy(alpha = 0.8f), CircleShape)
                        .padding(8.dp)
                        .size(24.dp),
                tint = MaterialTheme.colors.onBackground,
            )
        }

        MenuContent(
            Modifier
                .wrapContentWidth(align = Alignment.End)
                .defaultRadius()
                .border(1.dp, CosmosApp.Resources.brush(), RoundedCornerShape(CosmosApp.Resources.defaultRadius))
                .background(MaterialTheme.colors.surface.copy(alpha = 0.8f), RoundedCornerShape(CosmosApp.Resources.defaultRadius))
                .padding(Dimensions.padding16),
            hideTransition = scaleOut(),
            showTransition = scaleIn(),
        ) {
            Text(
                title,
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp),
            )
            items.forEach {
                Text(
                    it,
                    style = MaterialTheme.typography.subtitle2,
                    modifier = Modifier.padding(8.dp),
                )
            }
        }
    }
}
