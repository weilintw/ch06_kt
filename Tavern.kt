import java.util.*
/*c6-8 使用 !!. 運算子
*/
fun main (){
    var beverage = readLine()!!.replaceFirstChar { if ( it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()}
    // beverage = null
    println(beverage)
}
