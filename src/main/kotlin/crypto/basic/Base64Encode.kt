package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData
import crypto.model.InputData
import java.util.Base64


class Base64Encode : Cryptography() {
    override fun encrypt(inputData: GenericInputData): String {
        return  Base64.getEncoder().encodeToString(inputData.plainText.toByteArray())
    }

    fun decrypt(encryptedData : String) : String{
        return Base64.getDecoder().decode(encryptedData.toByteArray()).decodeToString()
    }
}