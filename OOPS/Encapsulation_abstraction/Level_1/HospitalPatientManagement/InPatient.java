class InPatient extends Patient {
    private double dailyRate;
    private int daysStayed;
    public InPatient(int patientId, String name, int age, double dailyRate, int daysStayed) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysStayed = daysStayed;
    }
    @Override
    public double calculateBill() {
        return dailyRate * daysStayed;
    }
}
