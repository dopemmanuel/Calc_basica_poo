package iesra.prog2425.clases


import iesra.prog2425.interaces.InputHandler
import java.util.Scanner

class ConsoleInputHandler : InputHandler {
    private val scanner = Scanner(System.`in`)

    override fun readDouble(prompt: String): Double {
        println(prompt)
        return scanner.nextDouble()
    }

    override fun readOperator(prompt: String): Char {
        println(prompt)
        return scanner.next()[0]
    }

    override fun readYesNo(prompt: String): Boolean {
        println(prompt)
        return scanner.next().equals("s", ignoreCase = true)
    }
}