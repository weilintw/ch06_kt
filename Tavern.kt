/*c6-11 增加抛劍雜耍邏輯
*/
fun main(){
    var swordsJuqqling: Int? = null
    val isJigglingProficient = (1..3).shuffled().last() == 3
    if(isJigglingProficient){
        swordsJuqqling = 2
    }
    println("You juggle $swordsJuqqling swords!")
}
