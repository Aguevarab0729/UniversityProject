public class FullTimeTeacher extends Teacher {
    private double baseSalary;
    private int experienceYears;

    public FullTimeTeacher(String name, double baseSalary, int experienceYears) {
        super(name);
        this.baseSalary = baseSalary;
        this.experienceYears = experienceYears;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        setSalary(baseSalary * (1.10 * experienceYears));
    }
}
