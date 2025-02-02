public class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking(){
    guestName="";
    roomType="";
    nights=0;
    }
    public HotelBooking(String guestName, String roomType, int nights){
    this.guestName=guestName;
    this. roomType=roomType;
    this.nights=nights;
    }
    public HotelBooking(HotelBooking hb){
    this.guestName=hb.guestName;
    this. roomType=hb.roomType;
    this.nights=hb.nights;
    }
    public void Display(){
    System.out.println("Guestname: "+guestName);
    System.out.println("roomType: "+roomType);
    System.out.println("nights: "+nights);
    }
    public static void main(String [] args){
    HotelBooking hb1=new HotelBooking();
    HotelBooking hb2=new HotelBooking("Abhinav","premium suite",3);
    HotelBooking hb3=new HotelBooking(hb2);
    hb1.Display();
    hb2.Display();
    hb3.Display();
    }
    }