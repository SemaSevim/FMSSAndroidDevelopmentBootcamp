package com.example.odev3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odev3.ui.theme.AnaRenk
import com.example.odev3.ui.theme.AnaRenk1
import com.example.odev3.ui.theme.Odev3Theme
import com.example.odev3.ui.theme.Pembe
import com.example.odev3.ui.theme.Renk1
import com.example.odev3.ui.theme.Renk2
import com.example.odev3.ui.theme.pacifico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev3Theme {
                Anasayfa()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Petshop", fontFamily = pacifico) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = AnaRenk,
                    titleContentColor = Renk2
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Find needs of your beloved animal here", color = Renk2, fontWeight = FontWeight.Bold, fontSize = 36.sp )
            Image(painter = painterResource( id =  R.drawable.kopek), contentDescription = "",
                modifier = Modifier.clip(RoundedCornerShape(16.dp)))
            Text(text = "Get attractive promos here, immediately just register your account to fulfill the best needs for your beloved pet.",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 8.dp) )

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = AnaRenk)
                ){
                    Text(text = "Get Started", color = Color.White, fontSize = 18.sp)
                }

                ClickableText(
                    text = AnnotatedString("Already have an account? Login"),
                    onClick = {},
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color(0xFF007BFF),
                        fontSize = 14.sp
                    )
                )
                  /*  colors = ButtonColors(
                        containerColor = Pembe


                    ) { Text( text = "Get Started" ) }*/

            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Odev3Theme {
        Anasayfa()
    }
}
