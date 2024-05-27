package utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.dp

@Composable
fun Modifier.blurryEdge() = blur(1.dp, 1.dp, edgeTreatment = BlurredEdgeTreatment.Rectangle)
