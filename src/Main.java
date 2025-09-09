import java.util.Scanner;
import java.time.LocalDate;

class TallerJava {

    // ---------------- VOID ----------------
    public static void mostrarFechaActual() {
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha actual es: " + hoy);
    }

    public static void despedirse() {
        System.out.println("¡Gracias por usar este programa, hasta pronto!");
    }

    // ---------------- INT ----------------
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int obtenerMenor(int a, int b) {
        return (a < b) ? a : b;
    }

    // ---------------- DOUBLE ----------------
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double convertirPesosADolares(double pesos) {
        double tasa = 4000; // 1 USD = 4000 COP
        return pesos / tasa;
    }

    // ---------------- STRING ----------------
    public static String saludoFormal(String nombre) {
        return "Buenos días, " + nombre + ". Espero que tengas un excelente día.";
    }

    public static String invertirCadena(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    // ---------------- BOOLEAN ----------------
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // ---------------- MENU ----------------
    public static void mostrarMenu() {
        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Mostrar fecha actual (void)");
        System.out.println("2. Despedirse (void)");
        System.out.println("3. Multiplicar dos números (int)");
        System.out.println("4. Obtener el menor de dos números (int)");
        System.out.println("5. Calcular área de un círculo (double)");
        System.out.println("6. Convertir pesos a dólares (double)");
        System.out.println("7. Saludo formal (String)");
        System.out.println("8. Invertir una cadena (String)");
        System.out.println("9. Verificar si un número es positivo (boolean)");
        System.out.println("10. Verificar si un año es bisiesto (boolean)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpia

            switch (opcion) {
                case 1:
                    mostrarFechaActual();
                    break;
                case 2:
                    despedirse();
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Menor: " + obtenerMenor(x, y));
                    break;
                case 5:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = sc.nextDouble();
                    System.out.println("Área: " + calcularAreaCirculo(radio));
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en pesos: ");
                    double pesos = sc.nextDouble();
                    System.out.println("En dólares: " + convertirPesosADolares(pesos));
                    break;
                case 7:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println(saludoFormal(nombre));
                    break;
                case 8:
                    System.out.print("Ingrese un texto: ");
                    String texto = sc.nextLine();
                    System.out.println("Texto invertido: " + invertirCadena(texto));
                    break;
                case 9:
                    System.out.print("Ingrese un número: ");
                    int num = sc.nextInt();
                    System.out.println("¿Es positivo? " + esPositivo(num));
                    break;
                case 10:
                    System.out.print("Ingrese un año: ");
                    int anio = sc.nextInt();
                    System.out.println("¿Es bisiesto? " + esBisiesto(anio));
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
