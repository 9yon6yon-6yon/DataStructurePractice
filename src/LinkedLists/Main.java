package LinkedLists;
//linked list
public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
       var list = new LinkedList();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
        System.out.println(list.getKthFromTheEnd(1));
    }
}
