package com.example.kotlindersleri.degiskenler

import com.example.kotlindersleri.nesne_tabanli.ucret

fun main() {

    aciHesapla(5)
    maasHesabi(20)
    otoparkUcreti(5)
    kmToMile(5.0)
    alanHesapla(4,2)
    faktoriyelHesapla(5)
    findE("heyheye")

}

fun aciHesapla(kenarSayisi: Int){
    if (kenarSayisi < 3){
        println("Kenar sayısı 3'den büyük olmalı")
    }else {
        println("İç açılar toplamı = ${((kenarSayisi -2 ) * 180 ) /kenarSayisi}")

    }
}

fun maasHesabi(gunSayisi: Int){
    var mesaiSaat =0
    var calismaSaat = 0

    var toplamSaat = gunSayisi * 8
    if(toplamSaat >= 150 ){
        calismaSaat = 150 * 40
        mesaiSaat = (toplamSaat - 150) * 80
    }else{
        calismaSaat = toplamSaat * 40
    }
    println("Maaş hesabı = ${ mesaiSaat + calismaSaat} ₺")
}

fun otoparkUcreti(saat: Int){
    var ilkSaat = 50
    var ekSaat = 10
    if(saat > 1){
        println("ücret = ${ilkSaat + (saat - 1 ) * ekSaat}")

    }else{
        println("ücret = $ilkSaat")
    }
}

fun kmToMile(km: Double){
    println("Mile = ${km * 0.621}")

}

fun alanHesapla(kenar1: Int, kenar2: Int){
    println ("Dikdörtgenin alanı : ${ kenar1*kenar2 }")
}

fun faktoriyelHesapla(sayi : Int){
    var sonuc = 1
    if(sayi<0){
        println("Negatif sayıların faktöriyeli hesaplanamaz")
    }
    else{
        for (i in 1..sayi){
             sonuc *= i
        }
    }
    println("$sayi 'nın faktöriyeli : $sonuc")
}

fun findE(kelime: String) {
    var sayac = 0
    for(char in kelime){
        if(char == 'e' || char == 'E' ){
            sayac ++
        }
    }
    println("Kelimedeki E sayısı: $sayac")
}
