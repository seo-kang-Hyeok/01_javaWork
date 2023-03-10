package chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		//2줄로 변수변경
		String name; //문자열 변수 생성됨.
		name = "나도코딩"; //오른쪽 값을 왼쪽 변수에 넣어 주겠다는뜻.!
		//1줄로 선언과 동시에 변경
		String name2 = "나도코딩"; //변수를 지정하는 2가지 방법^^
//		정수형 변수 숫자는 따옴표가 필요 없습니다.
		int hour = 15;
		
		
		System.out.println(name + "님, 배송이 시작됩니다. "+hour+"시에 방문예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다");

//		실수형 변수 Double
		Double score = 90.5;
//		문자열 변수 1글자 char 작은 따옴표''
		char grade = 'A';
		name = "강백호"; //위에 같은 이름의 변수가 있어도 괜찮아요. 값이 바뀌기 때문이죠 ^^ 
		System.out.println(name + "님의 평균 점수는 "+ score + "점 입니다.");
		System.out.println("학점은" + grade +"입니다.");
		
		//참과 거짓 boolean
		boolean pass = true;
		System.out.println("이번 시험에 합격했을까요?" + pass);
		
		//Double 정밀한 값을 내기 좋은 자료형
		////비교적 정밀한 값을 내지 못하는 float
		double d = 3.14;	//실수값을 입력하면 더블이라고 인식하는데
		float f = 3.14f;	 	//float라고 지정하니까 오류가 나버린다! 뒤에 F!
		// double은 그냥 넣어주면 되고 float는 끝에f를 적어주면 됩니다.
		System.out.println(d);
		System.out.println(f);

		d = 3.143223423;
		f =3.123232132f;
		System.out.println(d);
		System.out.println(f);
		//같은 값을 넣어서 출력했지만 다른 값이 나와요 ! float는 뒤에 정밀한 데이터가 나오지 않아요!
		
//		int i = 1000000000000; //int가 계산하기엔 너무 커요! 정수형은 인트로 자동!범위가 21억을 초과하지 않으면 int 넣으셔도 됩니다^^
		long l = 1000000000000000000L; 
		//대문자로 L적어주세요. float와 마찬가지로 뒤에 자동으로 int값이라고 생각하기 때문에 L을 붙혀줘야 합니다. 소문자로 적으면 숫자 1과 햇갈려요!
		l = 1_000_000_000_000_000_000L; //숫자 구분이 어려우면 이렇게 출력해줘도 됩니다 ! print할 땐 출력되지 않아요 !
		System.out.println(l);

		//배운 자료형
//		숫자형 = int, long, float, double, 
//		문자형 = char, String
//		참과거짓 = boolean
//		중요한건 사용하고자하는 용도에 따라 적합한 자료형을 사용하자!
//		들어 커피를 마시러 갔는데
//		너무 작은 사이즈 컵에 커피를 주면 넘쳐서 따르지 못하고 너무 큰 사이즈 컵은 공간을 낭비 한다고 생각하면 이해하기 쉽습니다 ^^
//		

}

}