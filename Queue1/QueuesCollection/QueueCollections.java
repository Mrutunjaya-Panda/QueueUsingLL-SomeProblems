package QueuesCollection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        //Queue<Integer>q1 = new Queue<>();//this is giving error because Queue is an interface in java framework,
        //so you can only instantiate.
        Queue<Integer>q1;// this will refer to the object of the class which has implemented the Queue Interface class.

        //so, either you can create your own class which implements the Queue methods, whatever functions are
        //defined in the Queue Interface. This will be very Cumbersome.
        //OR use the class that has already defined/implemented the methods of Queue interface in java framework.

        //Surprisingly but YES LinkedList is the class which has the implementation of the Queue Interface.
        //now this will give no error:

        q1 = new LinkedList<Integer>(); 
        //q1.poll();
        //q1.offer(null);
        q1.add(10);
        q1.add(20);
        q1.element();//exception
        q1.peek();//null if empty
        
        System.out.println(q1.size());
        System.out.println(q1.peek());
        System.out.println(q1.poll());
    }
}
