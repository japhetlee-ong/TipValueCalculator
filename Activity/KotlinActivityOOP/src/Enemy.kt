class Enemy(name: String, type: CharacterType, private var charStats: CharacterStats) : RPGCharacter(name, type),CharacterInterface  {

    override fun takeDamage(amount: Int): String {
        charStats.health -= amount
        val stat = "$name takes $amount damage. Health left: {${charStats.health}}"
        return stat
    }

    override fun defend(amount:Int): String {
        val amountReduced = amount / charStats.def
        val damage = amount - amountReduced
        if(damage > 0) {
            charStats.health -= damage
            val stat = "$name defend damage. Reduce $amount damage to $damage"
            return  stat
        }else{
            return "$name successfully defended"
        }

    }

    override fun heal(amount: Int): String {
        charStats.health += amount
        val stat = "$name heal $amount damage"
        return stat
    }

    override fun isDead(): Boolean {
        return charStats.health <= 0
    }

    override fun getDamage(): Int{
        return (5..50).random()
    }

}