package Demo;

import java.util.*;
import java.util.stream.Stream;

public class ExampleQueue {
    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();
        q.add("name3");
        q.add("name2");
        q.add("name5");
        q.offer("name14");
        q.add("name11");

//        q.remove();

        for (String queue: q) {
            System.out.println("PriorityQueue : " + queue);
        }


//
//        System.out.println("get first element");
//        System.out.println("peek(): " + q.peek() );
//        System.out.println("element() : " + q.element());
//        System.out.println("for remove");
//        System.out.println("remove(): " + q.remove("name3"));
//        System.out.println("poll(): " + q.poll());
//        q.offer("name6");

//        for (String queue: q) {
//            System.out.println(" queue values : " + queue);
//        }

//        while (!q.isEmpty()){
//            System.out.println("removed : " + q.poll());
//        }

        Queue<String>  arrayqueue= new ArrayDeque<>();
        arrayqueue.offer("name3");
        arrayqueue.add("name1");
        arrayqueue.add("name2");
        arrayqueue.remove();
        arrayqueue.add("name3");
        arrayqueue.add("name4");
        for (String aq : arrayqueue ) {
            System.out.println("a : " + aq);
        }

//        while(!arrayqueue.isEmpty()){
//            System.out.println("arrayqueue : " + arrayqueue);
//            break;
//        }

        Deque<String> deque = new ArrayDeque<>();
        deque.add("c");
        deque.add("d");
        deque.add("a");
        deque.add("b");
//        deque.addFirst("a");
//        deque.addLast("z");
//        deque.push("asc");
//        String poppedElement = deque.pop();

        for (String dequeue : deque) {
            System.out.println("dequeue : " + dequeue);
        }
//
//        System.out.println("dequeuefirst :" + deque.getFirst());
//        System.out.println("dequeue peek: " + deque.peek());
//        System.out.println("dequeuelast : " + deque.peekLast());
//        System.out.println("popE : " + poppedElement);

        Queue<String> que = new ArrayDeque<>();
        que.add("c");
        que.add("d");
        que.add("a");
        for (String q1 : que) {
            System.out.println("queue : " + q1);
        }

        }
}
