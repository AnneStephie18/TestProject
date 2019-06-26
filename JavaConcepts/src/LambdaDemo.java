import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

interface A
{
	void show(int i);
}
public class LambdaDemo {
	public static void main(String[] args) {
		A obj;
		obj=i->System.out.println("hi  "+i);
		obj.show(10);
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDate d1=LocalDate.of(1996,Month.SEPTEMBER,18);
		System.out.println(d1);
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalTime t1=LocalTime.of(19,20);
		System.out.println(t1);
		LocalTime t3=LocalTime.now(ZoneId.of("Asia/Dubai"));System.out.println(t3);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		Instant i=Instant.now();//machine readable
		System.out.println(i);
		LocalDateTime ldt=LocalDateTime.now();//human readable time
		System.out.println(ldt);
	}

}
