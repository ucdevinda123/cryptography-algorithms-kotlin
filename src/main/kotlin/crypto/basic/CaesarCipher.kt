package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData
import crypto.model.InputData

class CaesarCipher : Cryptography() {

    override fun encrypt(inputData: GenericInputData): String {
        val shift = inputData.shift
        val outputText = StringBuffer()
        for ((index, value) in inputData.plainText.withIndex()) {
            if (value.isUpperCase()) {
                val shiftedValue = (value.code + shift - 65) % 26 + 65
                outputText.append(shiftedValue.toChar())
            } else {
                val shiftedValue = (value.code + shift - 97) % 26 + 97
                outputText.append(shiftedValue.toChar());
            }
        }
        return outputText.toString()
    }

}