package features.events.ui.components

import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
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
import theme.Corners
import theme.defaultRadius
import utils.CountryUtils
import utils.DateFormats

@Composable
fun EventCard(
    title: String,
    description: String,
    date: String,
    imageURL: String,
    onClick: () -> Unit = {},
) {
    val dateText by remember {
        val parsedDate = LocalDate.parse(date)
        mutableStateOf(DateFormats.DD_MM.localDateFormat?.format(parsedDate) ?: "")
    }

    Column(
        modifier =
            Modifier
                .padding(16.dp)
                .width(300.dp)
                .defaultRadius()
                .background(MaterialTheme.colors.surface)
                .clickable {
                    onClick()
                },
    ) {
        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .defaultRadius(),
        ) {
            KamelImage(
                resource = asyncPainterResource(imageURL),
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(4.dp)
                        .defaultRadius(),
            )
            Text(
                text = buildAnnotatedString { append(dateText) },
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.W600),
                modifier =
                    Modifier
                        .clip(
                            RoundedCornerShape(
                                topStart = 0.dp,
                                topEnd = 0.dp,
                                bottomStart = Corners.large,
                                bottomEnd = Corners.large,
                            ),
                        ).background(MaterialTheme.colors.surface)
                        .padding(4.dp)
                        .background(
                            MaterialTheme.colors.primary,
                            shape = RoundedCornerShape(Corners.small),
                        ).padding(8.dp),
            )
        }
        Text(
            text = title,
            style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
            maxLines = 2,
            modifier = Modifier.fillMaxWidth().padding(16.dp),
        )

        Text(
            text = description,
            style = MaterialTheme.typography.body1,
            maxLines = 3,
            modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        )
    }
}

@Composable
fun EventLargeCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    date: String,
    imageURL: String,
    countries: List<String>,
    extraInfo: List<String>,
) {
    val dateText by remember {
        val parsedDate = LocalDate.parse(date)
        mutableStateOf(
            DateFormats.DD_OF_MMM.localDateFormat?.let {
                parsedDate.format(it)
            } ?: "",
        )
    }

    Column(
        modifier =
            modifier
                .padding(16.dp)
                .defaultRadius()
                .background(MaterialTheme.colors.surface),
    ) {
        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(400.dp),
        ) {
            KamelImage(
                resource = asyncPainterResource(imageURL),
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(4.dp)
                        .defaultRadius(),
            )
            Text(
                text = dateText,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.W600),
                modifier =
                    Modifier
                        .clip(
                            RoundedCornerShape(
                                topStart = 0.dp,
                                topEnd = 0.dp,
                                bottomStart = Corners.medium,
                                bottomEnd = Corners.medium,
                            ),
                        ).background(MaterialTheme.colors.surface)
                        .padding(4.dp)
                        .background(
                            MaterialTheme.colors.primary,
                            shape = RoundedCornerShape(Corners.extraLarge),
                        ).padding(8.dp),
            )

            Row(
                modifier =
                    Modifier
                        .padding(16.dp)
                        .align(Alignment.TopEnd),
            ) {
                PopupButton(
                    "Visibilidade",
                    countries.map { CountryUtils.mapCountry(it) }.filter { it.isNotEmpty() },
                    painterResource(Res.drawable.ic_binocular),
                )
                PopupButton(
                    "Informações adicionais",
                    extraInfo,
                    painterResource(Res.drawable.more_horizontal),
                )
            }
        }

        Text(
            text = title,
            style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold),
            maxLines = 2,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
        )

        Text(
            text = description,
            style = MaterialTheme.typography.body1,
            maxLines = 3,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).fillMaxWidth(),
        )
    }
}

@Composable
fun PopupButton(
    title: String,
    items: List<String>,
    icon: Painter,
    modifier: Modifier = Modifier,
) {
    Menu(modifier.padding(8.dp)) {
        MenuButton(modifier = Modifier.clip(CircleShape)) {
            Icon(
                icon,
                contentDescription = title,
                modifier =
                    Modifier
                        .background(MaterialTheme.colors.surface.copy(alpha = 0.6f), CircleShape)
                        .padding(8.dp)
                        .size(24.dp),
                tint = MaterialTheme.colors.onBackground,
            )
        }

        MenuContent(
            Modifier
                .wrapContentWidth(align = Alignment.End)
                .defaultRadius()
                .background(MaterialTheme.colors.background)
                .padding(8.dp),
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

@Composable
fun ExtraDataCard(
    icon: ImageVector,
    title: String,
    extraData: List<String>,
    isVertical: Boolean = false,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .defaultRadius()
                .background(MaterialTheme.colors.primary.copy(alpha = 0.8f)),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .padding(
                        horizontal = 16.dp,
                        vertical = 8.dp,
                    ),
        ) {
            Icon(
                icon,
                contentDescription = null,
                modifier =
                    Modifier.size(24.dp).align(
                        Alignment.CenterVertically,
                    ),
                tint = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
            )

            Text(
                title,
                style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
                modifier = Modifier.padding(4.dp),
            )
        }

        val listModifier = Modifier.padding(8.dp)

        if (isVertical) {
            LazyColumn(modifier = listModifier) {
                items(extraData.size) {
                    Text(extraData[it], style = MaterialTheme.typography.subtitle1)
                }
            }
        } else {
            LazyRow(modifier = listModifier) {
                items(extraData.size) {
                    Text(extraData[it], style = MaterialTheme.typography.subtitle1)
                }
            }
        }
    }
}

@Composable
fun ExtraDataCard(
    icon: Painter,
    title: String,
    extraData: List<String>,
    isVertical: Boolean = false,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .defaultRadius()
                .background(MaterialTheme.colors.primary.copy(alpha = 0.8f)),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .padding(
                        horizontal = 16.dp,
                        vertical = 8.dp,
                    ),
        ) {
            Icon(
                icon,
                contentDescription = null,
                modifier =
                    Modifier.size(24.dp).align(
                        Alignment.CenterVertically,
                    ),
                tint = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
            )

            Text(
                title,
                style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
                modifier = Modifier.padding(4.dp),
            )
        }

        val listModifier = Modifier.padding(8.dp)

        if (isVertical) {
            LazyColumn(modifier = listModifier) {
                items(extraData.size) {
                    Text(extraData[it], style = MaterialTheme.typography.body1)
                }
            }
        } else {
            LazyRow(modifier = listModifier) {
                items(extraData.size) {
                    Text(extraData[it], style = MaterialTheme.typography.h4)
                }
            }
        }
    }
}

@Composable
fun EventExtraInfo(extraInfo: List<String>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .defaultRadius()
                .background(MaterialTheme.colors.primary.copy(alpha = 0.8f)),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier
                    .padding(
                        horizontal = 16.dp,
                        vertical = 8.dp,
                    ),
        ) {
            Icon(
                Icons.Rounded.Info,
                contentDescription = null,
                modifier =
                    Modifier.size(24.dp).align(
                        Alignment.CenterVertically,
                    ),
                tint = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
            )

            Text(
                "Informações adicionais",
                style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.6f),
                modifier = Modifier.padding(4.dp),
            )
        }

        LazyColumn(modifier = Modifier.padding(vertical = 8.dp)) {
            items(extraInfo.size) {
                Text(extraInfo[it], style = MaterialTheme.typography.subtitle1)
            }
        }
    }
}

@Composable
fun CountryItem(country: String) {
    Text(CountryUtils.mapCountry(country), style = MaterialTheme.typography.h5, modifier = Modifier.padding(horizontal = 4.dp))
}
