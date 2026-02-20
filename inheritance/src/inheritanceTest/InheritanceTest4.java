package inheritanceTest;

class Animal2 {
//   1. private 붙이자! 
   private String name;
   private int age;
   private String species;
   private int numberOfLeg;
   private String gender;
   
//   2. 기본 생성자
   public Animal2() {;}

//   3. 초기화 생성자
   public Animal2(String name, int age, String species, int numberOfLeg, String gender) {
      this.name = name;
      this.age = age;
      this.species = species;
      this.numberOfLeg = numberOfLeg;
      this.gender = gender;
   }

//   4. getter, setter
//   Alt + Shift + S -> R -> Alt + A -> R
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getSpecies() {
      return species;
   }

   public void setSpecies(String species) {
      this.species = species;
   }

   public int getNumberOfLeg() {
      return numberOfLeg;
   }

   public void setNumberOfLeg(int numberOfLeg) {
      this.numberOfLeg = numberOfLeg;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   
}

public class InheritanceTest4 {

}

