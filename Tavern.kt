/*c6-6 使用安全呼叫運算子 ?.
*/
fun main(){
    var beverage = readLine()?.capitalize()
    // beverage = null
    println(beverage)
}