package cat.institutmontilivi.class17_10_23.Composable

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
fun ShowComposable(){
    IntegerUpDown()
}


@Composable
fun IntegerUpDown(
    modifier: Modifier = Modifier,
    colorText:Color = MaterialTheme.colorScheme.onTertiary,
    colorFons:Color = MaterialTheme.colorScheme.tertiary,
    ColorBotons:Color = MaterialTheme.colorScheme.errorContainer,
    ColorMarc:Color = MaterialTheme.colorScheme.onErrorContainer,
    GruixMarc:Int = 1,
    estilText: TextStyle = MaterialTheme.typography.displayLarge
)
{
    var valor by remember{ mutableStateOf(0)}
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(percent = 5))
            .background(color = colorFons)
            .border(BorderStroke(
                width = GruixMarc.dp,
                color = ColorMarc),
                shape = RoundedCornerShape(percent = 5))
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ){
            Text(text = valor.toString(),
                modifier = Modifier
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                style = estilText,
                color = colorText
            )
        }


        Row(){
            IconButton(onClick = {
                if (valor > 0)
                    valor--},
                modifier = Modifier
                    .weight(1F)
                    .padding(4.dp)
                    .clip(RoundedCornerShape(percent = 15))
                    .background(color = ColorBotons)
                    .border(
                        border = BorderStroke(width = GruixMarc.dp,
                            color = ColorMarc),
                        shape = RoundedCornerShape(percent = 15)
                    )) {
                Icon(Icons.Default.Remove,
                    contentDescription = "Decrementa el comptador",
                    )
            }
            IconButton(onClick = { valor++ },
                modifier = Modifier
                    .weight(1F)
                    .padding(4.dp)
                    .clip(RoundedCornerShape(percent = 15))
                    .background(color = ColorBotons)
                    .border(
                        border = BorderStroke(width = GruixMarc.dp,
                            color = ColorMarc),
                        shape = RoundedCornerShape(percent = 15)
                    )) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Incrementa el comptador"
                    )
            }
        }
    }
}