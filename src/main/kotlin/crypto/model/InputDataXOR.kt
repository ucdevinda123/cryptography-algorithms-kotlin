package crypto.model

data class InputDataXOR(
    override var key: String,
    override val plainText: String, override val shift: Int = 1
) : GenericInputData()
