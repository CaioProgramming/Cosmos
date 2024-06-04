package features.news.data.model

import features.home.data.model.DefaultCard
import kotlinx.serialization.Serializable

@Serializable
data class NewsData(
    val news: List<NewsInfo>
)


@Serializable
data class NewsInfo(
    val id: String,
    val pages: List<DefaultCard>,
     val reference: Reference
)

@Serializable
data class Reference(
    val author: String,
    val link: String
)