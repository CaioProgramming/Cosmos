package theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.romauntgaolines
import com.ilustris.cosmos.resources.sf_pro
import org.jetbrains.compose.resources.Font

object Typo {

    @Composable
    fun headFontFamily() = FontFamily(Font(Res.font.romauntgaolines))

    @Composable
    fun defaultFontFamily() = FontFamily(Font(Res.font.sf_pro))


    @Composable
    fun cosmoTypography() = MaterialTheme.typography.copy(
        h1 = MaterialTheme.typography.h1.copy(fontFamily = headFontFamily(), fontWeight = FontWeight.W400),
        h2 = MaterialTheme.typography.h2.copy(fontFamily = headFontFamily(), fontWeight = FontWeight.SemiBold),
        h3 = MaterialTheme.typography.h3.copy(fontWeight = FontWeight.Medium),
        h4 = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.W500),
        h5 = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.W800),
        h6 = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.W600),
        body1 = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Normal),
        body2 = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Thin),
        subtitle1 = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Normal),
        subtitle2 = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Light),
    )

}