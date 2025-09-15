import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000));
        vehicles.add(new Bike("BIKE456", 500));
        vehicles.add(new Truck("TRK789", 2000));

        for(Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " Rental Cost (3 days): " + v.calculateRentalCost(3));
        }
    }
}
