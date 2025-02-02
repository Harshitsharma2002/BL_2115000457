public class Course{
    private String courseName;
    private String duration;
    private int fee;
    private static String instituteName="GLA University";
    public Course(){
    courseName="";
    duration="";
    fee=0;
    }
    public Course(String courseName, String duration, int fee){
    this.courseName=courseName;
    this.duration=duration;
    this.fee=fee;
    }
    public void displayCourseDetails(){
    System.out.println("Course Name: "+ courseName);
    System.out.println("Duration: "+duration);
    System.out.println("Fee: "+fee);
    System.out.println("Institute Name: "+instituteName);
    }
    public void updateInstituteName(String name){
    instituteName=name;
    }
    public static void main(String [] args){
    Course c1=new Course();
    c1.displayCourseDetails();
    Course c2=new Course("Computer Science","2 months",5000);
    c2.displayCourseDetails();
    c2.updateInstituteName("Sanskriti");
    Course c3=new Course();
    c3.displayCourseDetails();
    }
    }