package features.education.presentation

import features.education.data.model.Constellation
import features.education.data.model.PlanetData

sealed class PlanetsState {

    data object Loading : PlanetsState()

    data class Error(val message: String) : PlanetsState()

    data class Success(val planets: List<PlanetData>, val constellations: List<Constellation>) : PlanetsState()


}