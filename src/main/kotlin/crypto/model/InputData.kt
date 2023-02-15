package crypto.model

data class InputData(
    override val shift:Int = 1, override val plainText: String
) : GenericInputData()
