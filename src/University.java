import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Course> courses;

    public University() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void datainitialize() {
        teachers.add(new FullTimeTeacher("Profesor A", 2000, 3));
        teachers.add(new PartTimeTeacher("Profesor B", 15, 10));

        students.add(new Student("0001", "Juan Jaimes", 20));
        students.add(new Student("0002", "Ana Botero", 22));

        List<Student> classStudent = new ArrayList<>();
        classStudent.add(students.get(0));
        courses.add(new Course("C001", "Mathematics", teachers.get(0), classStudent));
    }


    public void showTeachers() {
        System.out.println("\n");
        System.out.println("Lista de profesores:");
        for (Teacher teacher : teachers) {
            System.out.println("Nombre : " + teacher.getName() + " salario: " + teacher.getSalary());
        }
    }

    public void showCourses() {
        System.out.println("Lista de cursos:");
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            System.out.println((i + 1) + ". " + course.getName() + " - Profesor: " + course.getTeacher().getName());
        }
    }

    public void createStudent(String id, String name, int age) {
        students.add(new Student(id, name, age));
        System.out.println("Estudiante creado: " + name);
    }

    public List<Course> getCourses() {
        return courses;
    }
    public List<Student> getStudents() {
        return students;
    }
}
