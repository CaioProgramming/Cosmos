package features.education.data.model

import androidx.compose.ui.graphics.Color
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.AliceBlue
import com.chrynan.colors.extension.AquaBlue
import com.chrynan.colors.extension.CornflowerBlue
import com.chrynan.colors.extension.ForestGreen
import com.chrynan.colors.extension.IndianRed
import com.chrynan.colors.extension.Orange
import com.chrynan.colors.extension.OrangeRed
import com.chrynan.colors.extension.Purple
import com.chrynan.colors.extension.RebeccaPurple
import com.chrynan.colors.extension.SandyBrown
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.earth_ic
import com.ilustris.cosmos.resources.jupiter
import com.ilustris.cosmos.resources.mars
import com.ilustris.cosmos.resources.mercury
import com.ilustris.cosmos.resources.moon_24
import com.ilustris.cosmos.resources.neptune
import com.ilustris.cosmos.resources.saturn
import com.ilustris.cosmos.resources.uranus
import com.ilustris.cosmos.resources.venus
import features.education.data.model.PlanetResource.*
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

@Serializable
data class PlanetData(
    val title: String,
    val description: String,
    val earthDistance: Float,
    val sunDistance : Float,
    val temperature: Float,
    val yearDuration: Int,
    val resource: String,
    val rotationSpeed: Float,
) {
    val planetVector = PlanetResource.entries.first { it.name.equals(resource, true) }
    val planetColor = planetVector.getColor()
}

private fun PlanetResource.getColor(): com.chrynan.colors.Color {
    return when(this) {
        MERCURY -> com.chrynan.colors.Color.RebeccaPurple
        VENUS -> com.chrynan.colors.Color.OrangeRed
        EARTH -> com.chrynan.colors.Color.ForestGreen
        MARS -> com.chrynan.colors.Color.IndianRed
        JUPITER -> com.chrynan.colors.Color.Orange
        SATURN -> com.chrynan.colors.Color.SandyBrown
        URANUS -> com.chrynan.colors.Color.Purple
        NEPTUNE -> com.chrynan.colors.Color.CornflowerBlue
    }
}


enum class PlanetResource(val resource: DrawableResource = Res.drawable.moon_24) {
    MERCURY(Res.drawable.mercury),
    VENUS(Res.drawable.venus),
    EARTH(Res.drawable.earth_ic),
    MARS(Res.drawable.mars),
    JUPITER(Res.drawable.jupiter),
    SATURN(Res.drawable.saturn),
    URANUS(Res.drawable.uranus),
    NEPTUNE(Res.drawable.neptune),
}




