package file01;

import java.io.File;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {//File을 만들어 봅니다.
		try {
			// 경로를 지정하지 않고 파일 만들기
			File f1 = new File("test.txt"); //try catch 해야해
			f1.createNewFile();   //메소드까지 호출해야만 파일이 만들어짐.
	
			//존재하고 있는 폴더에 파일 생성 : 경로 지정 2가지방법
			//File f2 = new File("D:\\test.txt");1.D밑에 test를 만드세요! 
			File f2 = new File("D:/kher.txt"); //2.D밑에 test를 만드세요!
			f2.createNewFile();   //메소드까지 호출해야만 파일이 만들어짐.

			//폴더 만들기
			File tempfolder = new File("D:/temp");
			tempfolder.mkdir(); //폴더생성
			
			//temp폴더에 test.txt파일 만들기
			File f3 = new File("D:/temp/test.txt");
			f3.createNewFile();
			
			//파일 존재 유무 묻기 . true false
			System.out.println(f1.exists());  //존재하는지
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile());  //파일인지 아닌지
			System.out.println(tempfolder.isFile());
			System.out.println("-------------");
			
			//parent폴더 만들기
			File folder = new File("parent");
			folder.mkdir();
			
			//parent폴더안에 person.txt파일 만들기
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace(); //만들지 못하는 경우가 생길 수 있기 때문에 try catch하라고 구현이 되어있음.
		}
		
	}
}
