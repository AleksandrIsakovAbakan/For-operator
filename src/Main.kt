import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val a = 5.0
    val b = 10.2
    println("среднее арифметическое = ${arithmeticMean(listOf(a, b))}")

    val s = 246.49
    findDiameterAndCircumference(s)

    findPerimeterAndAreaOfGivenRectangle(CoordinatesOfTwoOppositeVerticesOfRectangle(1, 1),
        CoordinatesOfTwoOppositeVerticesOfRectangle(5, 4))

    sequenceOfNumbers()

    val n = 20
    displayOnlyEvenNumbers(n)
}

/*
Даны два числа a и b.
Найти их среднее арифметическое.
*/
fun arithmeticMean(list: List<Double>): Double {
    if (list.isEmpty()) return 0.0
    var temp = 0.0
    for (d in 0..<list.size) temp += list[d]
    return temp / list.size
}

/*
Дана площадь S круга.
Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L=π∗D, S=π∗D2/4.
В качестве значения π использовать 3.14.
*/
fun findDiameterAndCircumference(s: Double){
    val pi = 3.14
    val d = sqrt(s * 4 / pi)
    println("площадь круга S= $s")
    println("диаметр D= $d")
    println("длина окружности L= ${pi * d}")
}

/*
Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2).
Стороны прямоугольника параллельны осям координат.
Найти периметр и площадь данного прямоугольника.
*/
class CoordinatesOfTwoOppositeVerticesOfRectangle(val x: Int, val y: Int)

fun findPerimeterAndAreaOfGivenRectangle(a: CoordinatesOfTwoOppositeVerticesOfRectangle,
                                         b: CoordinatesOfTwoOppositeVerticesOfRectangle){

    println("периметр прямоугольника = ${2 * (abs(a.x - b.x) + abs(a.y - b.y))}")
    println("площадь прямоугольника = ${abs(a.x - b.x) * abs(a.y - b.y)}")
}

/*
Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
*/
fun sequenceOfNumbers(){
    var string = "последовательность чисел: "
    var temp = 1
    for (a in 1..10){
        string += temp
        string += " "
        temp *= 2
    }
    println(string)
}

/*
Дано целое число n = 20.
Уменьшая его до 0, вывести на экран только четные числа.
*/
fun displayOnlyEvenNumbers(n: Int){
    println("только четные числа")
    for (a in n downTo  0 step 2){
        println(a)
    }
}

/*Примечания:
- Для вывода значений на экран используйте функцию println().
*/
