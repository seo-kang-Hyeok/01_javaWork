package exception01;

public class _08_MultiCatch {

	public static void main(String[] args) {
		String[] str = {"a","b","c"};
		String[] strNum = {"23", "17", "3"};
		int i = 0;
		
	try {
		str[1] = "d";
		str[2] = "e";
	
		for(i=0; i<strNum.length; i++) {
			int x = Integer.parseInt(strNum[0]);	
				System.out.println(x);
			}
	
			int num = 9/0;
					
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다. index는 2까지만 가능");
		} catch (NumberFormatException e) {
			System.out.println(strNum[i] + "은 실수형 이므로 정수로 변환 할 수 없습니다.");
		} catch(Exception e) { 
			//exceotion은 모든 오류를 포함하기 때문에 가장 아래 적어주면 됩니다. 코드는 위에서 부터 내려 오기때문에
			System.out.println(e.getMessage());
		} finally { //무조건 실행. 위에 코드와는 상관없이 무조건 실행. 어파치 실행되고 줄이 늘어나기 때문에 요즘엔 많이 사용하지않아요.
	System.out.println("프로그램 종료");
		}
	}	
}
