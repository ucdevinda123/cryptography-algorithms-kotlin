package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData


class XORCipher: Cryptography() {
    override fun encrypt(inputData: GenericInputData): String {
        val  xorResultBuffer = StringBuffer()
        for((index,plainTextChar) in inputData.plainText.withIndex()){
            val xorResult = plainTextChar.code.xor(inputData.key[index % inputData.key.length].code).toChar()
            xorResultBuffer.append(xorResult)
        }
        return  xorResultBuffer.toString()
    }

    fun decrypt(encryptedText: String, key : String) : String{
        val decryptedValue = StringBuffer()
        for((index,enT) in encryptedText.withIndex()){
            val xorResult = enT.code.xor(key[index % key.length].code).toChar()
            decryptedValue.append(xorResult)
        }
        return decryptedValue.toString()
    }
}