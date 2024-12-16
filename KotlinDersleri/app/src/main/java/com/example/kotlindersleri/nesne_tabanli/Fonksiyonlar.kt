package com.example.kotlindersleri.nesne_tabanli

class Fonksiyonlar {

    var yazi = "Merhaba"
    var metin: String? = null
    lateinit var text:String


    //IOS: protocol(ınterface) tabanlıdır , swift
    //Android : fonksiyon(metod) tabanlıdır , kotlin
    //void: geri dönüş değeri olmayan

    fun selamla1(){ //Swift(func)
        val sonuc  = "Merhaba Ahmet"
        println(sonuc)
    }

    //return: geri dönüş değeri olan
    fun selamla2() : String{ //Swift(func)
        val sonuc  = "Merhaba Ahmet"
        return sonuc
    }

    //parametreli
    fun selamla3(ad: String){ //Swift(func)
        val sonuc  = "Merhaba $ad"
        println(sonuc)
    }

    //overloading
    fun topla(sayi1: Int, sayi2: Int){
        println("Sonuç ${sayi1+sayi2}")
    }
    fun topla(sayi1:Double, sayi2:Double){
        println("Sonuç ${sayi1+sayi2}")
    }
    fun topla(sayi1: Int, sayi2: Int, ad: String){
        println("Sonuç ${sayi1+sayi2} $ad")
    }

}