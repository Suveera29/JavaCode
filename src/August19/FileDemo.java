package August19;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("pragra.txt");
        try{
            boolean newfile = file.createNewFile();
            System.out.println(file.canRead());
            System.out.println(file.canExecute());
            System.out.println(file.canWrite());


        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
