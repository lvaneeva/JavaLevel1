package Lesson6;

public class Cat extends Animal{
    static int count=0;
    public Cat(String name) {
        super(name);
        count++;
    }
    public void run(int length){
        if (length<=200) {
            System.out.println(name + " run " + length + " meters");
        }else {
            System.out.println(name + " run 200 meters and got tired");
        }
    }
}
