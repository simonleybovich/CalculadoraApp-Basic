import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);

        while (true) {
            System.out.println("*** Aplicacion Calculadora ****");
           mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
                    // ejecutamos la operacion
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta ponto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                } //fin if
                //imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error: " +  e.getMessage());
            }// fin try catch
        } // fin while
    } // fin main
    private static void mostrarMenu(){
        //mostramos el menu
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.println("La operacion a realizar? ");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona valor 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona valor 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
                break;
            default:
                System.out.println("Opcion erronea: " + operacion);
                break;
        }
    }
} // fin class
