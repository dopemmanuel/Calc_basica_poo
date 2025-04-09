package iesra.prog2425.interaces

interface InputHandler {
    fun readDouble(prompt: String): Double
    fun readOperator(prompt: String): Char
    fun readYesNo(prompt: String): Boolean
}