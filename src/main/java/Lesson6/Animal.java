package Lesson6;

public abstract class Animal {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name){
        //this.name=name;
        setName(name);
    }
    public void run(int length){
        System.out.println(name + " run " + length + " metres");
    }

}
