fun main() {
    var counter1: Int = 1
    while (counter1 <= 10) {
        println(counter1++)
    }

    var counter2: Int = 100
    do {
        println(counter2++)
    } while (counter2 <= 120)
}