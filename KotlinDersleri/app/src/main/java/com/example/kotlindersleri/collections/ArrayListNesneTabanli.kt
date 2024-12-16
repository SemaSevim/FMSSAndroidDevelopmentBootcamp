package com.example.kotlindersleri.collections

fun main() {
    val urun1 = Urunler(1, "Televizyon", 34000)
    val urun2 = Urunler(2, "Bilgisayar", 25000 )
    val urun3 = Urunler(3, "Anahtar", 300)

    val urunlerListesi = ArrayList<Urunler>()
    urunlerListesi.add(urun1)
    urunlerListesi.add(urun2)
    urunlerListesi.add(urun3)

    for(urun in urunlerListesi){
        println("--------------")
        println("${urun.id} ${urun.ad}  ${urun.fiyat}")
    }


    //Sort
    println("Fiyat : Artan")
    val siralama1 = urunlerListesi.sortedWith(compareBy{it.fiyat})
    for(urun in urunlerListesi) {
        println("--------------")
        println("${urun.id} ${urun.ad}  ${urun.fiyat}")
    }

        println("Fiyat : Azalan")
        val siralama2 = urunlerListesi.sortedWith(compareByDescending{it.fiyat})
        for(urun in urunlerListesi) {
            println("--------------")
            println("${urun.id} ${urun.ad}  ${urun.fiyat}")
        }

            println("Ad : Artan")
            val siralama3 = urunlerListesi.sortedWith(compareBy{it.ad })
            for(urun in urunlerListesi){
                println("--------------")
                println("${urun.id} ${urun.ad}  ${urun.fiyat}")
}

    println("Fiyat : Artan")
    val siralama4 = urunlerListesi.sortedWith(compareBy{it.fiyat})
    for(urun in urunlerListesi){
        println("--------------")
        println("${urun.id} ${urun.ad}  ${urun.fiyat}")

        }
    println("Filtreleme 1 ")
    val f1 = urunlerListesi.filter{it.fiyat > 10000 && it.fiyat < 30000}
    for(urun in f1){
        println("--------------")
        println("${urun.id} ${urun.ad}  ${urun.fiyat}")
    }




}

