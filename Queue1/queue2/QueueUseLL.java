package queue2;

import queue1.QueueEmptyException;
public class QueueUseLL {
    public static void main(String[] args){
        QueueUsingLL<Integer> q = new QueueUsingLL<>();
        int arr[] = {10,20,30,40,50};
        for(int elem:arr){
            q.enqueue(elem);
        }
        while(!q.isEmpty()){
            try{
                System.out.println(q.dequeue());
            }
            catch(QueueEmptyException e){

            }
            
        }
    }
}
