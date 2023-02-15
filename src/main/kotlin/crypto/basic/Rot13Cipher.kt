package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData

class Rot13Cipher : Cryptography() {
    override fun encrypt(inputData: GenericInputData): String {
        val textStringBuffer = StringBuffer()
        val inputText = inputData.plainText
        for ((index, character) in inputText.withIndex()) {
            if (character.isUpperCase()) {
                textStringBuffer.append(processRot13(character, 'M'))
            } else {
                textStringBuffer.append(processRot13(character, 'm'))
            }
        }
        return textStringBuffer.toString()
    }

    private fun processRot13(character: Char, middleChar: Char): Char {
        return if (character <= middleChar) {
            (character.code + 13).toChar()
        } else {
            (character.code - 13).toChar()
        }
    }
}