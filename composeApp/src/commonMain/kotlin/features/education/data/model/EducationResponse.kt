package features.education.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EducationResponse(
    val planets: List<PlanetData>,
    val constellations: List<Constellation>
)
