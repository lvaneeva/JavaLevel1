package Lesson7;

public class Plate {
    private int food;
    public int getFood() {
        return food;
    }
    public Plate(int food){
        this.food=food;
    }
    public void decriesFood(int appetite){
        food-=appetite;
    }
    public void addFood(int additive){
        food+=additive;
    }
    public void info(){
        System.out.println("["+food+"]");
    }
}
