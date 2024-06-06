package theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp


    @Composable
    fun Modifier.shapeRadius5() = clip(RoundedCornerShape(5.dp))

    @Composable
    fun Modifier.shapeRadius10() = clip(RoundedCornerShape(10.dp))

    @Composable
    fun Modifier.shapeRadius15() = clip(RoundedCornerShape(15.dp))

    @Composable
    fun Modifier.shapeRadius20() = clip(RoundedCornerShape(20.dp))


object Shapes {
    val small = 5.dp
    val medium = 10.dp
    val large = 15.dp
    val extraLarge = 20.dp
}