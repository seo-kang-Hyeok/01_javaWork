package decimalFormat01;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;

public class DecimalFormat1 {
	public static void main(String[] args) {
		double number = 1234567.89;
		DecimalFormat df = new DecimalFormat("0"); //1자리는 나와야 한다는 뜻?
		System.out.println(df.format(number));//12345678 number의 문자를 df타입으로 출력하시오.
		
		//위의 2줄을 한줄로 하면
		System.out.println(new DecimalFormat("0").format(123.789)); //124
		
		System.out.println("-------------------------------------");
		
		System.out.println(new DecimalFormat("0").format(number)); //12345678
		System.out.println(new DecimalFormat("#").format(number)); //12345678
		System.out.println(new DecimalFormat("0.0").format(number)); //정수 1자리 이상 소수점 1자리 출력
		System.out.println(new DecimalFormat("0.00").format(number)); //정수 1자리 이상 소수점 2자리 출력
		System.out.println("-------------------------------------");
		
		number = 1234567.0;
		System.out.println(new DecimalFormat("0.0").format(number)); //1234567.0 해당 자리수 무조건 출력
		System.out.println(new DecimalFormat("#.#").format(number)); //1234567 있으면 출력 없으면 출력하지 않음
		System.out.println("-------------------------------------");

		number = 1234567.89;
		System.out.println(new DecimalFormat("00000000000.0").format(number));
		System.out.println(new DecimalFormat("###########.#").format(number));
		System.out.println("-------------------------------------");

		number = -1234567.89; 
		System.out.println(new DecimalFormat("#.#-").format(number));
		System.out.println(new DecimalFormat("#.#").format(number));//양수이면 +기호를 음수이면-기호를 !
		System.out.println(new DecimalFormat("+#.#;-#.#").format(number));//양수이면 +기호를 음수이면-기호를 !
		//문자열 - or + 기호를 붙히는 것이라 음수가 양수가 되고 양수가 음수가 되진 않습니다.
		System.out.println("-------------------------------------");
		
		//3자리 마다 ,를 찍고 싶다.		
		System.out.println(new DecimalFormat("#,###.#").format(number));
		//4자리 마다 ,를 찍고 싶다.
		System.out.println(new DecimalFormat("#,#####.#").format(number));
		//3자리 마다 ,를 찍고 음수면 - 양수면 + 를 붙혀라
		System.out.println(new DecimalFormat("+#,###.#;-#,###.#").format(number));
		System.out.println("-------------------------------------");
		
		System.out.println(new DecimalFormat("#.#%").format(number));
		System.out.println(new DecimalFormat("\u00A4#,###.#").format(number)); //유니코드 원화표시
		System.out.println(new DecimalFormat("\\#,###.#").format(number)); //글꼴이 한글일때만 통화표시
		System.out.println("=======================================");
		
		//parse()는 DecimalFormat의 조상인 NumberFormat에 정의되어 있는 메소드 : 문자열을 숫자로 변환
		//Number는 래퍼클래스의 조상 (기본자료형 (int, double, char)으ㅡㄹ => Integer, Double 객체화하기 위해 만든 클래스)
		//intValue(), doubleValue() 
		
		String stNum = "1,234,567.89"; //,가 있어서 숫자열로 바꾸기 어렵다. 이럴때 DecimalFormat을 사용한다.
		
		DecimalFormat df2 = new DecimalFormat("#,##.##");
		try {
			Number num = df2.parse(stNum);
//			System.out.println(num*2); 에러 객체(number)타입으로 변환 했기 때문에 연산 안됨. 실수형x
		
			double douNum = num.doubleValue(); //실수형으로 변환
			System.out.println(douNum*2);
			
			//한줄로
			System.out.println((new DecimalFormat("#,###.##").parse("1.234.567.89").doubleValue()) * 3);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
