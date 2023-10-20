package cat.institutmontilivi.class17_10_23.Composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.sp

@Preview(widthDp = 400, heightDp = 400)
@Composable
fun Calculadora(
    modifier: Modifier = Modifier,
    colorText:Color = MaterialTheme.colorScheme.onErrorContainer,
    colorFons:Color = MaterialTheme.colorScheme.tertiary,
    ColorFonsSegon:Color = MaterialTheme.colorScheme.errorContainer,
    ColorBotons:Color = MaterialTheme.colorScheme.errorContainer,
    ColorMarc:Color = MaterialTheme.colorScheme.onErrorContainer,
    GruixMarc:Int = 1,
    estilText: TextStyle = MaterialTheme.typography.displayLarge
) {

    var valor by remember{ mutableStateOf("0") }
    var memoria by remember{ mutableStateOf(0)}
    var editant by remember{ mutableStateOf(false)}
    var signe by remember{ mutableStateOf("")}

Column (
    modifier = modifier
        .padding(20.dp)
        .clip(RoundedCornerShape(percent = 5))
        .background(colorFons)
        .border(
            BorderStroke(
                width = GruixMarc.dp,
                color = ColorMarc
            ),
            shape = RoundedCornerShape(percent = 5))
){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(colorFons)
    )
    {
        Text(
            text = valor,
            modifier = Modifier
                .clip(RoundedCornerShape(percent = 15))
                .background(ColorFonsSegon)
                .fillMaxWidth()
                .height(40.dp)
                .border(BorderStroke(GruixMarc.dp, ColorMarc),
                    shape = RoundedCornerShape(percent = 15)),
            color = colorText,
            textAlign = TextAlign.End,
            fontSize = 25.sp,
            style = estilText
        )
        Row(
            modifier = Modifier
                .padding(10.dp)
        )
        {
            Column(modifier = Modifier.weight(1.5F))
            {
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "1"
                                editant = true
                            } else valor += "1"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "1",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText
                                )
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "2"
                                editant = true
                            } else valor += "2"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "2",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "3"
                                editant = true
                            } else valor += "3"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "3",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                }
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "4"
                                editant = true
                            } else valor += "4"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "4",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "5"
                                editant = true
                            } else valor += "5"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "5",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "6"
                                editant = true
                            } else valor += "6"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "6",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                }
                Row(
                    modifier = Modifier
                        .weight(3F)
                )
                {
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "7"
                                editant = true
                            } else valor += "7"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "7",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "8"
                                editant = true
                            } else valor += "8"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "8",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "9"
                                editant = true
                            } else valor += "9"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(4F)
                            .padding(5.dp)
                            .fillMaxHeight()
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "9",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                }
                Row()
                {
                    Button(
                        onClick = {
                            if (!editant) {
                                valor = "0"
                                editant = true
                            } else valor += "0"
                        },
                        colors = ButtonDefaults.buttonColors(ColorBotons),
                        modifier = Modifier
                            .weight(1F)
                            .padding(5.dp)
                            .height(80.dp)
                            .border(BorderStroke(GruixMarc.dp, ColorMarc),
                                shape = RoundedCornerShape(percent = 15)),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(text = "0",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = colorText,
                            style = estilText)
                    }
                }
            }
            Column(
                modifier = Modifier
                    .weight(0.5F)
            )
            {
                Button(
                    onClick = {
                        memoria = 0
                        valor = "0"
                        signe = ""
                    },
                    colors = ButtonDefaults.buttonColors(ColorBotons),
                    modifier = Modifier
                        .padding(5.dp)
                        .width(80.dp)
                        .height(80.dp)
                        .border(BorderStroke(GruixMarc.dp, ColorMarc),
                            shape = RoundedCornerShape(percent = 15)),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(text = "C",
                        modifier = Modifier,
                        fontSize = 15.sp,
                        color = colorText,
                        style = estilText)
                }
                Button(
                    onClick = {
                        memoria += valor.toInt()
                        editant = false
                        valor = memoria.toString()
                        signe = "+"
                    },
                    colors = ButtonDefaults.buttonColors(ColorBotons),
                    modifier = Modifier
                        .padding(5.dp)
                        .width(80.dp)
                        .height(80.dp)
                        .border(BorderStroke(GruixMarc.dp, ColorMarc),
                            shape = RoundedCornerShape(percent = 15)),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(text = "+",
                        modifier = Modifier,
                        fontSize = 15.sp,
                        color = colorText,
                        style = estilText)
                }
            }
            Column(
                modifier = Modifier
                    .weight(0.5F)
            )
            {
                Button(
                    onClick = {
                        if (signe.equals("+"))
                            valor = (memoria + valor.toInt()).toString()
                        else
                            valor = (memoria - valor.toInt()).toString()
                        editant = false
                        memoria = 0
                    },
                    colors = ButtonDefaults.buttonColors(ColorBotons),
                    modifier = Modifier
                        .padding(5.dp)
                        .width(80.dp)
                        .height(80.dp)
                        .border(BorderStroke(GruixMarc.dp, ColorMarc),
                            shape = RoundedCornerShape(percent = 15)),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(text = "=",
                        modifier = Modifier,
                        fontSize = 15.sp,
                        color = colorText,
                        style = estilText)
                }
                Button(
                    onClick = {
                        if (signe == "-") memoria += (valor.toInt())*-1
                        else memoria += (valor.toInt())
                        editant = false
                        valor = memoria.toString()
                        signe = "-"
                    },
                    colors = ButtonDefaults.buttonColors(ColorBotons),
                    modifier = Modifier
                        .padding(5.dp)
                        .width(80.dp)
                        .height(80.dp)
                        .border(BorderStroke(GruixMarc.dp, ColorMarc),
                            shape = RoundedCornerShape(percent = 15)),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(text = "-",
                        modifier = Modifier,
                        fontSize = 15.sp,
                        color = colorText,
                        style = estilText)
                }
            }
        }
    }
}
}

