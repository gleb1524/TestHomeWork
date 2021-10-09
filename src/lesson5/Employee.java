package lesson5;

public class Employee {

    private String full_name;
    private String position;
    private String email;
    private double tel;
    private int salary;
    private int age;

    public Employee (String full_name, String position, String email, double tel, int salary, int age){

        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

    }

    public int getAge(){
        return this.age;
    }

    public void infoEmployee(){
        System.out.println(full_name+" "+position+" "+email+" "+tel+" "+salary+" "+age);
    }

}
