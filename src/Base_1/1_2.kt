package Base_1

fun main(){
    println("Введите строку: ")
    val input: String = readln()
    val result = Sorteeer(input)

    println("Результат: ")
    for (i in result)
        println(i)
}

fun Sorteeer(input: String): List<String> {

    val CharCount = mutableMapOf<Char, Int>()
    for (char in input){
        CharCount[char] = CharCount.getOrDefault(char, 0) + 1
    }
    val sortedChars = CharCount.toList().sortedBy { it.first }
    val result = mutableListOf<String>()
    for ((char, count) in sortedChars) {
        result.add("$char - $count")
    }

    return result
}
