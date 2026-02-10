package operTask;

import java.util.Scanner;

public class OperTask {
   public static void main(String[] args) {
      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
      // 총점과 평균을 구한다.
      // 성적이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
      // 단 if문을 사용하지 않는다.
      // 평균은 소수점 2번째 자리까지만 표기한다.
//	   국영수 받을 방법 만들기
	   Scanner sc = new Scanner(System.in); //이미 있는 메서드를 가져온다구.
	   String message = "각각 수학 국어 영어 점수를 입력하세요\nex)10 30 40";
	   
//	   수영국 data받을곳 만들기
	   int math = 0 , eng = 0 , kor = 0;
//	   총점과 평균 받을 곳 만들기
	   int total = 0 , average = 0, result = 0;
	   String check = null;
	   
	   System.out.println(message);
	   math = sc.nextInt();
	   eng = sc.nextInt();
	   kor = sc.nextInt();
	   
	   total = math + eng + kor;
	   average =  (total / 3) ;
	   
	   result = average > 60 ? 1 : 
		   average == 60 ? 0 : -1;   
	   
	   check = result > 0 ? "합격" : 
		   result == 0 ? "재평가" : "불합격";
	   
	   System.out.println("총점 : " + total + "점");
	   System.out.println("합격여부 : "+check);
	   
	        
   }
}

//package operTask;
//
//import java.util.Scanner;
//
//public class OperTask {
//   public static void main(String[] args) {
//      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
//      // 총점과 평균을 구한다.
//      // 평균이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
//      // 단 if문을 사용하지 않는다.
//      // 평균은 소수점 2번째 자리까지만 표기한다.
//      Scanner sc = new Scanner(System.in);
//      String message = "수학, 영어, 국어 점수를 차례대로 입력하세요.\nex)70 80 80", result = "";
//      int mathScore = 0, engScore = 0, korScore = 0, totalScore = 0;
//      double average = 0.0;
//      System.out.println(message);
//      
//      mathScore = sc.nextInt();
//      engScore = sc.nextInt();
//      korScore = sc.nextInt();
//      
//      totalScore = mathScore + engScore + korScore;
//      average = totalScore / 3.0;
//      
//      result = average > 60 ? "합격" 
//            : average < 60 ? "불합격" : "재평가"; 
//      
//      System.out.println(result);
//   }
//}
//
//
//
//
//
//
//
//
