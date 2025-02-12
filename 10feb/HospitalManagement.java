
import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, String diagnosis, double roomCharge, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient p1 = new InPatient(101, "Gaurav Patel", 25, "Flu", 2000, 3);
        OutPatient p2 = new OutPatient(102, "Rahul Mehta", 30, "Check-up", 500);

        patients.add(p1);
        patients.add(p2);

        p1.addRecord("Admitted for Flu Treatment");
        p2.addRecord("Routine Checkup");

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: $" + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            System.out.println("---------------------------------");
        }
    }
}

