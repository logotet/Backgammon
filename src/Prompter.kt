class Prompter {
    fun invalidMove(){
        println("Invalid move!")
    }

    fun noCheckerAtPoint(){
        println("There is no checker of your color at the picked location")
    }

    fun printDices(diceOne: Int, diceTwo: Int){
        println(diceOne.toString() + diceTwo)
    }

    fun rollOrNot(){
        println("Roll the dice? Y|N?")
    }

}