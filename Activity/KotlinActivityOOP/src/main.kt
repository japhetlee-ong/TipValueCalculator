fun main() {

    val heroStats = CharacterStats(100.0,0.2)
    var hero = Hero("Japhet",CharacterType.HERO,heroStats)

    val enemyStats = CharacterStats(50.0,0.1)
    val enemy = Enemy("Someone", CharacterType.ENEMY, enemyStats)

    val game = Game(hero,enemy)
    game.play()

}