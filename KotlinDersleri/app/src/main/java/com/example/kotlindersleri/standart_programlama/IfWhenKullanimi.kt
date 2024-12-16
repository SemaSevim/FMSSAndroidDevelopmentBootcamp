package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19
    val ad = "Ahmet"
    val ka = "admin"
    val s = 123
    val sayi = 10

    println(yas >= 18)

    if (yas >= 18) {
        println("Resitsiniz")
    }else {
        println("Resit değilsiniz")

    }

    if (ad == "Ahmet"){
        println("Merhaba Ahmet")
    }else if(ad == "Zeynep") {
        println("Merhaba Zeynep")
    }else{
        println("Tanınmayan Kişi")
    }


    if (ka == "admin" && s == 123){ // && ve (and) : true && true =true diğer durumlarda false olur

        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

    if (sayi == 10 || sayi == 11){ // veya (or) false || false = false olur diğer türlü true olur
        println("Sayı 10 veya 11 dir")
    }else{
        println("Sayı 10 veya 11 değildir")
    }

    //Switch case
    //Kotlinde When
    val x  = 1
    when (x){ //koşul değil x kıyaslanacak değer (menülerde kullanılıyordu)
        1 -> println("sayi 1dir")
        2 -> println("sayı 2 dir")
        else -> println("böyle bir sayı yok")
    }


}