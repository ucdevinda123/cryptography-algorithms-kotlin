package crypto.model

abstract class GenericInputData {
    abstract val plainText:String
    abstract val shift:Int
    open var key: String = ""
}