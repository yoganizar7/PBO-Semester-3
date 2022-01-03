package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


public class GWildcard extends Manusia {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
    public void display(){
        Collection<String> Group1 = new ArrayList<>();
        Group1.add("Yoga Nizar H");
        Group1.add("Mohammed Salah");
        Group1.add("Lionel Messi");
        System.out.println("Group Berdasarkan Nama : ArrayList Collection");
        printCollection(Group1);
        Collection<Integer> Group2 = new LinkedList<>();
        Group2.add(201511064);
        Group2.add(2015110641);
        Group2.add(2015110642);
        System.out.println("Group Berdasarkan NIM : LinkedList Collection");
        printCollection(Group2);
        Collection<Character> Group3 = new HashSet<>();
        Group3.add('Y');
        Group3.add('A');
        Group3.add('M');
        System.out.println("Group Berdasarkan Character : HashSet Collection");
        printCollection(Group3);
    }
}