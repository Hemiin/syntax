package Base_1

fun main() {
    println("Калкуляторчик") // тут нет ошибки в названии
    println("Введите два числа и операцию через пробел (например: 2 1 +)")
    print("Ввод: ")

    val input: String = readln()

    var listik = mutableListOf<String>()
    var kostik = StringBuilder()
    var proverka = StringBuilder()
    var result: String = ""

    for(i in input){
        if (i != ' '){
            kostik.append(i)
            proverka.append(i)

        } else{
            listik.add(kostik.toString())
            kostik.clear()
        }

    }

    listik.add(input.last().toString())

    if (listik.size !=3){
        println("Введите по примеру!")
    }
    when(listik[2].toString()+ ""){
        "+" -> result = (listik[0].toFloat() + listik[1].toFloat()).toString()
        "/" -> result = (listik[0].toFloat() / listik[1].toFloat()).toString()
        "*" -> result = (listik[0].toFloat() * listik[1].toFloat()).toString()
        "-" -> result = (listik[0].toFloat() - listik[1].toFloat()).toString()

    }
    println(result)
}
