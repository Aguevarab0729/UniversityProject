public class PartTimeTeacher extends Teacher {
    private final double baseSalary;
    private int hoursWorked;

    public PartTimeTeacher(String name, double baseSalary, int hoursWorked) {
        super(name);
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        setSalary(baseSalary * hoursWorked);
    }
}
