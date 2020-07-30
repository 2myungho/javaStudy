import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; //열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //일~토 까지의 숫자르 리턴 (1~7)
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2 :
			today = Week.MONDAY; break;
		case 3 :
			today = Week.THURSDAY; break;
		case 4 :
			today = Week.WEDNESDAY; break;
		case 5 :
			today = Week.THURSDAY; break;
		case 6 :
			today = Week.FRIDAY; break;
		case 7 :
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today );

	}

}
