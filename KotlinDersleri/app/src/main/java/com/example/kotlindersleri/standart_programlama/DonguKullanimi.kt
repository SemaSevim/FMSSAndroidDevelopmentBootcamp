package com.example.kotlindersleri.standart_programlama

fun main() {
    //for each döngüsü
    //1,2,3  i =indeks , veri kümesi
    for(i in 1..3){ //swift: 1...3
        println("Döngü 1 : $i")

    }
    var sayac = 1
    while (sayac < 4){
        println("Döngü 2 : $sayac")
        sayac++
    }


    //10 ile 20 arasında 5er artsın
    for (a in 10..20 step 5 ){
        println("Döngü 3 : $a")
    }

    //20 ile 10 arasında 5 er azalsın
    for (a in 20 downTo 10 step 5){
        println("Döngü 4 : $a")
    }

    for (i in 1..5){
        if ( i ==3){
            break //durdurur
        }
        println("Döngü 5 : $i")
    }
    for (i in 1..5){
        if ( i == 3){
            continue //3ü pas geç
        }
        println("Döngü 6 : $i")
    }

}
/*
sınıf class bir taslak
bu yapıdan türetilen yapıya nesne denir

 */