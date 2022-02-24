fun main() {
/*
    Map is a data structure that can keep data
    using format key-value pairs
 */
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"]) // return null if the key not found
    println(capital.getValue("Jakarta")) // return exception if key not found
    println(capital.keys)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherland")
    println(mutableCapital)
}