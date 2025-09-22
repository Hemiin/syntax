fun main() {
    println("Введите строку: ")
    val input: String = readln()

    val result = sortString(input)

    println("Результат: ")
    result.forEach { println(it) }
}

fun sortString(input: String): List<String> {
    if (input.isEmpty()) return emptyList()

    val result = mutableListOf<String>()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.add("$currentChar - $count")
            currentChar = input[i]
            count = 1
        }
    }

    // Добавляем последнюю группу символов
    result.add("$currentChar - $count")

    return result
}