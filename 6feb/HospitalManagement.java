
import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println(name + " is consulting " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("  - Dr. " + d.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Doctor drGaurav = new Doctor("Dr. Gaurav");
        Doctor drGuzzar = new Doctor("Dr. Guzzar");

        Patient patientAmit = new Patient("Amit");
        Patient patientRaj = new Patient("Raj");

        drGaurav.consult(patientAmit);
        drGaurav.consult(patientRaj);
        drGuzzar.consult(patientRaj);

        drGaurav.showPatients();
        drGuzzar.showPatients();

        patientAmit.showDoctors();
        patientRaj.showDoctors();
    }
}
