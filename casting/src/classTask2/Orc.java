package classTask2;

public class Orc extends Monster {
   public Orc() {;}
   
   @Override
   public void dropItem() {
      System.out.println("가죽을 떨군다.");
   }
   
   public void attack() {
      System.out.println("오크가 달려든다");
   }
}
