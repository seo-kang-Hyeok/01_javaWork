package _03_ex;
import java.util.Arrays;
import java.util.Scanner;
public class _01_Ex {
	public static void main(String[] args) {
	//사용자로 부터 주민 번호를 입력 받아서 13자리
	//13자리가 아니면 다시 입력하세요.
	// 1234561234567(13자리), 123456-1234567(14자리)
	Scanner sc = new Scanner(System.in);				//사용자로 부터 값을 받을께요 ^^												
	String[] student = new String[5];					//String을 받는 변수 student 객체 5개
														//5개의 공간을 입력 받을 것이다. 공간마련	(입력)	
	for(int i=0; i<student.length; i++) {
		System.out.println(i+1 + "번째 주민번호를 입력하세요 ex)123456-1234567 :");
		String jumin = sc.next();
		
		if(jumin.length() == 14) { //jumin에 들어온 길이게 14자리가 맞다면 ? if문을 진행해라.------------
			char gender = jumin.charAt(7);	//charAt를 넣으면 string를 char로 읽을 수 있다. char의 7번째 자리를 gender이라 변수지정		
			if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {//				|14자리일 시 7번째를 gender이라 지정하고 gender이 1혹은 2혹은 3혹은 일일시 if문 발동 
				student[i] = jumin.substring(0,8) + "******";//								|student[i]번째의 = jumin의 0~8번을 잘라 + ******을 붙혀 출력한다.
				// continue;								//								|
			} else {//																		|
				System.out.println("잘못된 형식입니다. 다시입력하세요");//							|
				--i;//																		|
			}	//																			|
		} else {//																			|
			System.out.println("잘못된 형식입니다. 다시입력하세요");//-아니면? 잘못된형식입니다. ------------- 			
			--i;//											출력후 i-- 하고 올라가기		
		}//
	}
	System.out.println("주민번호가 입력됨");//
	System.out.println(Arrays.toString(student));//
}
		//변수 charAt = string의 한 글자를 char타입으로 변경해서 빼온다.
}
