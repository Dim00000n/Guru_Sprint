package lesson2
fun main() {
    val age :Int = readln().toInt()
    if (age >= AGE_OF_MAJORITY){
        println("Добро пожаловать!")
    }
    else{
        println("Рано тебе еще!")
    }
}