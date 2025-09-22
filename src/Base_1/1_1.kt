package Base_1

fun main() {
    print("Введите строку: ")
    val input = readln()
    if (input == ""){
        println("Введите строку, а не пустоту")
        return
    }
    val result = Stor(input)
    println("Результат: $result")
}

fun Stor(input: String): String {

    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }

            currentChar = input[i]
            count = 1
        }
    }

    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }

    return result.toString()

}