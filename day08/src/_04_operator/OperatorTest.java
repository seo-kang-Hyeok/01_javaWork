package _04_operator;

public class OperatorTest {
	int b; //인스턴스 변수 (객체생성을 해야만 사용가능)
	static int c = 20; //클래스 변수
	
	public static void main(String[] args) {
		int a = 30; //지역 변수
		Operator op1 = new Operator(); //객체 생성.
		//오버로딩을 활용하여 형식에 맞게 알아서 찾아갑니다. double double 
		//더하기
		System.out.println(op1.add(9.7));
		System.out.println(op1.add(5, 4));
		System.out.println(op1.add(31.56 ,83.86));
		System.out.println(op1.add());	
		
		int[] arr = {3,4,5,34,43,45,34,45,34,5,435,34};
		System.out.println(op1.add(arr));
		
		int arr2[] = new int[100];  //100개의 값 자동으로 넣어주기.
		int value = 0;
		for (int i = 0; i < arr2.length; i++) {
			value += 3;
			arr2[i] = value;
		}
		System.out.println(op1.add(arr2));
		
		System.out.println("----------------------");		
		//빼기
		System.out.println(op1.sybtract(9.7));
		System.out.println(op1.sybtract(5, 4));
		System.out.println(op1.sybtract(31.56 ,83.86));
		System.out.println(op1.sybtract());	
		System.out.println("----------------------");
		//나누기
		System.out.println(op1.divide(9.7));
		System.out.println(op1.divide(5, 4));
		System.out.println(op1.divide(31.56 ,83.86));
		System.out.println(op1.divide());	
		System.out.println("----------------------");
		//곱하기
		System.out.println(op1.multoply(9.7));
		System.out.println(op1.multoply(5, 4));
		System.out.println(op1.multoply(31.56 ,83.86));
		System.out.println(op1.multoply());	
		//같은 클레스에 생성된 static(클래스 변수, 메서드)는 바로 출력.사용이 가능합니다.
		System.out.println("클래스 메서드 호출 : " + msg());
		System.out.println("클래스 변수 c의 값 : " + c); 
		//그렇지않은 인스턴스 변수, 메서드는 객체 생성 후 사용이 가능합니다.
		OperatorTest ot = new OperatorTest();
		System.out.println("인스턴스 변수 b의 값 : " + ot.b);
		System.out.println("인스턴스 메서드 호출 : " + ot.sum2(1));
		//매개변수에 다양한 값을 넣어 줄 수 있다. 변수. 등
		//int 로 지정해두었기 때문에 int형으로 저장되어 있다면 매개변수에 넣을 수 있다.
		System.out.println("인스턴스 메서드 호출 : " + ot.sum2(op1.num1));
	} //main 닫기.
	//main이 닫힌 여기도 매서드 입력 가능합니다.
	//한 클레스에 들어있는 메서드는 그냥 사용 할 수 있습니다.
	//static 메서드로 작성.
	//일반적으로 클레스이름.메서드(); 그러나 같은 클레스 안에 있기 때문에
	//메서드();로 사용 가능하다.
	static String msg() {
		return "안녕";
	}	
	int sum2(int a) {
		return a+100;
	}

	
}

