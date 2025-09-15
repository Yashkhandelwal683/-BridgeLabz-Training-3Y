class PartTimeEmployee extends Employee {
    private int workHours;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours;
    }
}
