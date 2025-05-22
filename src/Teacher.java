public abstract class Teacher {
    private String name;
    private double salary;

    public Teacher(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public abstract void calculateSalary();
}
