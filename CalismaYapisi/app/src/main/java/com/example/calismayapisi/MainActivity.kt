package com.example.calismayapisi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calismayapisi.ui.screen.Anasayfa
import com.example.calismayapisi.ui.theme.CalismaYapisiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalismaYapisiTheme {
                Anasayfa()

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalismaYapisiTheme {
        Anasayfa()
    }
}