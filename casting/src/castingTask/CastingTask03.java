package castingTask;

public class CastingTask03 {
   public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
//	   a,j,k를 숫자로 표현 정수로. 그럼 강제형변환.
//	   그리고 숫자를 추가 한후 다시 문자형? 문자열? 로 형변환
	   
	   int num1 = 'a';
	   int num2 = 'j';
	   int num3 = 'k';
			   
	   char A = (char)(num1-32);
	   char J = (char)(num2-32);
	   char K = (char)(num3-32);
	   
	   System.out.println(A);
	   System.out.println(J);
	   System.out.println(K);
	   
   }
}