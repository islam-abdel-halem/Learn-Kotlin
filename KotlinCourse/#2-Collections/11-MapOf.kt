fun main() {
    //How To Create a Map in Kotlin
    val names = mapOf(
        1 to "Islam",
        2 to "Mohamed",
        3 to "Osama",
        4 to "Ali",
        5 to "Mohab"
    )
    val result = names[2]
    println(result) //Mohamed

    println("=======================")
    val result2 = names.containsKey(22)
    println(result2) //false

    println("=======================")
    val result3 = names.containsValue("Mohamed")
    println(result3) //true

    println("=======================")
    val result4 = names.keys
    println(result4) //[1, 2, 3, 4, 5]

    println("=======================")
    val result5 = names.values
    println(result5) //[Islam, Mohamed, Osama, Ali, Mohab]

    println("=======================")
    val result6 = names.entries
    println(result6) //[1=Islam, 2=Mohamed, 3=Osama, 4=Ali, 5=Mohab]


    println("======================================")
    println("How to create a Mutable Map")

    val names2 = mutableMapOf(
        1 to "Islam",
        2 to "Mohamed",
        3 to "Osama",
        4 to "Ali",
        5 to "Mohab"
    )

    names2.put(6, "Ahmed")
    println(names2) //{1=Mohamed, 2=Tamer, 3=Osama, 4=Ali, 5=Mohab, 6=Ahmed}

    names2.remove(4)
    println(names2) //{1=Mohamed, 2=Tamer, 3=Osama, 5=Mohab, 6=Ahmed}


    names2.getOrPut(4, { "Tark" })
    println(names2) //{1=Mohamed, 2=Tamer, 3=Osama, 5=Mohab, 6=Ahmed, 4=Tark}


    names2.getOrPut(1, { "Mohamed" })
    println(names2)// {1=Mohamed, 2=Tamer, 3=Osama, 5=Mohab, 6=Ahmed, 4=Tark}

    println("======================================")
    
    println("How Filter with Mutable Map")

    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California",
        "FL" to "Florida",
        "MN" to "Minnesota",
        "AZ" to "Arizona"
    )

    println("======================================")

    val filter = items.filter { it.key.contains("N") }
    println(filter) // {NY=New York, NJ=New Jersey, MN=Minnesota}

    println("============================")

    val filter2 = items.filterKeys { it.contains("N") }
    println(filter2) //{NY=New York, NJ=New Jersey, MN=Minnesota}

    println("============================")
    val filter3 = items.filterKeys { it.contains("N") }
        .map { it.value.substring(0, 3) }
    println(filter3)//[New, New, Min]

    println("============================")

    val filter4 = items.filterKeys { it.contains("N") }
        .mapValues { it.value.substring(0, 3) }
    println(filter4)//{NY=New, NJ=New, MN=Min}

}
