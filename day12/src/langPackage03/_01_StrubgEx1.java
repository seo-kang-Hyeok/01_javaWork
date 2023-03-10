package langPackage03;

public class _01_StrubgEx1 {

	public static void main(String[] args) {
		int num = 10;
		String strNum = String.valueOf(num);
		System.out.println(strNum);
		
		String strNum2 = "" + num;
		System.out.println(strNum+strNum2);//문자열
		//문자열로 인식됐는지 확인하는 방법! 더해서 20나오면 숫자열 1010나오면 문자열.
	}

}
