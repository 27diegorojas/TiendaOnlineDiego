package com.example.tiendaonlinediego

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendaonlinediego.model.Mensaje
import com.example.tiendaonlinediego.ui.theme.TiendaOnlineDiegoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //TiendaOnlineDiegoTheme
            TarjetaConMensaje(Mensaje("Diego" , cuerpo = "Bienvenido a la primera clase"))
        }
    }
}
@Composable
fun TarjetaConMensaje(mensaje: Mensaje){
    Row (modifier = Modifier.padding(all = 10.dp)){
        Image(painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Imagen de perfil",
            modifier= Modifier
                .size(size = 40.dp)
                .clip(CircleShape)

            )
        Spacer(modifier = Modifier.width(width = 10.dp))

        Column {
            Text(text = mensaje.autor)
            Spacer(modifier = Modifier.height(height = 7.dp))
            Text(text = mensaje.cuerpo)
        }

    }


}

@Preview
@Composable
fun VistaPreviaTarjetaConMensaje(){
    TarjetaConMensaje(Mensaje("Diego" , cuerpo = "Bienvenido a la primera clase"))


}