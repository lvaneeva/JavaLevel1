package Lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1=new Cat("Barsik", 100);
        Cat cat2=new Cat("Kisa", 50);
        Cat cat3=new Cat("Tom", 100);

        Plate plate1=new Plate(200);

       /* cat1.info();
        cat2.info();
        plate1.info();

        cat1.eat(plate1);
        cat2.eat(plate1);


        cat1.info();
        cat2.info();
        plate1.info();*/

        Cat[] cats=new Cat[3];
        cats[0]=cat1;
        cats[1]=cat2;
        cats[2]=cat3;

        for (int i=0; i< cats.length;i++)
        {
            cats[i].eat(plate1);
            cats[i].info();
        }

        plate1.addFood(50);
        cats[2].eat(plate1);
        cats[2].info();
        plate1.info();
    }
}
