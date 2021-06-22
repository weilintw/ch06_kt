/*c6-5 會發生編譯時明錯誤,因capitalize未考慮讀取值可能為空
*/
fun main(){
    var beverage = readLine()?.capitalize()
    // beverage = null
    println(beverage)
}