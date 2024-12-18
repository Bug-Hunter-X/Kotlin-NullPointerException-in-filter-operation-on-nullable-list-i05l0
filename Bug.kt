fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) // Output: 2, 4

    val emptyList = emptyList<Int>()
    val evenNumbersEmpty = emptyList.filter { it % 2 == 0 }
    println(evenNumbersEmpty.joinToString())  // This will not print anything as expected, but...

    val nullList: List<Int>? = null
    val evenNumbersNull = nullList?.filter { it % 2 == 0 } ?: emptyList<Int>()
    println(evenNumbersNull.joinToString()) // This throws a NullPointerException. Why?
}