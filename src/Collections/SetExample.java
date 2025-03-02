package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String []args){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("abhishek");
        hashSet.add("Priyanka");
        hashSet.add("Ramesh");
        hashSet.add("Suresh");

        Set<String> linkedhashSet = new LinkedHashSet<>();
        linkedhashSet.add("abhishek");
        linkedhashSet.add("Priyanka");
        linkedhashSet.add("Ramesh");
        linkedhashSet.add("Suresh");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ramesh");
        treeSet.add("Suresh");
        treeSet.add("Abhishek");
        treeSet.add("Priyanka");

        System.out.println("hashSet:" + hashSet);
        System.out.println("linkedHashSet:" + linkedhashSet);
        System.out.println("TreeSet:" + treeSet);
    }
}
