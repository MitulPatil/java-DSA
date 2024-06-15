import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add element to Queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println("peek:"+queue.peek());
    }
}
