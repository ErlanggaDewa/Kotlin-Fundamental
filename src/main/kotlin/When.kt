fun main() {
    val openHours: Int = 7;
    val data1 = when (openHours) {
        6 -> {
            println("is six")
            "return six"
        };
        7 -> {
            println("is seven")
            "return seven"
        }
        else -> {
            println("not 6 and 7")
            "return not 6 and 7"
        }
    }
    println(data1)

    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("this is long")
        else -> println("this isn't long")
    }

    val value: Int = 10;
    val ranges: IntRange = 1..100
    when (value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value isn't in the range")
        else -> println("value is undefined")
    }

}