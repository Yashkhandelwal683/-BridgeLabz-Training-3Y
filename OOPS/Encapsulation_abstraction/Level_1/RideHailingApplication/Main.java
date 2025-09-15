import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR1", "John", 10));
        vehicles.add(new Bike("BIKE1", "Alice", 5));
        vehicles.add(new Auto("AUTO1", "Bob", 7));

        double distance = 15;
        for(Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails() + ", Fare for " + distance + " km: " + v.calculateFare(distance));
        }
    }
}
