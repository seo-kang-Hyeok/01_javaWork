package _04_student;

import java.util.Arrays;
import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[ ] personArr = new String[5];

		for(int i = 0; i < personArr.length; i++) {												//	 	1. length()오류(오류)
		System.out.print(i+1 + "번째 주민번호 입력 : ");											// 		2. i+1 번째
		String personId = sc.nextLine();
			if((personId.length() == 14)) {
			char gender = personId.charAt(7);													//		3. 8번째 7로 수정
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
				personArr[i] = personId.substring(0, 8) + "******";								// 		4. i++ 수정
				} 	else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					--i;
					}
			} else {
			System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
			--i;
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));

	}

	}

