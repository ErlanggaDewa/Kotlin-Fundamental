fun main() {
    val list = (1..1000000).toList()

//    eager evaluation
//    list.filter { it /% 5 == 0 }.map { it * 2 }.forEach { println(it) }

//    Lazy evaluation
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}