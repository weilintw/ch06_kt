/*c6-12 增加第3把劍，程式可能因未捕獲異常
*/
fun main(){
    var swordsJuqqling: Int? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    if(isJigglingProficient){
        swordsJuqqling = 2
    }
    swordsJuqqling = swordsJuqqling!!.plus(1)
    println("You juggle $swordsJuqqling swords!")
}
