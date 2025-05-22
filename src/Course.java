import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String course;
    private String name;
    private String classroom;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, String course, Teacher teacher, List<Student> students) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
