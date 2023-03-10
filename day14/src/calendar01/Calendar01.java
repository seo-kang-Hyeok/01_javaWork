package calendar01;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("현재년도 : " +today.get(Calendar.YEAR));
		//월은 0부터 시작 +1로 출력해야함.
		System.out.println("현재 월 : " +(today.get(Calendar.MONTH) + 1));
		System.out.println("올 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("---------------------------");
		
//		동일
		System.out.println("날짜 : " + today.get(Calendar.DATE));
		System.out.println("날짜 : " + today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("365일중 몇일 : " + today.get(Calendar.DAY_OF_YEAR));		
		System.out.println("---------------------------");
	
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1~7, 1:일요일) : " + week);
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

		System.out.println("오전_오후(0:오전, 1:오후) " + today.get(Calendar.AM_PM));
		System.out.println("시간 (0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간 (0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("------------------------------");
//		문제
//		3월 2일
//		오후 3시 2분
//		목요일 이렇게 출력해보세요.
		System.out.println((today.get(Calendar.MONTH)+1)+"월 "+today.get(Calendar.DAY_OF_MONTH) + "일");
		int time =today.get(Calendar.AM_PM);
		String time1 = null;
		switch (time) {
		case 0 : 
			time1 = "오전";
			break;
		case 1 : 
			time1 = "오후";
			break;
		}
		System.out.println(time1+" "+( today.get(Calendar.HOUR))+"시 " + today.get(Calendar.MINUTE)+ "분 ");
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
