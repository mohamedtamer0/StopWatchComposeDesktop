import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UI(
    formattedTime: String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(resourcePath = "stopwatch.png"), contentDescription = "stopwatch",
        modifier = Modifier.width(200.dp).height(200.dp))

        Text(text = formattedTime, fontSize = 37.sp, color = Color.White)
        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            IconButton(
                onStartClick,
                modifier = Modifier.size(48.dp).background(color = Color.DarkGray, shape = CircleShape)
            ) {
                Icon(
                    painter = painterResource(resourcePath = "start.svg"),
                    contentDescription = "Start",
                    tint = Color.Unspecified
                )
            }
            Spacer(Modifier.width(16.dp))
            IconButton(
                onPauseClick,
                modifier = Modifier.size(48.dp)
                    .background(
                        color = Color.DarkGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    painter = painterResource("pause.svg"),
                    contentDescription = "Pause",
                    tint = Color.Unspecified
                )
            }
            Spacer(Modifier.width(16.dp))
            IconButton(
                onResetClick,
                modifier = Modifier.size(48.dp)
                    .background(
                        color = Color.DarkGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    painter = painterResource("reset.svg"),
                    contentDescription = "Reset",
                    tint = Color.Unspecified
                )
            }
        }
    }
}