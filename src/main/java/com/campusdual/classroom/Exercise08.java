package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(15);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    /**
     * Ejecuta un bucle while que imprime el valor actual y el valor del siguiente ciclo.
     *
     * @param num Límite superior del bucle (Y).
     */
    public static void whileLoop(int num) {
        if (num <= 0) {
            System.out.println("El número debe ser mayor a 0.");
        }

        int currentValue  = 0;

        while(currentValue  < num){

            String iterationMessage  = String.format(
                    "%d < %d. El proximo ciclo valdra: %d",
                    currentValue , num, currentValue  + 1
            );

            System.out.println(iterationMessage);

            currentValue ++;
        }
    }
}