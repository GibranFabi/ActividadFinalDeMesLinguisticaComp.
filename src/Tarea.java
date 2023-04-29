import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int opcion = 0;

while (opcion != 6) {
    System.out.println("¿Qué operación deseas realizar?");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Exponencial");
    System.out.println("6. Salir");
    opcion = input.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Ingresa el primer número:");
            float primerNumero = input.nextFloat();
            System.out.println("Ingresa el segundo número:");
            float segundoNumero = input.nextFloat();
            Calculadora calculadoraSuma = new Calculadora(primerNumero, segundoNumero);
            calculadoraSuma.sumar();
            break;
        case 2:
            System.out.println("Ingresa el primer número:");
            primerNumero = input.nextFloat();
            System.out.println("Ingresa el segundo número:");
            segundoNumero = input.nextFloat();
            Calculadora calculadoraResta = new Calculadora(primerNumero, segundoNumero);
            calculadoraResta.restar();
            break;
        case 3:
            System.out.println("Ingresa el primer número:");
            primerNumero = input.nextFloat();
            System.out.println("Ingresa el segundo número:");
            segundoNumero = input.nextFloat();
            Calculadora calculadoraMultiplicacion = new Calculadora(primerNumero, segundoNumero);
            calculadoraMultiplicacion.multiplicar();
            break;
                    case 4:
                    System.out.println("Ingresa el primer número:");
                    primerNumero = input.nextFloat();
                    System.out.println("Ingresa el segundo número:");
                    segundoNumero = input.nextFloat();
                    Calculadora calculadoraRestar = new Calculadora(primerNumero, segundoNumero);
                    calculadoraRestar.restar();
                    break;
                    case 5:
                    System.out.println("Ingresa el primer número:");
                    primerNumero = input.nextFloat();
                    System.out.println("Ingresa el segundo número:");
                    segundoNumero = input.nextFloat();
                    Calculadora calculadoraExponencial = new Calculadora(primerNumero, segundoNumero);
                    calculadoraExponencial.exponencial();
                    break;
                    case 6:
                        System.out.println("Saliendo de la calculadora...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
        }
        }
    }

