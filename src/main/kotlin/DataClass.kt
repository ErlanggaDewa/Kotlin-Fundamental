/*
otomatis menghasilkan
constructor, toString(), equals(),
hashCode(), copy() dan juga fungsi componentN()
*/

class User(private val name: String, private val age: Int) {
    override fun toString(): String = "User(name=$name, age=$age)"
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

}

data class DataUser(val name: String, val age: Int)

fun main() {
    val dataUser = DataUser("Erlangga", 21)
    val dataUser2 = DataUser("Miko", 14)
    val user = User("Todi", 100)
    val user2 = User("Todi", 100)

    println(dataUser)
    println(user)

    println(dataUser.equals(dataUser2))
    println(user.equals(user2))

    println(dataUser.copy(name = "Dewa"))

//    Destructuring Declarations
    val name1 = dataUser.component1()
    val age1 = dataUser.component2()
    println("my name is $name1, i am $age1 years old")

    val (name2, age2) = dataUser2
    println("my name is $name2, i am $age2 years old")
}