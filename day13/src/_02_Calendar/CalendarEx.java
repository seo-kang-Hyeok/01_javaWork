package _02_Calendar;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
//		문제
//		3월 2일
//		오후 3시 2분
//		목요일 이렇게 출력해보세요.

		Calendar today = Calendar.getInstance();
		System.out.println((today.get(Calendar.MONTH)+1)+"월 "
		+today.get(Calendar.DAY_OF_MONTH) + "일");
		
		int time =today.get(Calendar.AM_PM);
		String time1 = null;
		switch (time) {
		case 0 : 
			time1 = "오전";
			break;
		case 1 : 
			time1 = "오후";
			
		}
		System.out.println(time1+" "+( today.get(Calendar.HOUR))+"시 " + today.get(Calendar.MINUTE)+ "분");

		int week = today.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1 : 
			System.out.println("일요일");
			break;
		 case 2 : 
			System.out.println("월요일");
			break;
		 case 3 : 
			System.out.println("화요일");
			break;
		 case 4 : 
			System.out.println("수요일");
			break;
		 case 5 : 
			System.out.println("목요일");
			break;
		 case 6 : 
			System.out.println("금요일");
			break;
		 case 7 : 
			System.out.println("토요일");
		}

	
	}

}
