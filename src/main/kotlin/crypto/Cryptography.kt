package crypto

import crypto.model.GenericInputData
import crypto.model.InputData

abstract class Cryptography{
    abstract fun encrypt(inputData: GenericInputData):String
}