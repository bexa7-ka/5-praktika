fun main(){
    while (true) {
        println("Введите 1-ое число")
        val num1 = readLine()!!.toFloat()
        println("Введите 2-ое число")
        val num2 = readLine()!!.toFloat()
        println("Выберите действие: +, -, *, /")
        val deistv = readLine()
        when (deistv) {
            "0" -> break
            "+" ->  println("Ответ: ${num1 + num2}")
            "-" ->  println("Ответ: ${num1 - num2}")
            "*" ->  println("Ответ: ${num1 * num2}")
            "/" ->  if (num2 == 0f) {
                println("Ошибка, на ноль делить нельзя!")
            }
            else {
                println("Ответ: ${num1 / num2}")
            }
            else -> println("Ошибка: вы ввели недопустимный знак!")
        }

    }
}