package Lesson5;

public class Person {
    private String FIO;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

   /* public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }*/

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    public Person(String FIO, String position, String email, String phone, int salary, int age)
    {
        this.FIO=FIO;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    public void print(){
        System.out.println("Сотрудник " + this.FIO + ", " + this.position+", "+this.email+", "+this.phone+", "+this.salary+", "+this.age);
    }
}
