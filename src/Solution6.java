import java.util.ArrayList;
import java.util.List;

public class Solution6 {

      
   public static void lowerBound(List<? super Dog> obj) {
	   	  Dog dog = (Dog) obj.get(1);
	      System.out.println("Dog sound : "+dog.sound());
	   }
   private static void upperBound(List<? extends Dog> obj) {
	   Dog dog = (Dog) obj.get(0);
	   System.out.println("Dog sound : "+dog.sound());
	}
   

   public static void main(String[] args) {
      List<Animal> animal= new ArrayList<Animal>();
      animal.add(new Animal());
      animal.add(new Dog());
      animal.add(new Yorkie());
      List<Dog> dog= new ArrayList<Dog>();
      dog.add(new Dog());
      dog.add(new Yorkie());
      List<Yorkie> yorkie= new ArrayList<Yorkie>();
      yorkie.add(new Yorkie());
      
      lowerBound(animal);  // dog or super class of dog as an argument
    //lowerBound(dog);
      
      upperBound(dog);  //dog or child class of dog as an argument
}
}
class Animal {
	public String sound() {
		return "animal sound";
	}
}

class Dog extends Animal {
	public String sound() {
		return "woof!!!";
	}
}

class Yorkie extends Dog {
	public String sound() {
		return "animal sound";
	}
}
