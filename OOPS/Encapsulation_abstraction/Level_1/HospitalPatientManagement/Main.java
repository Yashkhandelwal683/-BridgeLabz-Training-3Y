import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(1, "John Doe", 30, 1000, 5));
        patients.add(new OutPatient(2, "Jane Smith", 25, 500));

        for(Patient p : patients) {
            System.out.println(p.getPatientDetails() + ", Bill: " + p.calculateBill());
        }
    }
}
