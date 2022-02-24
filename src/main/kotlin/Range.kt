fun main() {
    val rangeInt = 1..100
    println("step : ${rangeInt.step}")

    val rangeInt2Step = 1..100 step 2
    rangeInt2Step.forEach {
        print("$it ")
    }

    val downInt = 10.downTo(1)
    if (7 in downInt) {
        println("\nvalue 7 in range")
    }

    val rangeChar = 'A'.rangeTo('E')
    rangeChar.forEach {
        print("$it ")
    }


}