class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9;
    }
}
