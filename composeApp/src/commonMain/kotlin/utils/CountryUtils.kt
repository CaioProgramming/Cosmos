package utils

object CountryUtils {
    fun mapCountry(country: String): String {
        return when (country.uppercase()) {
            "BR" -> "🇧🇷 Brasil"
            "ARG" -> "🇦🇷 Argentina"
            "CHIL" -> "🇨🇱 Chile"
            "URU" -> "🇺🇾 Uruguai"
            "COL" -> "🇨🇴 Colombia"
            "WW" -> "🌎 Mundial"
            else -> ""
        }.trim()
    }
}
