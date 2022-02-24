fun main() {
//    With list, we can save a lot of data into one object
//    behavior between list and array is same, we can access using list[index], but is mutable
    val list1: List<Any> = listOf(1, 2.0, true, "angga")
    println("index ke 3 yaitu ${list1[3]}")

    val list2: MutableList<Any> = mutableListOf(10, false, "wkwk")
    list2.add("tambah")
    list2.add(0, "sisip di index 0")
    list2[1] = true
    list2.removeAt(2)
    list2.forEach { println(it) }
}