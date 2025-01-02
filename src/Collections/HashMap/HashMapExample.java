package Collections.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("Initial size of Hashmap:" + hashMap.size());

        hashMap.put(1,"a");

        System.out.println("Size of Hashmap after adding 1 element:" + hashMap.size());
        hashMap.put(2,"s");
        hashMap.put(3,"d");
        hashMap.put(4,"f");
        hashMap.put(5,"g");
        hashMap.put(6,"h");
        hashMap.put(7,"j");
        hashMap.put(8,"k");
        hashMap.put(9,"l");
        hashMap.put(10,"q");
        hashMap.put(11,"w");
        hashMap.put(12,"e");
        hashMap.put(13,"r");
        hashMap.put(14,"t");
        hashMap.put(15,"y");
        hashMap.put(16,"u");
        hashMap.put(17,"i");

        Set<Integer> st = hashMap.keySet();
        Object[] arr = st.toArray();
        System.out.println("Modified size of Hashmap:" + hashMap.size());

    }
}
