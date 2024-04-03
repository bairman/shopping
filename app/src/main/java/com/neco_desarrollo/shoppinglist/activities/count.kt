package com.neco_desarrollo.shoppinglist.activities

fun main(){
    val list = listOf("a" to 1, "b" to 2, "c" to 3)
    val list2 = list.map {
        it.first
    }

    if ("xx" !in list2) {
        println("Not found")
    }



}

