class Board {

    val daska = mutableListOf(
        mutableListOf(Checker(Color.WHITE), Checker(Color.WHITE)),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK)
        ),
        mutableListOf(),
        mutableListOf(Checker(Color.BLACK), Checker(Color.BLACK), Checker(Color.BLACK)),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE)
        ),
        mutableListOf(
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.BLACK),
            Checker(Color.WHITE),
            Checker(Color.BLACK)
        ),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(Checker(Color.WHITE), Checker(Color.WHITE), Checker(Color.WHITE)),
        mutableListOf(),
        mutableListOf(
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE),
            Checker(Color.WHITE)
        ),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(Checker(Color.BLACK), Checker(Color.BLACK))
    )

    fun printBoard() {
        for(j in 0..4) {
            print("| |")
            for (i in 0..11) {
                if (i == 6) {
                    print(" ")
                }

                if (!daska[i].isEmpty() ) {
                    try {
                        print(" (${daska[i][j].color.letter}) ")
                    }catch (e:IndexOutOfBoundsException){
                        print("   ")
                    }
                } else {
                    print("   ")
                }
            }
            print("| |")
            println()
        }
//        println()
//        println()
//        println()
//        for (i in 23 downTo 12) {
//            if (i == 17) {
//                print(" ")
//            }
//            if (!daska[i].isEmpty()) {
//                print("(${daska[i][0].color.letter})")
//            } else {
//                print("E")
//            }
//        }
    }


}