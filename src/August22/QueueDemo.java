package August22;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);//offer used for add//first person add tim hortonline
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);//last person
        System.out.println(queue);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.poll());//remove
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);//on top or next in line

    }
}
