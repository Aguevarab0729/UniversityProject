import java.util.ArrayList;
import java.util.List;


public class University {
    private List<Teacher> teachers;
    private List<Students> students;
    private List<Course> courses;

    public University() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void datainitialize() {

        teachers.add(new FullTimeTeacher("T001", "John Martinez", 35, "Mathematics", 3900000));
        teachers.add(new PartTimeTeacher("T002", "Juliana Fajardo", 26, "Python", 3200000));

        students.add(new Students("S001", "Andres Martinez", 20));
        students.add(new Students("S002", "Yolanda Beltran", 22));

        List<Student> classStudent = new ArrayList<>();
        classStudent.add(students.get(0));
        classes.add(new Class("C001", "Mathematics", teachers.get(0), classStudent));
    }

    public void showTeachers() {
        System.out.println("Lista de profesores:");
        for (Teacher teacher : teachers) {
            System.out.println("Nombre : " + teacher.getName() + "salario: " + teacher.getSalary());
        }
    }

    public void showCourses() {
        System.out.println("Lista de cursos:");
        for (Course course : courses) {
            System.out.println("Nombre: " + course.getName() + "Profesor: " + course.getTeacher().getName());
        }
    }

    public void addStudent(String id, String name, int age) {
        students.add(new Student(id, name, age));
        System.out.println("Estudiante creado: " + name);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Students> getStudents() {
        return students;
    }
}
