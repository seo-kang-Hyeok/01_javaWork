package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIp);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}


	}

}
