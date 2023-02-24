package javaobjects.Employee;

public class ExampleEmployee {
     static Emplyoee john = new Emplyoee(
            1,
            "John",
            "Sales",
            25,
            "Male"
    );
    static Emplyoee mark = new Emplyoee(
            2,
            "Mark",
            "Sales",
            30,
            "Male"
    );
    static Emplyoee jane = new Emplyoee(
            3,
            "Jane",
            "Marketing",
            22,
            "Female"
    );

    public static void main(String[] args) {
        john.printEmploye();
        System.out.println();
        mark.printEmploye();
        System.out.println();
        jane.printEmploye();
    }


}
