package features.education.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PlanetsResponse(
    val planets: List<PlanetData>
)
