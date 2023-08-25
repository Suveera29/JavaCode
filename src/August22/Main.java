package August22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //generics -- which restrict data struct to a type
        List<Integer> list = new ArrayList();  //interface==class
        //List list = new ArrayList();  //interface==class
      //  List<Integer> list = new LinkedList();  //interface==class
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
     /* //  list.add("Pragra");
        List<Integer> list2 = new ArrayList();  //interface==class
        //List list = new ArrayList();  //interface==class

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        System.out.println(list2);
        System.out.println(list.addAll(list2));
        System.out.println(list);
         list.remove(10);
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i));
            System.out.print(" ,");

        }*/
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            }
        }
    }
