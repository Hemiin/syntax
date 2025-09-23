package Base_1

fun main(){
    println("Введите число для перевода в двоичную систему: ")
    var decChis = readln().toInt()
    val result = StringBuilder()

    while (decChis > 0) {
        if (decChis % 2 == 0) {
            result.append(0)
            decChis /= 2
        } else {
            result.append(1)
            decChis /= 2
        }
    }

    when (result.length % 4) {
        1 -> result.append("000")
        2 -> result.append("00")
        3 -> result.append("0")
    }


    val Rresult: String = result.reversed().toString()
    println("Ваше число в двоичной системе: $Rresult")
}