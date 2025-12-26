package queue2;

public class Node<T> {
    T data;
    Node<T> next;//since next element will also be of type node.
    //constructor
    Node(T data){
        this.data = data;
        next = null;//ideally when you create a node the default value of next will be null.
        //since you have not dicided what the next node will be.
        //but this statement is actually optional since the default value of any reference
        //in an object is null.
    }
}
