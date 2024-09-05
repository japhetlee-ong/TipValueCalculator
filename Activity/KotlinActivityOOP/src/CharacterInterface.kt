interface CharacterInterface {
    fun takeDamage(amount: Int) : String
    fun defend(amount: Int) : String
    fun heal(amount: Int) : String
    fun isDead(): Boolean
    fun getDamage(): Int
}