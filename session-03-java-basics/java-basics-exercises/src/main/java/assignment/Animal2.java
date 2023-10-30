package assignment;


// ClassAndObject
public abstract class Animal2 {
  public abstract void makeSound();
   public class Main {
       public static void main(String[] args) {
           Animal2 animal2 = new Animal2() {
               @Override
               public void makeSound() {
                   System.out.println("the animal make sound" );
               }
           };
           animal2.makeSound();
       }
   }
}
