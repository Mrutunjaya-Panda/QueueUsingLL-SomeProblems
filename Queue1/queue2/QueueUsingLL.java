package queue2;

import queue1.QueueEmptyException;
public class QueueUsingLL<T> {
    private Node<T>front;//front is the end where deletion happens.
    private Node<T>rear; //rear is the end where insertion happens.
    int size;
    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(T elem){
        Node<T> newNode = new Node(elem);
        size++;
        if(rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;//or rear = rear.next;
        }
    }
    public T front() throws QueueEmptyException{
        //I will return the value at the front and not the node , since we need to make a
        //queue a ADT(abstract data type)
        if(front == null){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    public T dequeue() throws QueueEmptyException{
        if(front == null){
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        //if you are wondering that what will happen to deleted one , so no reference will be pointing now,
        //so it will be removed by the garbage collector. we don't need to be worry about it.

        //check one edge case
        if(front == null){
            //set rear to null too.
            rear = null;
        }
        size--;
        return temp;
    }
}
