package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class demo {

	public static void main(String[] args) {

		////////LocalDateTime//////////////////
		System.out.println("//////LocalDateTime////////");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		////////LocalDateTime//////////////////
		System.out.println("//////LocalDateTime////////");
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		////////LocalDateTime//////////////////
		System.out.println("//////LocalDateTime////////");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
	}

}
