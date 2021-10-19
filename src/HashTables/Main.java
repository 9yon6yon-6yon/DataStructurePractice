package HashTables;

public class Main {
    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"Chayon");
//        map.put(2,"Shayon");
//        map.put(3,"Nhayon");
//        map.remove(1);
//        System.out.println(map);
//        CharFinder finder = new CharFinder();
//        System.out.println(finder.findNonRepeatingChar("a green apple"));
//        Set<Integer> set = new HashSet<>();
//        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 7, 9, 0};
//        for (var num : numbers
//        )
//            set.add(num);
//        System.out.println(set);
//
//        CharFinder finder = new CharFinder();
//        System.out.println(finder.findFirstRepeatedChar("Green apple"));
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "c");
        table.put(6,"A+");
        table.remove(6);
        System.out.println("Done");


    }
}
