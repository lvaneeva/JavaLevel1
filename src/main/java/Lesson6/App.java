package Lesson6;

public class App {
    public static void main(String[] args) {
        Cat kitty=new Cat("Kitty");
        kitty.run(450);

        Dog bobik=new Dog("Bobik");
        bobik.run(100);
        bobik.swim(100);

        Dog bim=new Dog("Bim");
        bim.run(5);

        System.out.println("Created " + Cat.count + " cats and " + Dog.count +" dogs.");
    }

}
