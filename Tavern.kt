/*c6-10 使用 空合併邏算子
*/
fun main(){
    var beverage = readLine()
    beverage = null
    if (beverage != null){
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null")
    }
    var beverageServer: String = beverage ?: "Buttered Ale"
    println(beverageServer)
}
