package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기
//	   0.1234를 소수점 4자리까지만 표현 => .4 그다음 * 1000 하면 1234  // 안됨. 소수점 n자리까지하면 반올림되서 0.12345가 되어버림.
//	   0.5130에 .1 *10 하면 5
//	   6은 처음것의 0.5 하고 12340을 빼 그럼 6
//	   78 그대로
//	   9는 정수로 간다음 다시 문자형으로
	   
//	   문자형 더하는거랑 문자열 더하는거랑 차이가 있나? => 문자형은 더하지 못함 즉, 연산못함.
	   double num1 = Double.parseDouble("0.12346");
	   int num1A = (int)(num1*10000);
	   String data1 = String.valueOf(num1A);
	   		System.out.println(data1);
	   		
	   		double num2 = Double.parseDouble("0.5130");
	   		int num2A = (int)(num2*10);
	   		String data2 = String.valueOf(num2A);
	   		System.out.println(data2);
	   
	 	   int num3A = (int)(num1*100000-12340);
	 	  String data3 = String.valueOf(num3A);
	 	 System.out.println(data3);
	 	 
	 	String data4 = "78";
	 	System.out.println(data4);
	 	
	   double num5 = Double.parseDouble("9.133");
	   int num5A = (int)(num5);
	 	  String data5 = String.valueOf(num5A);
	 	 System.out.println(data5);
	 	 
	 	 String result = "%s%s%s%s%s";

	 	 
	 System.out.printf(result,data1,data2,data3,data4,data5);
			   
//	   double num1 = Double.parseDouble("0.12346");
//	   String result = "%f";
//	   System.out.printf(result, num1);
			   
			   
	   
	   
	   
   }
}