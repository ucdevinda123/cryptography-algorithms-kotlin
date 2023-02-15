package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData
import crypto.model.InputData
import java.lang.StringBuilder

class ReverseCipher : Cryptography() {
    override fun encrypt(inputData: GenericInputData): String {
        var lastIndex = inputData.plainText.lastIndex
        val spBuilder = StringBuilder()
        for (key in lastIndex downTo 0) {
            lastIndex--
            spBuilder.append(inputData.plainText[key])
        }
        return spBuilder.toString()
    }
}