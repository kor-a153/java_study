package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		
		int[] arData = new int [5];
		int num = 0 ;
		
		try {
			System.out.println(arData[3]/ num);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Exception = 모든 예외
			System.out.println("인덱스 범위 벗어남");
		} catch (ArithmeticException e) {
			// Exception이 항상 아래에 있어야 한다. 위에 있으면 코드 읽는 순서때문에 다른게 죽은코드가 되버림.
			System.out.println("0으로 나눌수 없음");
		} catch (Exception) {
			e.printStackTrace();
		} finally
		
		
	}
}
