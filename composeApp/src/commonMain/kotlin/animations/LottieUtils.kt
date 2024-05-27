@file:OptIn(InternalResourceApi::class, InternalResourceApi::class, ExperimentalResourceApi::class)

package animations


import com.ilustris.cosmos.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.readResourceBytes

suspend fun getAnimationString(path: String) = Res.readBytes(path).decodeToString()
suspend fun getAnimationString(animation: Animation) = getAnimationString(animation.path)


enum class Animation(val path: String) {
    STARS("files/sky_stars.json"),
}