package cat.institutmontilivi.class17_10_23.Composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ComboPreview()
{
    val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
    Combobox(opcions = dies, onSeleccionChanged =  { String, Int ->{}}, opcioInicial =  1)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Combobox(
    modifier: Modifier = Modifier,
    opcions:List<String>,
    onSeleccionChanged:((String, Int)->Unit),
    opcioInicial:Int=0,
    colorText:Color = MaterialTheme.colorScheme.onTertiary,
    colorTextSeleccionat:Color = MaterialTheme.colorScheme.tertiary,
    colorFons:Color = MaterialTheme.colorScheme.tertiary,
    ColorBotons:Color = MaterialTheme.colorScheme.errorContainer,
    ColorMarc:Color = MaterialTheme.colorScheme.onErrorContainer,
    GruixMarc:Int = 1,
    estilText: TextStyle = MaterialTheme.typography.bodyMedium) {
    var opcioSelect by remember {
        mutableStateOf(opcioInicial)
    }
    var desplegat by remember {
        mutableStateOf(false)
    }
    Column() {
        Row(
            modifier = modifier
                .clip(RoundedCornerShape(percent = 15))
                .background(colorFons)
                .width(300.dp)
                .border(BorderStroke(width = GruixMarc.dp, ColorMarc),
                    shape = RoundedCornerShape(percent = 15))
        )
        {
            TextField(
                value = opcions[opcioSelect],
                onValueChange = { null },
                modifier = Modifier
                    .background(colorFons)
                    .weight(4F),
                textStyle = estilText
            )

            IconButton(onClick = { desplegat = !desplegat }) {
                Icon(
                    if (!desplegat)  Icons.Default.KeyboardArrowLeft
                    else  Icons.Default.KeyboardArrowDown,
                    modifier = Modifier
                        .background(colorFons)
                        .align(Alignment.CenterVertically)
                        .weight(1F),
                    contentDescription = "Desplega opcions"
                )
            }

        }
        if (desplegat)
        {
            Column(
                modifier = Modifier
                    .background(ColorBotons)
            ) {
                opcions.mapIndexed{index, valor-> Text(valor,
                    modifier = Modifier
                        .clip(RoundedCornerShape(percent = 15))
                        .width(300.dp)
                        .padding(5.dp)
                        .background(color =
                        if (index == opcioSelect) colorFons else ColorBotons)
                        .clickable { opcioSelect=index
                            desplegat = false
                            onSeleccionChanged(opcions[opcioSelect],opcioSelect)},
                    color =
                    if (index == opcioSelect){
                        colorText
                    }
                    else Color.Black,
                    style = estilText)
                }
            }
        }
    }
}