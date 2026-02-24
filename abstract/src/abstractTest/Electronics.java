package abstractTest;

public abstract class Electronics {
//	추상메서드
	@Override
	public abstract void on();
	
	@Override
	public abstract void off();
	
//	일반메서드
	public void test() {
		System.out.println("일반 메서드");
	}
	
}
