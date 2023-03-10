package network01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Network01 {

	public static void main(String[] args) {
		//서버에 요청을 위해서 서버의 ip와 포트번호가 있어야 됨.
		//Inetaddress : 네트워크 정보(ip주소 관련)를 확인 할 수 있는 클래스
		//new없이 생성가능
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);		//내pc명 + 내 ip주소
			System.out.println("내PC명 : " + localhost.getHostName());		
			System.out.println("내IP주소 : " + localhost.getHostAddress());
			System.out.println("------------------------");
			
			//도메인을 통해 그 서버에 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println("google 서버명 : " + googleHost.getHostName());
			System.out.println("google IP주소 : " + googleHost.getHostAddress());

			//도메인을 통해 그 서버 관련된 정보를 배열로 얻기
			InetAddress[] naverHost = InetAddress.getAllByName("naver.com");
			System.out.println("네이버 호스트 갯수 : " + naverHost.length);
			for(InetAddress  n : naverHost) {
				System.out.println("naver 서버명 : " +n.getHostName());
				System.out.println("naver IP주소 : " + n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		/*
		System.out.println("==============================");
		url1();
		System.out.println("------------------------------");
		url2();
		System.out.println("------------------------------");
		*/
		imgeDown();
	}
	
	//16일차 수업 시작
	static void url1() {
		try {
			URL url= new URL("https://docs.oracle.com:5000/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html?name=kim&age=23#getByName(java.lang.String)");
			System.out.println("프로토콜 : " +url.getProtocol());
			System.out.println("호스트 이름 : " + url.getHost());
			System.out.println("포트 번호 : " + url.getPort());
			System.out.println("경로 : " + url.getPath());
			System.out.println("Query : " + url.getQuery());
			System.out.println("페이지 링크 : " + url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	static void url2() {
		try {
			URL url= new URL("https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html#getByName(java.lang.String)");
	
			URLConnection conn = url.openConnection();
			//1. 기반스트림 응답을 읽을 입력 스트림, 1byte기반
			//InputStream is = conn.getInputStream();
			//InputStreamReader isr = new InputStreamReader(is);
			
			//2. 보조스트림 : BufferedReader사용 모아출력
			//BufferedReader br = new BufferedReader(isr);
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream())); //위에 지정없이 한줄작성
			BufferedWriter bw = new BufferedWriter(new FileWriter("inetAddress.html"));
			
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
				bw.write(data);
				bw.newLine(); // 개행처리
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void imgeDown() {
		try {
			URL url = new URL("https://dimg.donga.com/wps/NEWS/IMAGE/2022/01/28/111500268.2.jpg");
			URLConnection conn = url.openConnection();
		
			BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("image.png"));
			
			//한 행 읽어와서 쓰고 쓰고
			byte[] data = new byte[8*1024];
			
			int len = 0; 
			while((len = bis.read(data)) != -1) { //bis에서 읽어온 data를 -1이아니면(-1 없음)
				bos.write(data,0,len); //data에 0번인덱스에서 len바이트?이런뜻아닌가?
				
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
