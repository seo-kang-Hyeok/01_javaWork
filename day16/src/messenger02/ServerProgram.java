package messenger02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	/*
	 * * TCP(Transmission Control Protocol)
	 *	 - 서버, 클라이언트 간의 1:1 소켓 통신
	 *	 - 서버와 클라이언트 간의 연결이 되어 있어야 통신 가능
	 * 	 - 신뢰성 있는 데이터 전달
	 *
	 * * Socket
	 *   - 프로세스간의 통신을 담당
	 *   - Input/OutputStream을 가지고 있음(이 스트림에서 입출력이 이루어짐)
	 *   
	 * * ServerSocket
	 *   - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 오면 수락해주는 용도
	 *   - 수락 => 통신할 수 있는 Socket생성
	 */		
	public static void main(String[] args) {
		//1. 포트 지정
		int port = 3005; 
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null; //입력용 스트림
		PrintWriter pw = null; //출력용 스트림
		
		ServerSocket server = null;
		
		try {
			// 2. ServerSocket 객체 생성시 포트 결합
			server = new ServerSocket(port); //(포트번호) try catch

			// 3. 클라이언트로 부터 연결 요청이 오면 수락하고, 통신 할 수 있는 소켓 객체 생성
			System.out.println("클라이언트의 요청을 기다리고 있음.....");
			Socket socket = server.accept();//server.accept();-수락 Socket soket 소켓 연결
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함!!!");
			
			//4. 기반 스트림.보내고 받으려면 스틀미이 있어야겠죠? 소켓에 들어있는 In.out
			//InputStream is = socket.getInputStream();//보내는 넣는 스트림
			//OutputStream os = socket.getOutputStream();//가져오는 나오는 스트림
			
			//5. 보조 스트림
			//br = new BufferedReader(new InputStreamReader(is));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //입력
			pw = new PrintWriter(socket.getOutputStream());                           //출력
			
			pw.println("환영합니다😀😀");
			pw.flush(); //현재 Buffered에 있는 스트림을 강제로 보내고 버퍼를 비운다.
			
			while(true) {
				//클라이언트츩으로 부터 받은 메시지
				System.out.println("클라이언드 : " + br.readLine()); //br에 이쓴ㄴ 걸 읽어오세요.
				
				//서버에서 클라이언너트측으로 보내는 메시지
				System.out.print("서버 : " );
				pw.println(sc.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
