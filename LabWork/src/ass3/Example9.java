package ass3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Example9 {
	
	void getDuration(LocalDate currentDate, LocalDate secondDate ) {
		
		Period difference=Period.between(currentDate, secondDate);
		
		System.out.print("Duration:\n");
		System.out.print(difference.getDays()+" days "+difference.getMonths()+" months "+difference.getYears()+" years");
	}

	public static void main(String[] args) {
		
		Example9 ex=new Example9();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate currentDate=LocalDate.now();
		System.out.println("current date:"+dtf.format(currentDate));
		LocalDate secondDate=LocalDate.of(2022, 05, 11);
		System.out.println("given date:"+secondDate);
		
        ex.getDuration(currentDate, secondDate);
	}

}
