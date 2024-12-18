fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) // Output: 2, 4

    val emptyList = emptyList<Int>()
    val evenNumbersEmpty = emptyList.filter { it % 2 == 0 }
    println(evenNumbersEmpty.joinToString())  // Output: 

    val nullList: List<Int>? = null
    val evenNumbersNull = nullList?.filter { it % 2 == 0 } ?: emptyList<Int>()
    println(evenNumbersNull.joinToString()) // This still throws a NullPointerException. Why?

    //Solution
    val nullListSolution: List<Int>? = null
    val evenNumbersNullSolution = nullListSolution?.let { it.filter { it % 2 == 0 } } ?: emptyList<Int>()
    println(evenNumbersNullSolution.joinToString()) //This will now print an empty string
} 