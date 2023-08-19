package July29;
class Student{


/*
*/
    //properties
    int id;
    String name;

}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.id = 101;
        student.name = "mike";


        System.out.println(student.id);
        System.out.println(student.name);

    }
}
