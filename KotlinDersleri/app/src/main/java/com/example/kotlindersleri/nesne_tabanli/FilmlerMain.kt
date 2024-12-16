package com.example.kotlindersleri.nesne_tabanli

fun main() {
    //Nesne oluşturma
    val film1 = Filmler(1,"Django",78.99)
    film1.bilgiAl()
    //Değer atama
    film1.fiyat = 99.99

    val film2 = Filmler(2,"Inception", 45.99)
    film2.bilgiAl()
}