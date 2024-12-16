package com.example.kotlindersleri.nesne_tabanli

fun main() {
    val sonuc = 5.carp(2)
    println("Sonuç : $sonuc")
}

infix fun Int.carp(sayi:Int) : Int{
    return this * sayi

}