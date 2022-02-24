fun main() {
    val intSet = setOf(1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9)
    println(intSet)
    println(1 in intSet)

    val intSet2 = setOf(1, 2, 3, 100, 200)
    println(intSet.intersect(intSet2))
    println(intSet.union(intSet2))

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}