//package methodTask;
//
//public class MethodTask {
//   public static void main(String[] args) {
////      1. 1~10까지 출력하는 메서드
//	   void addNum(int num) {
//		   for (int i=0; i<10; i++) {
//			    System.out.println(i + 1);
//		   }
//	   }
//		   
//	   int getTotal(int count) {
//		   for(int i =0 ; i< count ; i++) {
//			   total += i +1;
//		   }
//		   return total ;
//	   }
//	   MethodTask mt = new MethodTask();
//	   
//	   mt.addNum();
//	   
//	   total = mt.getTotal(79);
//	   System.out.println(total);
////      2. 1~n까지의 합을 반환해주는 메서드
//   }
//}

//강사님 코드
package methodTask;

public class MethodTask {
   
   void printFromTo10() {
      for(int i = 0 ; i < 10; i++) {
         System.out.println(i + 1);
      }
   }
   
   int getTotal(int count) { 
      int total = 0;
      for(int i = 0; i < count; i++) { 
         total += i + 1;
         
      }
      return total;
   }
   
   public static void main(String[] args) {
      
      MethodTask mt = new MethodTask();
      int total = 0;
      
//      1. 1~10까지 출력하는 메서드
      mt.printFromTo10();
      
//      2. 1~n까지의 합을 반환해주는 메서드
      total = mt.getTotal(77);
      System.out.println(total);
   }
}
