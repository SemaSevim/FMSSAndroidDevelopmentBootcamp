package com.example.kotlindersleri.collections

fun main() {
    //Swift -> Dictionary
    //web tabanlı işlemlerde JSON modelinin karşılığı
    val iller = HashMap<Int, String>()
    iller.put(16,"Bursa")
    iller.put(34, "İstanbul")
    iller[6] = "Ankara"
    println(iller)

    println(iller.get(6))

    iller.put(16, "Bursa yeni")

    println("Boyut : ${iller.size}")

    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger ")
    }
}