import java.time.format.DateTimeFormatter;
import java.time.*;
public class TimeZoneDisplay {
public static void main(String [] args){
DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
ZonedDateTime g=ZonedDateTime.now(ZoneId.of("GMT"));
ZonedDateTime i=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
ZonedDateTime p=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
System.out.println("GMT:"+g.format(f));
System.out.println("IST:"+i.format(f));
System.out.println("PST:"+p.format(f));
}
}