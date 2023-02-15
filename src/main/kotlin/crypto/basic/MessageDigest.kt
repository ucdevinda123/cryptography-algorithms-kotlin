package crypto.basic

import crypto.Cryptography
import crypto.model.GenericInputData
import crypto.model.InputData
import java.security.MessageDigest

fun main() {
    println(MessageDigest().encrypt(InputData(plainText = "Hello")))
}

class MessageDigest : Cryptography() {
    override fun encrypt(inputData: GenericInputData): String {
        val hexBuffer = StringBuffer()
        val inputDataText = inputData.plainText
        val messageDigest = MessageDigest.getInstance("SHA-256")
        messageDigest.update(inputDataText.toByteArray())
        val digestValue = messageDigest.digest()
        for ((index, value ) in digestValue.withIndex()) {
            hexBuffer.append("0xFF$value")
        }
        return hexBuffer.toString()
    }
}