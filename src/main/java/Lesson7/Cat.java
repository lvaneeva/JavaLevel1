package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private  boolean satiety;

    public Cat(String name, int appetite){
        this.name=name;
        this.appetite=appetite;
        satiety=false;

    }
    public void eat(Plate plate){
        if (plate.getFood()>=appetite){
            plate.decriesFood(appetite);
            satiety=true;
        }
        else satiety=false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void info(){
        System.out.println("["+name+", "+appetite+", "+satiety+"]");
    }
}
