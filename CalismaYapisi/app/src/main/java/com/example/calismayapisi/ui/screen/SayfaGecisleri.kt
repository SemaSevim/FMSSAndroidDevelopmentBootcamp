package com.example.calismayapisi.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfa"){
        composable("detaySayfa/{sayac}",
            arguments = listOf(
                navArgument(name = "sayac"){type = NavType.IntType})){
            val gelenSayac = it.arguments?.getInt("sayac")
            DetaySayfa(sayac =gelenSayac!!)

        }
        composable("ayarlar"){
            Ayarla()
        }
    }


}
