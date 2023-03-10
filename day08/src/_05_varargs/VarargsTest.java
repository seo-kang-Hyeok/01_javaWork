package _05_varargs;

public class VarargsTest {

	public static void main(String[] args) {
		int[] a = {100,200,300,400,500};
		
		for(int i=0;i<a.length; i++) {//처음부터 끝까지 전부 도세요. .
			System.out.println(a[i]);
		} 
		System.out.println("---------------------------------------");
		
		for(int b:a) {//처음부터 끝까지 전부 도세요. 합리적이다.
			System.out.println(b);
		}
		System.out.println("=======================================");
		
		System.out.println(con("a","b","c","b","e"));
		System.out.println(con2("a","b","c","b","e"));
		System.out.println(con2("a","b","c","b","e"));
		System.out.println(con2("a","b","c","b","e"));
	}
		
	static String con(String... str) { //...뒤에 str는 변수명 ...은 배열로 자동으로 들어간다.
	//인자가 0개 ~ 무한대까지 문자열을 받을 수 있다.
		String result = "";
		for ( String arst : str) { //arst는 변수이름
			result += arst + " ";
		}
		return result;
	}
			//인자가 1개이상 들어와야 한다.
	 static String con2(String format1, String... str) {
		String result = "";
		for ( String arst : str) { 
			result += arst + format1;
		}
		return result;
	 }

}