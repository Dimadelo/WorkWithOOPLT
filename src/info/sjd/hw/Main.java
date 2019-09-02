package info.sjd.hw;

public class Main {


    public static void main(String[] args) {

        //Type name = new Type()
        //Class name = new Class()





        Person ed = new Person();
        ed.name = "Eduard";
        ed.age = Person.maxAge;

        Person vlad = new Person();
        vlad.name = "Vlad";
        vlad.age = Person.maxAge;

        int inputAge = 150;
        if (inputAge > Person.maxAge) {
            System.out.println("Wrong age");
        }
        System.out.println();

        System.out.println(ed.name);
    }
}
