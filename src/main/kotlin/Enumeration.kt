fun main() {
    val colorRed = Color1.RED

    when (colorRed) {
        Color1.RED -> println("color is red")
        Color1.GREEN -> println("color is green")
        Color1.BLUE -> println("color is blue")
    }

    println(colorRed)

    Color2.GREEN.printValue()

    val colors: Array<Color1> = Color1.values()
    colors.forEach { color -> println(color) }

    println(Color1.valueOf("RED"))

    println(Color1.GREEN.ordinal)


}

enum class Color1(val nilai: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Color2(val nilai: Int) {
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of RED is $nilai")
        }
    };

    abstract fun printValue()
}