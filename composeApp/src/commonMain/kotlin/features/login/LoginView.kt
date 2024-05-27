package features.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import animations.Animation
import animations.createGradientAnimation
import animations.getAnimationString
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.AliceBlue
import com.chrynan.colors.extension.DarkBlue
import com.chrynan.colors.extension.DeepSkyBlue
import com.chrynan.colors.extension.RebeccaPurple
import io.github.alexzhirkevich.compottie.LottieAnimation
import io.github.alexzhirkevich.compottie.LottieCompositionSpec
import io.github.alexzhirkevich.compottie.LottieConstants
import io.github.alexzhirkevich.compottie.animateLottieCompositionAsState
import io.github.alexzhirkevich.compottie.rememberLottieComposition
import theme.CosmosIcon
import theme.CosmosTheme
import theme.getAppColors
import utils.blurryEdge

object LoginPage {
    val tag = "LoginPage"
}

@Composable
fun Login() {
    CosmosTheme(true) {
        Column(
            modifier = Modifier.background(Color.Black).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            var animationString by remember {
                mutableStateOf<String?>(null)
            }

            val sizeFraction = 0.8f
            val defaultRadius = RoundedCornerShape(10.dp)

            animationString?.let {
                val composition by rememberLottieComposition(LottieCompositionSpec.JsonString(it))

                val progress =
                    animateLottieCompositionAsState(
                        composition = composition,
                        iterations = LottieConstants.IterateForever,
                    )

                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.3f).blurryEdge()) {
                    LottieAnimation(
                        contentScale = ContentScale.Crop,
                        composition = composition,
                        progress = { progress.value },
                        modifier = Modifier
                            .fillMaxSize(),
                    )

                    CosmosIcon(
                        modifier =
                            Modifier
                                .createGradientAnimation(getAppColors())
                                .align(Alignment.BottomCenter),
                    )
                }
            }

            Text(
                "Bem-vindo ao Cosmos!",
                style = MaterialTheme.typography.h3.copy(color = Color.White),
                modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                textAlign = TextAlign.Center,
            )

            Text(
                "Sua jornada pelas estrelas começa aqui.",
                style = MaterialTheme.typography.body1.copy(color = Color.White),
                modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                textAlign = TextAlign.Center,
            )

            TextField(
                value = "",
                onValueChange = { /*TODO*/ },
                placeholder = {
                    Text("Digite seu e-mail")
                },
                colors =
                    TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.surface,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                    ),
                shape = defaultRadius,
                modifier = Modifier.fillMaxWidth(fraction = sizeFraction).padding(16.dp),
            )

            TextField(
                value = "",
                singleLine = true,
                onValueChange = { /*TODO*/ },
                placeholder = {
                    Text("Digite sua senha")
                },
                colors =
                    TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.surface,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                    ),
                shape = defaultRadius,
                modifier = Modifier.fillMaxWidth(fraction = sizeFraction).padding(16.dp),
            )

            val buttonColors =
                listOf(
                    com.chrynan.colors.Color.Companion.DarkBlue,
                    com.chrynan.colors.Color.Companion.AliceBlue,
                    com.chrynan.colors.Color.Companion.RebeccaPurple,
                    com.chrynan.colors.Color.Companion.DeepSkyBlue,
                ).map { it.toComposeColor() }

            Button(
                shape = defaultRadius,
                onClick = { /*TODO*/ },
                colors =
                    ButtonDefaults.outlinedButtonColors(
                        backgroundColor =
                            com.chrynan.colors.Color.Companion.RebeccaPurple
                                .toComposeColor(),
                        contentColor = Color.White,
                    ),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.fillMaxWidth(sizeFraction).padding(16.dp),
            ) {
                Text("Entrar")
            }

            Text("Esqueceu a senha?", style = MaterialTheme.typography.caption.copy(Color.White))

            Text(
                "Ou",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                style = MaterialTheme.typography.caption.copy(Color.White.copy(alpha = 0.4f)),
            )

            Button(
                shape = defaultRadius,
                onClick = { /*TODO*/ },
                colors =
                    ButtonDefaults.outlinedButtonColors(
                        backgroundColor = com.chrynan.colors.Color.Companion.DarkBlue.toComposeColor(),
                        contentColor = Color.White,
                    ),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.fillMaxWidth(sizeFraction).padding(16.dp),
            ) {
                Text("Entrar com Google")
            }

            Text(
                "Não tem uma conta? Cadastre-se agora!",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.caption.copy(Color.White.copy(alpha = 0.4f)),
            )

            LaunchedEffect(Unit) {
                animationString = getAnimationString(Animation.STARS)
            }
        }
    }
}
