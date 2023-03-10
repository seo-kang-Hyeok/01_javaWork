package calendar01;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date04 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());  //Fri Mar 03 11:12:19 KST 2023
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //시간 hh-12시 HH-24시
		System.out.println(sdf.format(now));  //2023-03-03 11:12:19 - 원하는 데이터를 추출.

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //
		System.out.println(sdf2.format(now));  //2023-03-03 11:12:19 오전 - 원하는 데이터를 추출.
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); //HH24시
		System.out.println(sdf3.format(now));  //23-03-03 11:12:19

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf4.format(now)); //2023/03/03
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yy/M/d");
		System.out.println(sdf5.format(now)); //23/3/3
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf6.format(now)); //23/3/3

		SimpleDateFormat sdf7 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf7.format(now)); //23/3/3
		
		//요약
		//yyyy(년.yy) MM(월.M) dd(일.d) e(요일) a(오전.오후) HH(24시.hh12시) ss(초.s) 
		//순서도 마음대로 할 수 있다. 월과 대소문자로 구분 .구분선은 마음대로 년월일./:-등
		
	}
}
