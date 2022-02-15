class MoveValidator {
    companion object {
        val prompter = Prompter()
        fun isMoveValid(color: Color, destination: MutableList<Checker>): Boolean {
            return if(destination.isEmpty() || destination.last().color == color){
                true
            }else{
                prompter.invalidMove()
                false
            }
        }

        fun isCheckerAtPoint(checker: Checker?, pickedPoint: MutableList<Checker>): Boolean{

          return if(pickedPoint.last().color == checker?.color){
              true
          }else{
              prompter.noCheckerAtPoint()
              false
          }
        }

        fun pickChecker(pickedPoint: MutableList<Checker>): Checker?{
            try {
              return pickedPoint.get(pickedPoint.size-1)
            }catch (e: IndexOutOfBoundsException){
                prompter.noCheckerAtPoint()
                return null
            }
        }
    }

}