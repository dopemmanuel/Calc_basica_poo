package iesra.prog2425.clases

import iesra.prog2425.interaces.OutputHandler

class ConsoleOutputHandler : OutputHandler {
    override fun showResult(result: Any) {
        println("Resultado: $result")
    }

    override fun showError(message: String) {
        println("Error: $message")
    }
}