public class Patient{
    static String hospitalName="City Hospital";
    private String name;
    private int age;
    private String ailment;
    private final String patientID;
    private static int totalPatients=0;
    public Patient(String name, String ailment, int age, String patientID){
    this.name=name;
    this.ailment=ailment;
    this.age=age;
    this.patientID=patientID;
    totalPatients++;
    }
    static int getTotalPatients(){
    return totalPatients;
    }
    public void Display(){
    System.out.println("Patient ID: "+patientID);
    System.out.println("Patient Name "+name);
    System.out.println("Patient Age: "+age);
    System.out.println("Patient Ailment: "+ailment);
    }
    public static void main(String [] args){
    Patient p=new Patient("pappu","Fever",18,"p0876");
    System.out.println(p instanceof Patient);
    System.out.println(p.getTotalPatients());
    p.Display();
    }
    }