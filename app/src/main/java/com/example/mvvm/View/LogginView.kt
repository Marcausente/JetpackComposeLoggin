package com.example.mvvm.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.mvvm.R

@Composable
fun LogginView() {
    Box(Modifier.fillMaxSize().padding(16.dp)){
        Login(Modifier.align(Alignment.Center))
    }
}
//A la funcion de Login le estamos mandando el modificador para centrar, ya que Jetpack Compose nos pide estar dentro de un box para poner el modifier, pero al ser una funcion no lo detecta

@Composable
fun Login(modifier: Modifier) { //Recibimos el modifier heredado que le hemos mandado
    Column(modifier = modifier) {
        HeaderImage();
    }
}

@Composable
fun HeaderImage() {
    Image(painter = painterResource(id = R.drawable.wowlogo), contentDescription = "Header")
}

