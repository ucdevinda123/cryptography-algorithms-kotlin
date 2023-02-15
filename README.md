# cryptography-algorithms-kotlin
Cryptography Algorithms Implementations in Kotlin



**1. Caesar Cipher:**

It's simply a type of substitution cipher.

    i.e. 
    each letter of a given text is replaced by a letter with a fixed number of positions down the alphabet.
    For example with a shift of 1, A would be replaced by B, B would become C, and so on__**
    
    Plain Text = ABC
    shift = 1
    Cipher = BCD
    
    A -> B
    B -> C
    C -> D
    
    
    Uppercase A is ASCII value 65.
    Lowercase a is ASCII value 97


**2. Rotation13 Cipher**

    ROT13 replaces each letter by its partner 13 characters further along the alphabet.
    For example, HELLO becomes URYYB (or, conversely, URYYB becomes HELLO again).

    ABCDEFGHIJKLM
    |||||||||||||
    NOPQRSTUVWXYZ

    HELLO -> URYYB

**3. XOR Cipher**

    How XOR works: 

       0 XOR 0 = 0 same bits
       1 XOR 1 = 0 same bits
       1 XOR O = 1 Different bits
       0 XOR 1 = 1 Different bits

    It's based on secret key and plain text

     I.E.
     plain text        10001
     secrent key       01010
     cipher            11011

    in the same way you can do the decryption

       i.e.
         secrent key       01010
         cipher            11011
         plain text        10001