package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean salir = false;

        while (!salir) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            int opcion;

            try {
                opcion = scanner.nextInt();

                if (opcion < 1 || opcion > 7) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }

                if (opcion == 7) {
                    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                    salir = true;
                    continue;
                }

                double a = 0, b = 0;

                System.out.print("Ingrese el primer número: ");
                a = scanner.nextDouble();

                if (opcion != 6) {
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextDouble();
                }

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = calculadora.sumar(a, b);
                        break;
                    case 2:
                        resultado = calculadora.restar(a, b);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(a, b);
                        break;
                    case 4:
                        resultado = calculadora.dividir(a, b);
                        break;
                    case 5:
                        resultado = calculadora.potencia(a, b);
                        break;
                    case 6:
                        resultado = calculadora.raiz(a);
                        break;
                }

                System.out.println("El resultado es: " + resultado);

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error matemático: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
