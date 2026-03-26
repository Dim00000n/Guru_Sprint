package lesson3

fun main() {
    val secretWord = "Aboba"
    var passcodeFrUser: String
    do {
        print("Введите пароль для доступа: ")
        passcodeFrUser = readln()
        if (passcodeFrUser != secretWord) {
            println("еверный ты наш, повтори снова ")
        }
    } while (passcodeFrUser != secretWord)
    println("Так уж и быть, дам доступ")
}