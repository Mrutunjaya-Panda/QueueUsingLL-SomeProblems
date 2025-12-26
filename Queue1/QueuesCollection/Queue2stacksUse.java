package QueuesCollection;

public class Queue2stacksUse {
    public static void main(String[] args) {
        QueueUsing2Stacks<Integer> q1 = new QueueUsing2Stacks<>();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

       // System.out.println(q1.front());
        System.out.println(q1.size());
        System.out.println(q1.isEmpty());
        System.out.println(q1.dequeue());
        System.out.println(q1.size());


    }
    

}
