package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
   public static void main(String[] args) {
//      ip, port
      String serverIp = "192.168.5.254";
      int port = 1100;
      String clientMessage = null, serverMessage = null; 
      
      try(
            Socket socket = new Socket(serverIp, port);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc = new Scanner(System.in);
      ){
         System.out.println("서버가 연결되었습니다.");
//         while 반복문으로 서버에 메세지를 보낼수 있게 한다.
         while(true) {
            System.out.println("서버로 메세지 보내기 >>");
            clientMessage = sc.nextLine();
//          메세지 받아서 버퍼에 넣음
            bufferedWriter.write(clientMessage + "\n");
//          버퍼에 쌓은걸 flush로 밀어줌.
            bufferedWriter.flush();
            System.out.println("[클라이언트]: " + clientMessage);
            
//          서버에서 받은 메세지.
            serverMessage = bufferedReader.readLine();
            System.out.println("[서버]: " + serverMessage);
         }
//         에러 발생시. catch로	
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}

