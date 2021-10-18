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
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        System.out.println(aq.dequeue());
        System.out.println(aq);
    }
}
