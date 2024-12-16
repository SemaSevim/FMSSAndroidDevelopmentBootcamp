package com.example.calismayapisi.ui.screen

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable

fun BottomBarSayfa(){
    Scaffold (
        bottomBar = {
            BottomAppBar (content = {
                NavigationBarItem(
                    selected = false,
                    onClick = { },
                    label = { Text(text = "Anasayfa") }
                    icon
                )
            })
        }
    )
}