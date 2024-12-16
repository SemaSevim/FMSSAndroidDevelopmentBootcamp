package com.example.kotlindersleri.nesne_tabanli

fun main() {
    ucret(adet = 43,Konserve.ORTA)

}

fun ucret(adet:Int , boyut:Konserve){
    when(boyut){
        Konserve.KUCUK -> println("Ücret: ${adet+22} ₺")
        Konserve.ORTA -> println("Ücret: ${adet+56} ₺")
        Konserve.BUYUK -> println("Ücret: ${adet+78} ₺")
    }

}