package com.example.calismayapisi.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Anasayfa(navController: NavController){

    val sayac = remember { mutableStateOf(0) }
    LaunchedEffect(true) {
        Log.e("Anasayfa", "Launceffect Çalıştı")
        //Sayfa her görüldüüğünde çalışır
        //sayfaya geri dönüldüğünde çalışır
    }
    DisposableEffect(Unit) {
        onDispose { Log.e("Anasayfa", "Launceffect Çalıştı") }
    }




    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Anasayfa" , fontSize = 30.sp)
        Text(text = "Sayaç: ${sayac.value}" , fontSize = 30.sp)
        Button(onClick = {
            sayac.value = sayac.value + 1
            /*if(sayac.value == 10){
                print

            }*/
        }){
            Text(text = "Tıkla")
        }
        Button(onClick = {
            navController.navigate("detaySayfa/${sayac.value*2}")
          //  popUpTo("anasayfa") {inclusive = true}
        }){
            Text(text = "Detay")
        }



    }
}