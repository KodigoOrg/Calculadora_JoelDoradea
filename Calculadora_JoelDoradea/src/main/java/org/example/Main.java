package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Potencia");
                System.out.println("6. Raíz cuadrada");
                System.out.println("7. Salir");
                System.out.print("Opción: ");

                int opcion = sc.nextInt();

                if (opcion == 7) {
                    System.out.println("Gracias por usar la calculadora.");
                    salir = true;
                    continue;
                }

                if (opcion < 1 || opcion > 7) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }

                System.out.print("Ingrese el primer número: ");
                Numero n1 = new Numero(sc.nextDouble());

                Numero n2 = null;
                if (opcion != 6) {
                    System.out.print("Ingrese el segundo número: ");
                    n2 = new Numero(sc.nextDouble());
                }

                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = calc.sumar(n1.getValor(), n2.getValor());
                        break;
                    case 2:
                        resultado = calc.restar(n1.getValor(), n2.getValor());
                        break;
                    case 3:
                        resultado = calc.multiplicar(n1.getValor(), n2.getValor());
                        break;
                    case 4:
                        resultado = calc.dividir(n1.getValor(), n2.getValor());
                        break;
                    case 5:
                        resultado = calc.potencia(n1.getValor(), n2.getValor());
                        break;
                    case 6:
                        resultado = calc.raiz(n1.getValor());
                        break;
                }

                System.out.println("Resultado: " + resultado);

            } catch (InputMismatchException ime) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                sc.nextLine();
            } catch (ArithmeticException ae) {
                System.out.println("Error matemático: " + ae.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }
}
