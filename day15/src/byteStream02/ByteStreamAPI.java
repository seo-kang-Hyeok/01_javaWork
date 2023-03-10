package byteStream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamAPI {
	
//	바이트 기반 스트림 :
//	- 바이트 스트림 : 1byte단위로 전송하는 통로
//	- 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
//		
//	xxxInputStream : xxx매체로 부터 데이터를 직접 입력받는 통로
//	xxxOutputStream : xxx매체로 부터 데이터를 직접 출력하는 통로
//		
//	프로그램으로 부터 => 외부매체로 내보내기 (파일)
	public void fileSave ( ) {
		//FileOutputStream : 파일의 형태로 직접적으로 연결하여 1byte 단위 출력하는 스트림
		
//		순서 
//		1. 스트림 생성 (통로만들기)
//		2. 스트림으로 데이터를 출력
//		3. 다 사용한 후 스트림 반납

		//1. 스트림 생성 (통로 만들기)
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			//파일이 없으면 만들고 있으면 덮어쓰기 하시오 라는뜻.
//			fout = new FileOutputStream("a_byte.txt", true); 
			//파일이 없으면 만들고 있으면 파일내용에 이어서 쓰시오.
			//,true 단순 덮어쓰기와 기존파일에 이어서 덮어쓰기가 되는지 정해진다.!
			
			
			
			//2. 스트림으로 데이터를 출력
			fout.write(97); //ASCII코드 'a'
			fout.write('b');
		
			
			byte[] arr = {99,100,101}; //ASCII코드
			fout.write(arr);
			
			fout.write(arr, 1, 2); //arr서 부터 2개?
			
//			fout.write('랑'); //2byte는 깨져서 들어가지 않음.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //finally있어도 되고 없어도 됩니다.
			try {
				// 3. 다 사용한 후 스트림 반납 close반드시!
				fout.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <-- 파일 입력(데이터 가져오기)
	public void fileRead() {
		//FileInputStream : 파일로 부터 1byte단위로 입력 받는 스트림
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt"); //읽어오시오.

//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			
//			//fin.read() 2번씩 호출되기 떄문에 하나 건너씩 출력
			
//			while(fin.read() != -1) {
//				System.out.println(fin.read());
//			}
//---------------------------------------------------//			
			//해결 방법 1. 무한반복을 돌면서 매번 검사.
//			while(true) {
//				int value = fin.read();
//				if(value == -1)
//					break;
//				System.out.println(value);
//			}
//---------------------------------------------------//			
//			
			//해결방법 2. 권장사항
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
