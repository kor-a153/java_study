package methodTest;

public class MethodTest2 {
   
   int[] test(int[] data) {
      data[0] = 20; //값을 받을수 있게.. 0으로 둠..?
      return data;
   }
   
   public static void main(String[] args) {
      MethodTest2 ts = new MethodTest2();
      int[] data = {50}; //배열에 담아서 전달하면 주소값까지 다 넘어가서 메서드 자체가 넘어간다.
      
      ts.test(data);
      System.out.println(data[0]);
   }
}
