package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//printers,operating systems,web servers,live support systems use queues
public class Main {
    public static void main(String[] args) {

//        Queue<Integer>  q = new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q);
//        reverse(q);
//        System.out.println(q);
//    }
//    //reversing a queue
//    public static void reverse(Queue<Integer> q){
//        Stack<Integer> stack = new Stack<>();
//        while(!q.isEmpty())
//            stack.push(q.remove());
//        while(!stack.isEmpty())
//            q.add(stack.pop());
//
//        ArrayQueue aq = new ArrayQueue(5);
//        aq.enqueue(10);
//        aq.enqueue(20);
//        aq.enqueue(30);
//        System.out.println(aq.dequeue());
//        System.out.println(aq);
//        QueueWithStacks queueWithStacks = new QueueWithStacks();
//        queueWithStacks.enqueue(10);
//        queueWithStacks.enqueue(20);
//        queueWithStacks.enqueue(30);
//        queueWithStacks.enqueue(40);
    //priority queue
//        PriorityQueue<Integer> q = new PriorityQueue<>();
//        q.add(5);
//        q.add(1);
//        q.add(4);
//        q.add(2);
//        System.out.println(q);
//        while(!q.isEmpty())
//            System.out.println(q.remove());
        //priority queue from scratch
        PriorityQueue q = new PriorityQueue();
        q.add(5);
        q.add(1);
        q.add(3);
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
