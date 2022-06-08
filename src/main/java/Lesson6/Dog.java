package Lesson6;

public class Dog extends Animal implements Swim{
    static int count=0;
    public Dog(String name){
        super(name);
        count++;
    }
    public void run(int length){
        if (length<=500) {
            System.out.println(name + " run " + length + " meters");
        }else {
            System.out.println(name + " run 500 meters and got tired");
        }
    }

    public void swim(int length){
        if (length<=10) {
            System.out.println(name + " swim " + length + " meters");
        }else {
            System.out.println(name + " swim 50 meters and got tired");
        }
    }
}
