import kotlin.random.Random

fun main(args: Array<String>) {
    val nomPersonage = arrayOf("Vishea", "Gayalle", "Bearsard", "Querri")
    var nomSexe: String = ""
    var sexe: Int = -1
    var nomClasse: String = ""
    var classe: Int = -1
    var bonus: Int = -1
    var nombreBonus: Int = -1

    for (element in nomPersonage){
        sexe = (1..2).random()
        classe = (1..5).random()
        bonus = (1..50).random()
        when (sexe) {
            1 -> nomSexe = "Masculin"
            2 -> nomSexe = "Féminin"
            else -> {
                print("Error")
            }
        }
        when (classe) {
            1 -> nomClasse = "Wizard"
            2 -> nomClasse = "Witch Doctor"
            3 -> nomClasse = "Demon Hunter"
            4 -> nomClasse = "Barbarian"
            5 -> nomClasse = "Monk"
            else -> {
                print("Error")
            }
        }
        if (bonus in 1..10){
            nombreBonus = 10
        }
        else if (bonus in 11..40){
            nombreBonus = 15
        }
        else{
            nombreBonus = 5
        }
//        println("$sexe | $classe | $bonus")
        println("$element est de sexe $nomSexe, de classe $nomClasse et de bonus aux compétences $nombreBonus")
        println("====================================================================================")
    }
}