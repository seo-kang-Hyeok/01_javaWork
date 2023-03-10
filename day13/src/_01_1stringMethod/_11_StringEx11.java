package _01_1stringMethod;

import java.util.Arrays;

public class _11_StringEx11 {

	public static void main(String[] args) {
		//문자열 분리
		// 1.  String클래스의 split()메서드
		// 2. StringTokenizer클래스
		
		String text = "홀길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		
		//향상된for문
		for(String i : name) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0; i<name.length; i++) {
			if(i < name.length-1) //2번 까지는 ,넣어줘라
				System.out.print(name[i] + ",");
			else
				System.out.println(name[i]);//아니면 나머진 넣지마라.
		}
		System.out.println();

		String str = "";
		for(int i=0; i<name.length; i++) {
			str += (i==0) ? name[i] : "," +name[i];
		}
		System.out.println(str);

		text = "홀길동,아무개&이순신-강감찬";
		String[] names = text.split(",|&|-");//, 
		System.out.println(Arrays.toString(names));
	
	}

}
