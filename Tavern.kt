/*p6-19 require 先決條件測試
*/
import java.lang.IllegalStateException
fun main(){
    var swordsJuggling: Int ? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    /* isJigglingProficient 取隨機值1~3，最大為3 */
    if (isJigglingProficient) swordsJuggling = 2
    try{
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
        } catch (e:Exception){
        print(e)
    }
    if(swordsJuggling == null) swordsJuggling = 0
    println("你要了 $swordsJuggling 把劍！")
    if(swordsJuggling == 0) juggleSwords(0)
}
fun proficiencyCheck(swordsJuggling: Int?){
    //swordsJuqqling ?: throw UnskilledSwordJugglerException()
    checkNotNull(swordsJuggling,{"玩家不會耍劍......"})
}
fun juggleSwords(swordsJuggling: Int){
    require(swordsJuggling >= 3,{"至少要耍3把劍才夠刺激"})
}

