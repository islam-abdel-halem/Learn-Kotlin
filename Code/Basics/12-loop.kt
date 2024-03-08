fun main() {

// for 1


    val values = listOf(1,2,3,4,5,6)
    for (i in values) {
        println(i)
    }

//    val values = listOf(1, 2, 3, 4, 5, 6)
//    for (numbers in values) {
//        println(numbers)
//    }

//    val values = listOf("Koltin","Java","Js","HTML")
//    for (lang in values) {
//        println(lang)
//    }

    //counter
    for (i in 0 until 10) {
        println(i)
    }

//    val start = 0
//    val stop = 77
//    for (i in start until stop) {
//        println(i)
//    }

    val start = 0
    val stop = 77
    for (i in start until stop step 3) {
        println(i)
    }

    for (y in 100 downTo 0) {
        println(y)
    }


    for (i in 100 downTo 0 step 2) {
        println(i)
    }



// for 2

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

//    val rows = 5
//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }


//    * * * * *
//    * * * *
//    * * *
//    * *
//    *


//    val rows = 5
//    for (i in rows downTo 1) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }


/*
1
2 3
4 5 6
7 8 9 10
 */

 val rows = 4
 var number = 1
 for (i in 1..rows) {
     for (j in 1..i) {
         print("$number ")
         ++number
     }
     println()
 }

// Range


val i = 100
if (i in 1..50) {
    println("Yes")
}else{
    println("No")
}

for (j in 0..10 step 2) {
    println(j)
}

//ForEach
val values = listOf("Koltin","Java","Js","HTML")
for (it in values) {
    println(it)
}

println("====================")
values.forEach { println(it) }

// WhileLoops

var x = 0

do {
    println(x)
    x++
} while (x < 10)

}