import java.util.*
/*c6-7 聯合使用 let 和安全呼叫運算子
*/
fun main (){
    var beverage = readLine()?.let {
        if (it.isNotBlank()){
            it.replaceFirstChar { if ( it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()}
        } else {
            "Buttered Ale"
        }
    }
    // beverage = null
    println(beverage)
}
