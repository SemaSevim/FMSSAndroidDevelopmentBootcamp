package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    meyveler.add("Elma") //0. indeks
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    //Update
    meyveler[1]= "Yeni muz"

    //Insert
    meyveler.add(1,"portakal")
    println(meyveler)

    println(meyveler.get(2))
    println(meyveler[1])

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for(meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)


}