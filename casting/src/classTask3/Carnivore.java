package classTask3;

public class Carnivore extends Animal{
   public Carnivore() {;}
   public Carnivore(String name, int age, String feed) {
      super(name, age, feed);
   }
   
   public void printCarnivore() {
      System.out.println(super.getName() + "은 초식동물!");
   }
   
}