package July25;

public class Student {
    String name;
    int age;


    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


        Student student = new Student();
        student.age = 15;
        student.name = "peter";
        System.out.println(student.age+" "+ student.name);
    }
}
