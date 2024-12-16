package com.example.kotlindersleri

fun main() {
    //1. Compile Error : Derleme Hatası
    val x = 10
    //x = 30

    //Runtime Error (Exception)
    val a = 10
    val b = 5

    try{
        println("Sonuç ${a/b}")
        println("İşlem bitti")

    }catch(e:Exception){
        println("Sıfıra bölme hatası")
    }
//sonraki derse kadar kotlini tekrar et genel tekrar.
//tasarım

}