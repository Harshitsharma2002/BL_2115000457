public class Vehicle{
    static int registrationFee=100;
    private String ownerName;
    private String vehicleType;
    final private int registrationNumber;
    public Vehicle(String ownerName, String vehicleType, int registrationNumber){
    this.ownerName=ownerName;
    this.vehicleType=vehicleType;
    this.registrationNumber=registrationNumber;
    }
    static int updateRegistrationFee(int f){
    registrationFee=f;
    return registrationFee;
    }
    public void Display(){
    System.out.println("Registration Fee: "+registrationFee);
    System.out.println("Vehicle Owner: "+ownerName);
    System.out.println("Vehicle Registration Number: "+registrationNumber);
    System.out.println("Vehicle Type: "+vehicleType);
    }
    public static void main(String [] args){
    Vehicle v=new Vehicle("Harshit","car",0001);
    System.out.println(v instanceof Vehicle);
    v.updateRegistrationFee(200);
    v.Display();
    }
    }