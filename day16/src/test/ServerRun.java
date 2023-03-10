package test;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class ServerRun {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		PrintWriter pw = null;
		BufferedReader br = null;

		int port = 5555;
		ServerSocket server = null;
		Socket socket = null;

		  

		try {
			server = new ServerSocket(port);
			System.out.println("\"연락오기 기다리는중...\"");
			socket = server.accept();

			String myLove = "ハŀㄹБ은언ス-łłㄴŀ목ㅁŀ르⊂ŀ….";
			System.out.println(myLove+"님이 채팅방에 접속하셨습니다.");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());

			while(true) {
				String message = br.readLine();
				if(message!=null) {
					System.out.println(myLove+"님이 보낸 메세지 : "+message);
										    
					System.out.print(myLove+"님에게 보낼 메세지 : ");
					String send = sc.nextLine();
	 
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("[a HH:MM:ss]");
					String time = sdf.format(d);
					pw.println(time+send);
					pw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {          
			pw.close();
			try {
				br.close();
				socket.close();
				server.close();        
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}