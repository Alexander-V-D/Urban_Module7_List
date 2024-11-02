fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println("Ответ к задаче 1:")
    getFirst(list)

    println("Ответ к задаче 2:")
    getAverage(list)

    println("Ответ к задаче 3:")
    getSum(list)

    println("Ответ к задаче 4:")
    getCount(list)

    println("Ответ к задаче 5:")
    getSumOfLastTwo(list)

    println("Ответ к задаче 6:")
    getIndicesSum(list)
}

//Функция для задачи 1
fun getFirst(list: List<Int>) {
    println("Первый элемент по индексу: ${list[0]}")
    println("Первый элемент из метода first: ${list.first()}")
}

//Функция для задачи 2
fun getAverage(list: List<Int>) {
    var sum = 0
    list.forEach { sum += it }
    println("Среднее арифметическое через цикл: ${sum / list.size}")
    println("Среднее ариметическое из метода average: ${list.average()}")
}

//Функция для задачи 3
fun getSum(list: List<Int>) {
    var sum = 0
    list.forEach { sum += it }
    println("Сумма через цикл: $sum")
    println("Сумма из метода sum: ${list.sum()}")
}

//Функция для задачи 4
fun getCount(list: List<Int>) {
    var count = 0
    list.forEach { _ -> count++ }
    println("Количество элементов через цикл: $count")
    println("Количество элементов из метода count: ${list.count()}")
}

//Функция для задачи 5
fun getSumOfLastTwo(list: List<Int>) {
    var sum = 0
    for (i in list.size - 2..<list.size) sum += list[i]
    println("Сумма двух последних через цикл: $sum")
    println("Сумма двух последних из методов takeLast и sum: ${list.takeLast(2).sum()}")
}

//Функция для задачи 6
fun getIndicesSum(list: List<Int>) {
    var sum = 0
    for (i in 0..<list.size) {
        sum += i
    }
    println("Сумма индексов через цикл: $sum")
    println("Сумма индексов из методов indices и sum: ${list.indices.sum()}")
}