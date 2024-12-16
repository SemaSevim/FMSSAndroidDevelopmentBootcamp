package com.example.kotlindersleri.degiskenler

fun main() {

    val yazi = "65"

    val sonuc =yazi.toIntOrNull()
    sonuc?.let{
        print(it)
    }
   /* if(sonuc != null ){
        println(sonuc)
    }else{
        print("Dönüşüm hatası")
    }*/
}