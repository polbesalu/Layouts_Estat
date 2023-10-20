package cat.institutmontilivi.class17_10_23

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.class17_10_23.Composable.Calculadora
import cat.institutmontilivi.class17_10_23.Composable.Combobox
import cat.institutmontilivi.class17_10_23.Composable.IntegerUpDown
import cat.institutmontilivi.class17_10_23.Composable.Selector
import cat.institutmontilivi.class17_10_23.ui.theme.Class17_10_23Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Class17_10_23Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 600, heightDp = 1200)
@Composable
fun GreetingPreview() {
    Class17_10_23Theme {
        var text by remember{mutableStateOf("Hola")}

        Column {
            TextField(
                value = text,
                onValueChange = {nouText -> text = nouText})
            Button(onClick = { text = "" }) {
                Text(text="Esborra")
            }
            IntegerUpDown(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
            )
            var textDiaSelec by remember{mutableStateOf("Dia triat:")}
            TextField(
                value = textDiaSelec,
                onValueChange = {nouText -> textDiaSelec = nouText})

            val dies = listOf("DG","DL","DM","DC","DJ","DV","DS")
            Selector(opcions = dies,
                modifier = Modifier
                    .align(CenterHorizontally),
                estilText = MaterialTheme.typography.titleLarge,
                onSeleccioChanged = {textSeleccionat: String,
                                     posicio: Int -> textDiaSelec = "Dia triat: " + textSeleccionat})

            Calculadora(modifier = Modifier
                .height(400.dp)
                .width(400.dp))

            Combobox(opcions = dies, onSeleccionChanged = {textSeleccionat: String,
                                                           posicio: Int -> textSeleccionat})
        }
    }
}
fun onClick (textSeleccionat: String, posicio:Int)
{
    //text = TextSeleccionat
}