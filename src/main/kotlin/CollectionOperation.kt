fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenList = numberList.filter { it % 2 == 0 }
    println("even number : $evenList")

    val notEventList = numberList.filterNot { it % 2 == 0 }
    println("odd number : $notEventList")

    val multipleBy5 = numberList.map { it * 5 }
    println("original list : $numberList")
    println("multiple by 5 list : $multipleBy5")

    println("total list : ${numberList.count()}")
    println("total event list : ${numberList.count { it % 2 == 0 }}")

    val firstEvenNumber = numberList.find { it % 10 == 0 }
    println("firstEvenNumber $firstEvenNumber")
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println("firstOrNullNumber $firstOrNullNumber")

    println("sum numberList : ${numberList.sum()}")
}