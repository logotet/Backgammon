import kotlin.random.Random

fun main() {
    val board = Board()
    board.printBoard()
    val gameManager = GameManager()
    val dice = Dice()

    var command: String = readLine()!!
    while (command != "exit"){
//        val diceOne: Int
//        val diceTwo: Int
//        if(command == "roll"){
//            val dices = dice.rollDices()
//            diceOne = dices[0]
//            diceTwo = dices[1]
//            println(diceOne.toString() + diceTwo)
//        }else{
//            command = readLine()!!
//            continue
//        }
        val commandArr = command.split(" ")
        gameManager.move(board.daska, commandArr[0].toInt(), commandArr[1].toInt())
        board.printBoard()
        command = readLine()!!
    }
}