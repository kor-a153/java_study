package inputTask;

// 컨트롤 쉬프트 o 하면 왠만한건 자동으로 임포트 해줌
import java.util.Scanner;

public class InputTask01 {
   public static void main(String[] args) {
      // Scanner를 사용하여, 두 정수를 입력 받고,
      // 덧셈 결과를 출력하시오.
      // 단 next()만 사용
	   Scanner sc = new Scanner(System.in);
	   String message = "두 숫자를 입력하세요 \n(정수만입력하세요!)";
			   
			   int num1 = 0 , num2 = 0 , totalNum = 0;
	   
		   System.out.println(message);
		   num1 = sc.nextInt();// 바로 정수로 바꿔주기 위해 인태거.파스인트로 sc.next를 감싸 줌.
		   num2 = sc.nextInt();
		   
		   totalNum = num1 + num2 ; 
	   System.out.println("\n 결과값 : " + totalNum);
   }
}

//강사님코드
//package inputTask;
//
////Ctrl + Shift + O
//import java.util.Scanner;
//
//public class InputTask01 {
//public static void main(String[] args) {
//   // Scanner를 사용하여, 두 정수를 입력 받고,
//   // 덧셈 결과를 출력하시오.
//   // 단 next()만 사용
//   Scanner sc = new Scanner(System.in);
//   String message = "두 정수를 입력하세요.\nex)10 20",
//         result = "%d + %d = %d";
//   int num1 = 0, num2 = 0;
//   
//   System.out.println(message);
//   num1 = Integer.parseInt(sc.next());
//   num2 = Integer.parseInt(sc.next());
//   System.out.printf(result, num1, num2, num1 + num2);
//}
//}
