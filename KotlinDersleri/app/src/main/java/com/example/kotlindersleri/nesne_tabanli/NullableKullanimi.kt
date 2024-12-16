package com.example.kotlindersleri.nesne_tabanli

fun main(){
    //nullable - null safety- optional (swift)

    //Tanımlama ? : içerisinde null barındırıyor dikaktli kullan demek
    var yazi:String? = null
    yazi = "Merhaba"

    //yöntem1
    println("Yöntem 1 : ${yazi?.uppercase()}")
    //? yazının içerisinde null varsa uygulama çökmez

    //yöntem 2
    //println("Yöntem 2: ${yazi!!.uppercase()}")

    //yöntem3
    if (yazi != null){
        println("Yöntem 3 : ${yazi.uppercase()}")
    }else{
        println("Sonuç nulldur")
    }

    //yöntem 4
    yazi?.let{
        println("Yöntem 4 : ${yazi.uppercase()}")
    }




}