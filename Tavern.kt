/*c6-9 使用 !=null 檢查 null
*/
fun main(){
    var beverage = readLine()
    beverage = null
    if (beverage != null){
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null")
    }
    println(beverage)
}
