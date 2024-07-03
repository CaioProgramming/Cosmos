package features.education.data.model

import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.ic_andromeda
import com.ilustris.cosmos.resources.ic_cao_maior
import com.ilustris.cosmos.resources.ic_const
import com.ilustris.cosmos.resources.ic_hercules
import com.ilustris.cosmos.resources.ic_orion
import com.ilustris.cosmos.resources.ic_pegasus
import com.ilustris.cosmos.resources.ic_perseu
import com.ilustris.cosmos.resources.ic_ursa_maior
import com.ilustris.cosmos.resources.ic_ursa_menor
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

@Serializable
data class Constellation(
    val name: String = "",
    val description: String = "",
    val location: String = "",
    val nickNames: List<String> = emptyList(),
    val distance: Float = 0f,
    val magnitude: Float = 0f,
    val icon: ConstellationIcon,
)

enum class ConstellationIcon(val resource: DrawableResource = Res.drawable.ic_const) {
    URSA_MAJOR(Res.drawable.ic_ursa_maior),
    URSA_MINOR(Res.drawable.ic_ursa_menor),
    ORION(Res.drawable.ic_orion),
    HERCULES(Res.drawable.ic_hercules),
    PEGASUS(Res.drawable.ic_pegasus),
    PERSEU(Res.drawable.ic_perseu),
    ANDROMEDA(Res.drawable.ic_andromeda),
    CANIS_MAJOR(Res.drawable.ic_cao_maior)
}