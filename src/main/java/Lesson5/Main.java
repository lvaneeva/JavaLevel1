package Lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0]=new Person("Ivanov Ivan", "head of department", "asdf@mail.ru", "+79091234567", 100_000, 35);
        persons[1]=new Person("Petrova Ekaterina", "deputy head of department", "asdf@mail.ru", "+79092345678", 90_000, 45);
        persons[2]=new Person("Nikolaev Nikolay", "engineer", "asdf@mail.ru", "+79197654321", 80_000, 29);
        persons[3]=new Person("Minova Oksana", "engineer", "asdf@mail.ru", "+79291234567", 90_000, 41);
        persons[4]=new Person("Smirnov Sergey", "deputy head of department", "asdf@mail.ru", "+79091234567", 105_000, 55);

        for (int i=0; i< persons.length; i++) {
            if (persons[i].getAge() >40) {
                persons[i].print();
            }
        }
    }

}
