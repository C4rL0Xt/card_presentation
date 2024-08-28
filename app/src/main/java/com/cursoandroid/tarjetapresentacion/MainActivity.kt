package com.cursoandroid.tarjetapresentacion

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cursoandroid.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Box (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray) // Cambia el color de fondo aquí
                        .padding(16.dp)
                ) {
                    UserName(fullName = "Carlos Espinoza", title = "Android Developer ")
                    UserData(phone = "+51 990574421", social = "@C4Rl0x" , email = "carlos.espinoza23@unmsm.edu.pe")
                }

            }
        }
    }
}

@Composable
fun UserName(fullName: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidphoto)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp) // Ajusta el padding si es necesario
    ) {
        // Contenedor para centrar el contenido en el centro de la pantalla
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                alpha = 0.8F,
                modifier = Modifier.size(100.dp) // Ajusta el tamaño de la imagen si es necesario
            )
            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el nombre
            Text(
                text = fullName,
                fontSize = 40.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el nombre y el título
            Text(
                text = title,
                fontSize = 13.sp,
                lineHeight = 14.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun UserData(phone: String, social: String, email: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.weight(1f))
        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Icon( imageVector = Icons.Rounded.Call, contentDescription = null )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = phone,
                        fontSize = 15.sp
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = social,  fontSize = 15.sp)
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Icon(imageVector = Icons.Rounded.Email, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = email, fontSize = 15.sp)
                }

                Spacer(modifier = Modifier.height(10.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        UserName(fullName = "Carlos Espinoza", title = "Android Developer ")
        UserData(phone = "+51 990574421", social = "@C4Rl0x" , email = "carlos.espinoza23@unmsm.edu.pe")
    }
}