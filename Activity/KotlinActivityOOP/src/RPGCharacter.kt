open class RPGCharacter(val name: String, val type: CharacterType) {

    open fun getCharacterName(): String {
        val name = "$name - $type"
        return name
    }

}