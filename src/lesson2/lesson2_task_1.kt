package lesson2
const val AGE_OF_MAJORITY : Int = 18
fun main() {
    val age :Int = readln().toInt()
    val res : Boolean = age >= 18
    println("Совершенолетие достигнуто: $res")
}