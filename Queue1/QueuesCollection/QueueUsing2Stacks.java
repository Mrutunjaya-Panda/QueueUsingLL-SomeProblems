package QueuesCollection;
import java.util.Stack;
public class QueueUsing2Stacks<T> {
    private Stack<T>s1;
    private Stack<T>s2;
    private int size;
    public QueueUsing2Stacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    //let's implement the 5 basic data structure of Queue.
    //size
    //0(1)
    public int size(){
        return size;
    }
    //isEmpty()
    //0(1)
    public boolean isEmpty(){
        return size == 0;
    }
    //enqueue
    //0(1)
    public void enqueue(T elem){
        s1.push(elem);
        size++;
    }
    //front
    //0(n)
    public T front(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        //now return the topmost element of the 2nd stack and that is our front element.
        return s2.peek();
    }

    //dequeue
    //0(n) because of loop.
    public T dequeue(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T temp = s2.pop();
        size--;
        return temp;
    }

}
