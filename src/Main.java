import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    SumaDeDosNumeros(scanner);
                    break;
                case 3:
                    ParOImpar(scanner);
                    break;
                case 4:
                    System.out.print("Ingresa un numero para conocer su factorial: ");
                    int num3 = scanner.nextInt();
                    long resultado = factorial(num3);
                    System.out.println("El factorial de " + num3 + " es: " + resultado);
                    break;
                case 5:
                    System.out.print("Ingresa el numero del cual quieres conocer la tabla de multiplicar: ");
                    int tabla = scanner.nextInt();
                    TablaDeMultiplicar(tabla);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
    public static void holaMundo() {
        System.out.println("!Hola, Mundo!");
    }
    public static void SumaDeDosNumeros(Scanner scanner){
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
    public static void ParOImpar(Scanner scanner){
        System.out.print("Ingresa un numero: ");
        int num3 = scanner.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("El numero " + num3 + " es par.");
        } else {
            System.out.println("El numero " + num3 + " es impar.");
        }
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void TablaDeMultiplicar(int tabla){
        System.out.println("Tabla de multiplicar del " + tabla + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(tabla + " x " + i + " = " + (tabla * i ));
        }
    }
}
