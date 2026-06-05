/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.de.recuperacion;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProgramaDeRecuperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try ( // codigo paracalcular notas
                
        java.util.Scanner teclado = new Scanner(System.in)) {
            System.out.println("=== SISTEMA DE NOTAS===");
            
            // 2. Pedir el nombre del estudiante
            System.out.print("Escribe el nombre del estudiante : ");
            String nombre = teclado.nextLine();
            // 3. Pedir las tres notas
            System.out.print("Ingrese la primera nota del 0 a 10): ");
            double nota1 = teclado.nextDouble();
            System.out.print("Ingrese la segunda nota del 0 a 10): ");
            double nota2 = teclado.nextDouble();
            System.out.print("Ingrese la tercera nota  del 0 a 10): ");
            double nota3 = teclado.nextDouble();
            // 4. Calcular el promedio de las tres notas
            double promedio = (nota1 + nota2 + nota3) / 3;
            // 5. Mostrar los resultados finales en la pantalla principal
            System.out.println("\n--- Resultados del estudiante: " + nombre.toUpperCase() + " ---");
            System.out.printf("El promedio del estudiante es : %.2f\n", promedio);
            // 6. Condidion para saber si aprobó o reprobo
            if (promedio >= 7.0) {
                System.out.println("Estado: APROBADO. Felicidades tiene vacaciones ");
            } else {
                System.out.println("Estado: REPROBADO. Debes esforzarte mas ");
            }
            // salida
        }
    }
}

  
