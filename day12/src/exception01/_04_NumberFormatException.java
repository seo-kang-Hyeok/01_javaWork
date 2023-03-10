package exception01;

class _04_NumberFormatException {

	public static void main(String[] args) {
		String[] strNum = {"23", "17", "3.141592"};
		int i = 0;
		try {
			for(i=0; i<strNum.length; i++) {
				int x = Integer.parseInt(strNum[0]);	//기본 자료형끼린 앞에(int)로 바꿀 수 있지만 Integer.parseInt로 바꿔줘야 합니다.
				System.out.println(x);
			}
		} catch (NumberFormatException e) {
			System.out.println(strNum[i] + "은 실수형 이므로 정수로 변환 할 수 없습니다.");
		}
	}
}