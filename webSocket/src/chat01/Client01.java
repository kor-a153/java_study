package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
		String serverIp = "192.168.12.8";
		int port = 1100;
		Scanner sc = new Scanner(System.in);
		try(
			Socket socket = new Socket (serverIp,port);
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
		) {
			System.out.println("서버 연결");
			
			
			String message = "안녕";
			
			
			String messString = sc.nextLine();
			writer.println(message);
			
			System.out.println("서버로 [" + message +"] 를 전송.");
			
			
		}	catch (IOException e) {
			e.printStackTrace();
		}
	}
}
