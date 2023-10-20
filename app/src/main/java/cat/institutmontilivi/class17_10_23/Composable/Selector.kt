package cat.institutmontilivi.class17_10_23.Composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.channels.Selector

@Preview(showBackground = true)
@Composable
fun PreviewSelector()
{
    val dies = listOf("DG","DL","DM","DC","DJ","DV","DS")
    //Selector(dies,{((String, Int) -> {}) },0)
}


@Composable
fun Selector(modifier: Modifier = Modifier,
             opcions: List<String>,
             onSeleccioChanged:((String,Int) -> Unit),
             opcioInicial:Int = 0,
             colorText:Color = MaterialTheme.colorScheme.onTertiary,
             colorTextSeleccionat:Color = MaterialTheme.colorScheme.tertiary,
             colorFons:Color = MaterialTheme.colorScheme.tertiary,
             ColorBotons:Color = MaterialTheme.colorScheme.errorContainer,
             ColorMarc:Color = MaterialTheme.colorScheme.onErrorContainer,
             GruixMarc:Int = 1,
             estilText: TextStyle = MaterialTheme.typography.displayMedium)
{
    var opcioSeleccionada by remember{ mutableStateOf(0)}

    Row(
        modifier = modifier
            .padding(5.dp)
    ){
        opcions.mapIndexed { index, valor ->
                Text(valor,
                    color = if(index == opcioSeleccionada) colorTextSeleccionat
                    else colorText,
                    modifier = Modifier
                        .clip(RoundedCornerShape(percent = 15))
                        .background(
                            color = if(index == opcioSeleccionada) ColorBotons
                            else colorFons)
                        .clickable {
                            opcioSeleccionada = index
                            onSeleccioChanged(opcions[opcioSeleccionada], opcioSeleccionada)
                        }
                        .border(BorderStroke(width = GruixMarc.dp, ColorMarc),
                            shape = RoundedCornerShape(percent = 15))
                        .padding(5.dp),
                    style = estilText,)
        }

    }
}