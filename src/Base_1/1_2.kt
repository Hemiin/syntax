package Base_1

fun main(){
    println("Введите строку: ")
    val input: String = readln()
    var ind = 0

    val result = Sorteeer(input)

    println("Результат: ")
    for (i in ind until input.length)
        println(result[i])
        ind++

}

fun Sorteeer(input: String): MutableList<String> {

    val result = mutableListOf<String>()

    var count = 1

    for (i in count until input.length)



    return result
}
