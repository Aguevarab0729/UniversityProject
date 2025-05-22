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
        System.out.print("Selecciona una opcion: ");
    }

    private static void handleMenuOption(int option, University university, Scanner scan) {
        switch (option) {
            case 1:
                university.showTeachers();
                break;
            case 2:
                university.showCourses();
                System.out.print("Selecciona el número del curso para ver detalles: ");
                int idx = scan.nextInt();
                if (idx > 0 && idx <= university.getCourses().size()) {
                    Course course = university.getCourses().get(idx - 1);
                    System.out.println("Curso: " + course.getName());
                    System.out.println("Profesor: " + course.getTeacher().getName());
                    System.out.println("Estudiantes:");
                    for (Student s : course.getStudents()) {
                        System.out.println("- " + s.getName());
                    }
                } else {
                    System.out.println("Índice de curso inválido.");
                }
                break;
            case 3:
                System.out.println("Estas creando estudiante nuevo en la base de datos");
                System.out.print("Ingresa el id (# identificacion) del estudiante: ");
                String id = scan.next();
                System.out.print("Ingresa el nombre del estudiante: ");
                String name = scan.next();
                System.out.print("Ingresa la edad del estudiante: ");
                int age = scan.nextInt();
                university.createStudent(id, name, age);

                // Mostrar cursos y agregar un estudiante
                university.showCourses();
                System.out.print("Selecciona el número del curso para inscribir al estudiante: ");
                int courseIdx = scan.nextInt();
                if (courseIdx > 0 && courseIdx <= university.getCourses().size()) {
                    university.getCourses().get(courseIdx - 1).getStudents()
                            .add(university.getStudents().get(university.getStudents().size() - 1));
                    System.out.println("Estudiante agregado al curso.");
                } else {
                    System.out.println("curso invalido.");
                }
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida, por favor intentalo nuevamente.");
        }
    }
}
