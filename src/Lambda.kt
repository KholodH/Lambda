package com.example.lambda

import java.lang.Integer.max

fun main(){

        //  function with no parameter
        val noParameter = {println("I'am Function without parameter")}
        noParameter()
        // the Original function
        fun noParameter() = {println("I'am Function without parameter")}
        noParameter()


        //  two functions that take in one or more parameters and rewrite them using a lambda expression

        val WithParameters = { num1:Int,num2:Int->var result=num1+num2
            println("the sum =$result ") }
        WithParameters(3,8)
        // the Original function
        fun WithParameters(num1:Int,num2:Int){
            var result=num1+num2
            println("the sum =$result ") }
        WithParameters(5,9)

        val MaxNumber = { number1:Int,number2:Int->
            val result= max(number1,number2)
            println("the Greater number is: $result ") }
        MaxNumber(34,89)
        // the Original function
        fun MaxNumber(number1:Int,number2:Int){
            val result= max(number1,number2)
            println("the Greater number is: $result ")  }
        MaxNumber(57,19)


        //Find two functions that return a value and rewrite them using a lambda expression
        val returnSum = { num1: Int, num2: Int -> num1 + num2 }
        println(returnSum(2, 98))

        // the Original function
        fun returnSum( num1: Int, num2: Int): Int {
            return num1 + num2 }
        returnSum(43,21)

        val Names = { fname: String -> fname }
        println(Names("kholod"))
        // the Original function
        fun Names(fname:String): String{
            return fname
        }
        Names("Lod")





    data class Player(var name:String,var age:Int,var height:Int){
        val Player = listOf(
            Player("Bob", 23,188),
            Player("Sara", 22,170),
            Player("Jane", 21,174),
            Player("lana", 26,180),
            Player("Fred", 25,176),
            Player("carl", 30,188),
            Player("lena", 21,170),
            Player("hana", 20,174),
            Player("lisa", 19,180),
            Player("lois", 29,176),
            Player("sam", 19,188),
            Player("lod", 23,170),
            Player("lara", 27,174),
            Player("karen", 28,179),
            Player("harry", 28,175),
            Player("zac", 20,183),
            Player("ran", 21,184),
            Player("reem", 20,179),
            Player("leen", 19,176),
            Player("kem", 29,177))


    }
    }
