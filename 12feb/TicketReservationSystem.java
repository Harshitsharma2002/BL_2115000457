class Ticket{
    String ticketName;
    String MovieName;
    int seatNumber;
    int ticketId;
    Ticket next;
    public Ticket(String ticketNAme,String MovieName,int seatNumber,int ticketId){
        this.ticketName=ticketNAme;
        this.MovieName=MovieName;
        this.seatNumber=seatNumber;
        this.ticketId=ticketId;
        this.next=null;
    }
}
class CircularLinkedList{
    Ticket head,tail;
    int count=0;
    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void addTicket(String ticketNAme,String MovieName,int seatNumber,int ticketId){
        Ticket ticket=new Ticket(ticketNAme, MovieName, seatNumber, ticketId);
        count++;

        if(head==null){
            head=ticket;
            tail=ticket;
            tail.next = head;
            return;
        }
        tail.next=ticket;
        tail=ticket;
        tail.next=head;

    }
    public void  removeByTicketId(int id){
        if (head == null) return;
        if (head.ticketId == id) {
            if(head==tail){
                head=null;
                tail=null;
                return;
            }
            head = head.next;
            tail.next = head; 
            count--;
          
        }
    }
    public void searBycustomer(String customer){
        Ticket temp=head;
        if(tail.ticketName.equals(customer)){
            System.out.println("Ticket Name: "+temp.ticketName+" "+"Movie Name: "+temp.MovieName   );
            return;
        }
        while(temp!=tail){
            if(temp.ticketName.equals(customer)){
                System.out.println("Ticket Name: "+temp.ticketName+" "+"Movie Name: "+temp.MovieName   );
                return;
            }
            temp=temp.next;

    }
    System.out.println("no customer by this name");
}
        public int TotalTickets(){
            return count;
        }


}
class TicketReservationSystem{
    public static void main(String[] args) {
        CircularLinkedList c=new CircularLinkedList();
        c.addTicket("fdsf", "fddf", 2, 1);
        c.addTicket("fsd", "fd", 0, 0);
        c.searBycustomer("fdsf");
        c.searBycustomer("sdfsdfsd");
        System.out.println(c.TotalTickets());
}
}