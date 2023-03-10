package exception01;

public class _02_NullpointException {

	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		} catch(NullPointerException e) { //무슨오류가 생겼는지는 e에 들어있습니다.
			System.out.println("데이터가 들어있지 않습니다.");
			System.out.println("메시지 : " + e);
		}
	}

}
