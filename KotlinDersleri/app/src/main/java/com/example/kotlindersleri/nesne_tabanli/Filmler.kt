package com.example.kotlindersleri.nesne_tabanli

class Filmler (var id:Int,
               var ad:String,
               var fiyat:Double ){

    init { //Constructor
        println("Filmler sınıfından nesne oluşturuldu")
      //bir class görüldüğü anda şu işlemi yap demek için bu kullanılır

    }

    fun bilgiAl(){
        println("-----------------------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat} ₺ ")
    }
//this : bulunduğu sayfayı temsil eder. swift(self)
//Side Effect: bir metod ile sınıf değişkenlerini değiştirmek.


}