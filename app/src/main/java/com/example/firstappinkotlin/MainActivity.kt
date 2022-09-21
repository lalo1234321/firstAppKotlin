package com.example.firstappinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var dummy : String
        dummy = "Progra Movil"
        println("Hola mundo ${dummy}")
        val constante = "Soy constante"
        println("R: ${constante}")




        /*var a:Int
        var b:Int
        a = 2
        b = 3
        var c:Int = a+b*/

        /*if( a>b ) {
            println("a es mayor que b")
        }else {
            println("a es menor a b o es igual a b")
        }
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }*/
        /*fun describe(obj: Any): String =
            when (obj) {
                1          -> "One"
                2          -> "Two"
                3          -> "Three"
                in 5..100  -> "This value is in range"
                "Hello"    -> "Greeting"
                is Long    -> "Long"
                !is String -> "Not a string"
                else       -> "Unknown"
        }
        println(describe(6))*/
        var a:Int = 0
        var b:Int = 300
        /*while( a <= 20 ) {
            println("Vuelta ${a}")
            a++
        }*/
        /*while( a <= 500 ) {
            println("Vuelta ${a}")
            a += 5
        }*/
        /*while( b > 99 ) {
            b -= 3
            println(b)
        }*/
        /*for ( i in 50..100 ) {
            println( i )
        }*/

        /*for ( i in 25..45 ) {
            if( i%2 == 0 ) {
                println(i)
            }
        }*/


        //Los cinco ejercicios del for
        //del 50 al 100 de 5
        /*for (i in 50..100 step 5) {
            println("$i ")
        }*/


        // del 300 al 99 en 3

        /*for (i in 300 downTo 99 step 3) {
            println("$i ")
        }*/


        //del 500 al 500 de 7 en 7 impares

        /*for (i in 500 downTo 400 step 7) {
            if( i % 2 !=0 ) {
                println(i)
            }
            //println("$i ")
        }*/

        /*fun completeName(firtName:String, lastName:String) : String {
            return "${firtName} ${lastName}"
        }
        println(completeName("Eduardo", "Domínguez"))*/

        //Numero primo

        /*fun numeroPrimo(testNumber:Int):Boolean {
            for (i in 2..testNumber-1) {
                if( testNumber % i == 0 ) {
                    return false
                }
            }
            return true
        }
        if( numeroPrimo(5) ) {
            println("Es primo")
        }else {
            println("No es primo")
        }*/

        //abecedario


        fun alfabeto(limit:Int = 26) {
            var c: Char

            c = 'A'
            var band:Int = 0
            while ((band < limit)) {
                println("$c ")
                ++c
                band++
            }
        }
        alfabeto()


        /*
        do {
            println("Vuelta ${a}")
            a++
        } while( a <= 20 )*/



        var band = 3

        var ternaryResult : String = if( band == 2 ) "The value two was assigned" else if ( band == 3 ) "The value three was assigned"
                else "Nothing"
        println(ternaryResult)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}