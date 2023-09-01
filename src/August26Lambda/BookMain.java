package August26Lambda;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book() {
            @Override
            public void read() {
                System.out.println("Reading");

            }
        };
      book.read();
      Book book1 = new Science();
      book1.read();

      //Lambda

      Book book2 = ()-> System.out.println("Calling");
      book2.read();

    }
}
/*
Colections--
Interfaces--List--Set--queue    Map

Interfaces--its a contract any class can implements



*/