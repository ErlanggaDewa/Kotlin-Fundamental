fun main() {
    val ranges1 = 1..5
    for (value in ranges1) print("$value, ")

    print("\n\n")

    val ranges2 = 1.rangeTo(12) step 3
    for ((index, value) in ranges2.withIndex())
        println("$value with index $index")

    print("\n\n")

    ranges2.forEachIndexed { index, value -> println("$value with index $index") }
}