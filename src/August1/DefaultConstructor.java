package August1;


class DateDemo{
    private int day;//declration if we give value its become initi
    private int month;
    private int year;
    DateDemo(){
        day = 1;
        month = 8;
        year = 2023;
        //System.out.println("Hello");

    }
    public DateDemo(int day, int month) {
        this.day = 29;
        this.month = 9;
    }

    public DateDemo(int day, int month, int year) {
        this(day,month);
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public void printDate(){

        System.out.println("Date:"+ day+ "/"+ month+ "/"+year);
    }

}
public class DefaultConstructor {
    public static void main(String[] args) {
        DateDemo dateDemo = new DateDemo();//create object
          dateDemo.printDate();


          DateDemo dateDemo1 = new DateDemo(10,8,2023);
          dateDemo1.printDate();

    }
}
