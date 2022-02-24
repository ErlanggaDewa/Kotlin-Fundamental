fun main() {
    val list = listOf(1, 2, 3, null, 5, 6, null, 7)

    for (value in list) {
        if (value === null) continue
        println("value : $value")
    }

    println("\n")

    outerLoop@ for (i in 1..10) {
        println("Outer loop")

        for (j in 1..100) {
            println("Inner loop")
            if (j == 5) break@outerLoop
        }
    }
}