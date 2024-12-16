package com.example.tasarimcalismasi

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScrollModifierNode
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasarimcalismasi.ui.theme.AnaRenk
import com.example.tasarimcalismasi.ui.theme.TasarimCalismasiTheme
import com.example.tasarimcalismasi.ui.theme.YaziRenk
import com.example.tasarimcalismasi.ui.theme.YaziRenk2
import com.example.tasarimcalismasi.ui.theme.pacifico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasarimCalismasiTheme {  //tema belirler
                Anasayfa()

                }
            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(){ //Compose fonksiyonları büyük harfle başlar
    val configuration = LocalConfiguration.current
    val ekranYuksekligi = configuration.screenHeightDp
    val ekranGenisligi = configuration.screenWidthDp


    Scaffold(topBar = { CenterAlignedTopAppBar(
        title = { Text("Pizza", fontFamily = pacifico) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = AnaRenk,
            titleContentColor = YaziRenk2
        )

    ) }) { paddingValues ->
        Column (modifier = Modifier.fillMaxSize().padding(paddingValues), verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){

            Text(stringResource(id = R.string.pizzaBaslik), color = AnaRenk, fontWeight = FontWeight.Bold, fontSize = 36.sp)
            Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "")

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

               /* MyChip(stringResource(id = R.string.peynirYazi)
                        MyChip(stringResource(id = R.string.sucukYazi),
                    MyChip(stringResource(id = R.string.zeytinYazi),
                        MyChip(stringResource(id = R.string.biberYazi)
        */
            }

            Text("20 min ", color = YaziRenk2, fontWeight = FontWeight.Bold, fontSize = 22.sp)
            Text("Delivery", color = AnaRenk, fontWeight = FontWeight.Bold, fontSize = 22.sp)
            Text("Meat lover, get ready to meet your pizza",
                color = YaziRenk2,  fontSize = 22.sp, textAlign = TextAlign.Center)

            Row (
                //left = start , ios ->leading
                //right = end , ios -> trailing
                modifier = Modifier.fillMaxWidth().padding(all = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically){
                Text("$ 5. 98", color = AnaRenk, fontWeight = FontWeight.Bold, fontSize = 44.sp)

                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = YaziRenk

                    )
                ) {
                    Text(text = "ADD TO CARD", fontSize = 18.sp)
                }
            }
        }

    }
}



@Preview(showBackground = true)  //önizleme (sağda)
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
        Anasayfa()
    }
}


@Composable
fun MyChip(icerik:String){
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = AnaRenk,
            contentColor = YaziRenk

        )
    ) {
        Text(text = icerik)
    }
}/* türkçe dil dosyası
           <string name="pizzaBaslik">Etli Peynirli</string>
   <string name="peynirYazi">Peynir</string><string name="sucukYazi">Sucuk</string>
    <string name="zeytinYazi">Zeytin</string>
    <string name="biberYazi">Biber</string>
    <string name="teslimatSure">20 dk</string>
    <string name="teslimatBaslik">Teslimat</string>
    <string name="pizzaAciklama">Et sever, pizzanla tanışmaya hazırlan !</string>
    <string name="fiyatYazi">174 ₺</string>
    <string name="buttonYazi">SEPETE EKLE</string> */