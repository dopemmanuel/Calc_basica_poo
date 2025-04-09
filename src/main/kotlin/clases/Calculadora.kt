package iesra.prog2425.clases

import iesra.prog2425.interaces.InputHandler
import iesra.prog2425.interaces.OutputHandler

class Calculator(
    private val inputHandler: InputHandler,
    private val outputHandler: OutputHandler
) {
    fun run() {
        var continuar = true

        while (continuar) {
            try {
                val num1 = inputHandler.readDouble("Introduce el primer número:")
                val operador = inputHandler.readOperator("Introduce el operador (+, -, *, /):")
                val num2 = inputHandler.readDouble("Introduce el segundo número:")

                val resultado = when (operador) {
                    '+' -> num1 + num2
                    '-' -> num1 - num2
                    '*' -> num1 * num2
                    '/' -> {
                        if (num2 == 0.0) throw ArithmeticException("División por cero")
                        num1 / num2
                    }
                    else -> "Operador no válido"
                }

                outputHandler.showResult(resultado)
            } catch (e: Exception) {
                outputHandler.showError(
                    when (e) {
                        is java.util.InputMismatchException -> "Entrada no válida. Introduce un número."
                        is ArithmeticException -> e.message ?: "Error aritmético"
                        else -> "Error inesperado: ${e.message}"
                    }
                )
            } finally {
                continuar = inputHandler.readYesNo("¿Desea realizar otro cálculo? (s/n)")
            }
        }
    }
}