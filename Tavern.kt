/*c6-17 使用先決條例 checkNotNull
*/
import java.lang.IllegalStateException
fun main(){
    var swordsJuqqling: Int ? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    /* isJigglingProficient 取隨機值1~3，最大為3 */
    if(isJigglingProficient) swordsJuqqling = 2
    try{
        proficiencyCheck(swordsJuqqling)
        swordsJuqqling = swordsJuqqling!!.plus(1)
    } catch (e:Exception){
        print(e)
    }
    println("You juggle $swordsJuqqling swords！")
}
fun proficiencyCheck(swordsJuqqling: Int?) {
    //swordsJuqqling ?: throw UnskilledSwordJugglerException()
    checkNotNull(swordsJuqqling,{"玩家不會耍劍......"})
}
/*
class UnskilledSwordJugglerException():
    IllegalStateException("玩家不會耍劍......")
*/

