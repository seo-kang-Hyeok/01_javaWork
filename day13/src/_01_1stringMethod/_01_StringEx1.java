package _01_1stringMethod;

public class _01_StringEx1 {

	public static void main(String[] args) {
		int num = 10;
		String strNum = String.valueOf(num);
		System.out.println(strNum);
		

		String strNum2 = "" + num;
		System.out.println(strNum+strNum2);

	}
}
