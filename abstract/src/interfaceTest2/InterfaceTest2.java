package interfaceTest2;

// 동물

// 마커 인터페이스
// 육식동물(Canibore), 초식동물(Herbivore)
// Lion, Bear, Deer, Rabbit

public class InterfaceTest2 {
//	초식동물이 들어오면 채소를 먹이로 주기
//	육식동물이 들어오면 고기를 먹이로 주기
//	출력
	public void checkAnimal(Animal animal) {
		
		if (animal instanceof HabivoreMarker) {
		// 초식동물
			this.feedHarbivore((HabivoreMarker)animal);
		} else if (animal instanceof CarnivoreMarker) {
		// 육식동물
			this.feedCarnivore((CarnivoreMarker)animal);
		}
	}
	public void feedCarnivore(CarnivoreMarker carnivore) {
		System.out.println("규혁이 던짐");
	}
	public void feedHarbivore(HabivoreMarker harbivore) {
		System.out.println("채소를 던짐");
	}
	
	public static void main(String[] args) {
		
		InterfaceTest2 lab = new InterfaceTest2();
		Bear bear = new Bear() ;
		Deer deer = new Deer() ;
		
		lab.checkAnimal(bear);
		lab.checkAnimal(deer);
		
	}
}
