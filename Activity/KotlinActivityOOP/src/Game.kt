class Game(val player: Hero, val enemy: Enemy): GameInterface {
    private var turn : Int = 0

    override fun play() {

        println("Players name is: ${player.getCharacterName()}")
        println("Enemy name is: ${enemy.getCharacterName()}")

        while (!player.isDead() && !enemy.isDead()){
            val choice = (1..3).random()
            when (choice) {
                1 -> {
                    if(turn == 0) {
                        println(enemy.takeDamage(player.getDamage()))
                        turn = 1
                    }else{
                        println(player.takeDamage(enemy.getDamage()))
                        turn = 0
                    }
                }
                2 -> {
                    if(turn == 0) {
                        println(player.defend(enemy.getDamage()))
                        turn = 1
                    }else{
                        println(enemy.defend(player.getDamage()))
                        turn = 0
                    }
                }
                3 ->
                {
                    if(turn == 0) {
                        println(player.heal((10..20).random()))
                        turn = 1
                    }else{
                        println(enemy.heal((5..10).random()))
                        turn = 0
                    }
                }
            }
        }

        if(!player.isDead()){
            println("${player.getCharacterName()} wins!" )
        }
        if(!enemy.isDead()){
            println("${player.getCharacterName()} lost!" )
        }
    }
}