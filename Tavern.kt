/*c6-15 抛出自訂異常
*/
fun main(){
    var swordsJuqqling: Int ? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    if (isJigglingProficient){
        swordsJuqqling = 2
    }
    proficiencyCheck(swordsJuqqling)
    swordsJuqqling = swordsJuqqling!!.plus(1)
    println("You juggle $swordsJuqqling swords！"")
}
fun proficiencyCheck(swordsJuqqling : Int?) {
    swordsJuqqling ?: throw UnskilledSwordJugglerException()
}
class UnskilledSwordJugglerException():
        IllegalStateException("玩家不會耍劍......")