package assignment;

public class Cat extends Animal{
    private int CatNum;
    public Cat(String name, int age, int Carnum) {
        super(name, age);
        this.CatNum = CatNum;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
