import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        university.datainitialize();

        Scanner scan = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = scan.nextInt();
            handleMenuOption(option, university, scan);
        }while (option!= 4);
    }

    private static void printMenu() {
        System.out.println("Bienvenido al sistema universitario");
        System.out.println("1. Mostrar profesores");
        System.out.println("2. Mostrar cursos");
        System.out.println("3. Crear estudiante");
        System.out.println("4. Salir");
        System.out.print("Enter your choice: ");
    }

    private static void handleMenuOption(int option, University university, Scanner scan) {
        switch (option) {
            case 1:
                university.showTeachers();
                break;
            case 2:
                university.showCourses();
                break;
            case 3:
                System.out.println("Creando un nuevo estudiante...");
                System.out.print("Ingresa #CC del estudiante: ");
                String id = scan.next();
                System.out.print("Ingresa el nombre del estudiante: ");
                String name = scan.next();
                System.out.print("Ingresa la edad del estudiante: ");
                int age = scan.nextInt();
                university.createStudent(id, name, age);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida, por favor intentalo nuevamente.");
        }
    }

}
