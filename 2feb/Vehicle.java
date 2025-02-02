public class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static int registrationFee=1000;
    public Vehicle(){
    ownerName="";
    vehicleType="";
    }
    public Vehicle(String ownerName, String vehicleType){
    this.ownerName=ownerName;
    this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){
    System.out.println("Owner Name: "+ownerName);
    System.out.println("Registration Name: "+vehicleType);
    System.out.println("Registration Fee: "+registrationFee);
    }
    public void updateRegistrationFee(int fee){
    registrationFee=fee;
    }
    public static void main(String [] args){
    Vehicle v1=new Vehicle();
    v1.displayVehicleDetails();
    Vehicle v2=new Vehicle("Pradeed","Celerio");
    v2.displayVehicleDetails();
    v2.updateRegistrationFee(3000);
    Vehicle v3=new Vehicle();
    v3.displayVehicleDetails();
    }
    }