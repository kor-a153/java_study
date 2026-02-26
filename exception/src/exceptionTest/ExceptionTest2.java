package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "채팅을 입력" , input = null;
		
		
		
		try {
			input = sc.nextLine();
			
			if(input.contains("바보")) {
				throw new BadWordException("바보라고 ㄴㄴ");
			}
			System.err.println(input);
		} catch (BadWordException e) {
		System.out.println(e.getMessege());
		}
		catch (Exception e) {
		e.printStackTrace();
	}
} //그냥 예외처리하면 싹다 예외로 해버리니까 우리가 예외를 만들자.
