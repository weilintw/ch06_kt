/*c6-14 自訂異常
*/
fun main(){
    var swordsJuqqling: Int? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    if(isJigglingProficient){
        swordsJuqqling = 2
    }
    proficiencyCheck(swordsJuqqling)
    swordsJuqqling = swordsJuqqling!!.plus(1)
    println("You juggle $swordsJuqqling swords！")
}
fun proficiencyCheck(swordsJuqqling: Int?) {
    swordsJuqqling ?: throw IllegalStateException("Player cannot juggle swords")

    class UnskilledSwordJugglerException() {
        IllegalStateException("Player cannot juggle swords")
    }
}