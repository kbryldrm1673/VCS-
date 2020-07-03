package com.kubra.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intForLoop()
        stringForLoop()
        arrayForLoop()
        printForLoop()

        val kubra= arrayOf("selim",1,"kübra",true,2)
        for (i in kubra){
            println(i)
        }


        for(i in 0 until 10){ println(i) }
        for(i in 0 until 20 step 5) println(i)
        for(i in 20 downTo 0 step 5) println(i)
        for((index,value) in kubra.withIndex()){
            println("$index  : $value")
        }
        for (i in kubra.indices) {
            println(kubra[i])
        }

        val mixArray = arrayOf(8 ,9 , "kübra" , "selim")
        for(i in mixArray){
            println("${mixArray.indices} $i")
        }
        // indices array in kaçtan kaça gittiğini gösteriyor





    }

    private fun intForLoop(){
        for (i in 1..10){
            println(i)
        }
    }

    private fun stringForLoop(){
        val name="selim"
        for(i in name){
            println(i)
        }
    }

    private fun arrayForLoop(){
        val array =arrayOf(7,8,11,1,2)
        var sum=0
        for(i in array){
            sum += i
        }
        println("Toplam$sum")
    }

    private fun printForLoop(){
        val x = 1..5
        for(i in x){
            println(i)
        }

    }

    private fun multipleForLoop(){
        val i=1..10
        val j=1..5
        val carpma = 1

        for(i in i){
            for(j in j){
            }
            println("$i * $j = $carpma")

        }
    }





}
