package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String> ()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    meyveler.add("Amasya Elması")  //rastgele bir yere ekler. aynı ifadeyi kaydetmez
    println(meyveler)

    println(meyveler.elementAt(1))
    println("Boyut ${meyveler.size}")

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()


}