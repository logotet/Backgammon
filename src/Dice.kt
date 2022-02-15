import kotlin.random.Random

class Dice {
    fun rollDices(): Array<Int> {
        return arrayOf(rollDice(), rollDice())
    }

    private fun rollDice(): Int {
        return Random.nextInt(1, 6)
    }
}