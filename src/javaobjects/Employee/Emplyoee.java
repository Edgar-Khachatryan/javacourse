package javaobjects.Employee;

public class Emplyoee {
     private int id;
     private String name;
     private String department;
     private int age;
     private String gender;

    public Emplyoee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }


    /**
     * printing information about employees
     */

    public void printEmploye() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

    }

}
