package theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.romauntgaolines
import com.ilustris.cosmos.resources.sf_pro
import org.jetbrains.compose.resources.Font

object Typo {

    @Composable
    fun headFontFamily() = FontFamily(Font(Res.font.romauntgaolines))

    @Composable
    fun defaultFontFamily() = FontFamily(Font(Res.font.sf_pro))

}