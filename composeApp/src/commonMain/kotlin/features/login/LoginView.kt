package features.login

import LocalNavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.AliceBlue
import com.chrynan.colors.extension.DarkBlue
import com.chrynan.colors.extension.DeepSkyBlue
import com.chrynan.colors.extension.RebeccaPurple
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.google_multicolor_24
import com.ilustris.cosmos.resources.login_illust
import org.jetbrains.compose.resources.painterResource
import theme.CosmosApp

@Composable
fun LoginView(navController: NavController = LocalNavController.current) {
    fun navigateToHome() {
        CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Home, navController)
    }

    Column(
        modifier = Modifier.padding(vertical = 32.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        val sizeFraction = 0.8f
        val defaultRadius = RoundedCornerShape(10.dp)

        Image(
            painterResource(Res.drawable.login_illust),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f),
        )

        Text(
            "Bem-vindo ao",
            style = MaterialTheme.typography.subtitle2.copy(color = Color.White.copy(alpha = 0.4f)),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        Text(
            "Cosmos".uppercase(),
            style = MaterialTheme.typography.h2.copy(color = Color.White, fontWeight = FontWeight.Normal, letterSpacing = 8.sp),
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp, top = 0.dp),
            textAlign = TextAlign.Center,
            fontFamily = CosmosApp.Typo.headFontFamily(),
        )

        Text(
            "Sua jornada pelas estrelas começa aqui.",
            style = MaterialTheme.typography.body1.copy(color = Color.White),
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            textAlign = TextAlign.Center,
        )

        val textFieldSettings =
            TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            )

        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            placeholder = {
                Text("Digite seu e-mail", color = Color.Black.copy(alpha = 0.4f))
            },
            colors = textFieldSettings,
            shape = defaultRadius,
            modifier = Modifier.fillMaxWidth(fraction = sizeFraction).padding(vertical = 8.dp),
        )

        TextField(
            value = "",
            singleLine = true,
            onValueChange = { /*TODO*/ },
            placeholder = {
                Text("Digite sua senha", color = Color.Black.copy(alpha = 0.4f))
            },
            colors = textFieldSettings,
            shape = defaultRadius,
            modifier = Modifier.fillMaxWidth(fraction = sizeFraction).padding(vertical = 8.dp),
        )

        val buttonColors =
            listOf(
                com.chrynan.colors.Color.Companion.DarkBlue,
                com.chrynan.colors.Color.Companion.AliceBlue,
                com.chrynan.colors.Color.Companion.RebeccaPurple,
                com.chrynan.colors.Color.Companion.DeepSkyBlue,
            ).map { it.toComposeColor() }
        Text("Esqueceu a senha?", style = MaterialTheme.typography.body1.copy(Color.White), modifier = Modifier.padding(8.dp))

        Button(
            shape = defaultRadius,
            onClick = { navigateToHome() },
            colors =
                ButtonDefaults.outlinedButtonColors(
                    backgroundColor =
                        com.chrynan.colors.Color.Companion.RebeccaPurple
                            .toComposeColor(),
                    contentColor = Color.White,
                ),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.fillMaxWidth(sizeFraction).padding(vertical = 8.dp),
        ) {
            Text("Entrar")
        }

        Row(
            modifier = Modifier.fillMaxWidth(sizeFraction),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier =
                    Modifier
                        .padding(4.dp)
                        .height(1.dp)
                        .width(100.dp)
                        .background(Color.White),
            )
            Text(
                "Ou",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.caption.copy(Color.White),
            )
            Box(
                modifier =
                    Modifier
                        .padding(4.dp)
                        .height(1.dp)
                        .width(100.dp)
                        .background(Color.White),
            )
        }

        Button(
            shape = defaultRadius,
            onClick = { /*TODO*/ },
            colors =
                ButtonDefaults.outlinedButtonColors(
                    backgroundColor = MaterialTheme.colors.onBackground,
                ),
            contentPadding = PaddingValues(12.dp),
            modifier = Modifier.padding(8.dp),
        ) {
            Image(
                painterResource(Res.drawable.google_multicolor_24),
                contentDescription = null,
                modifier = Modifier.size(24.dp),
            )
        }

        Text(
            "Não tem uma conta? Cadastre-se agora!",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.caption.copy(Color.White.copy(alpha = 0.4f)),
        )
    }
}
