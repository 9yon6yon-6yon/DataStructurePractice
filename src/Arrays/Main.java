package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] num = {12,44,54};
//        System.out.println(num.length);
//        System.out.println(Arrays.toString(num));
//        Array num = new Array(3);
//        num.insert(3);
//        num.insert(33);
//        num.insert(13);
//        num.insert(333);
//        System.out.println("Index is : "+num.indexOf(32));
//        num.print();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(3);
        list.indexOf(20);
        list.contains(20);
        list.toArray();
        System.out.println(list);

    }
}
