package ComparatorAndComparableExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        Students s1 = new Students("Abhishek", 28);
        Students s2 = new Students("Priyanka", 24);
        Students s3 = new Students("Akhil", 30);

        List<Students> ls = Arrays.asList(s1, s2, s3);

        Collections.sort(ls);

        System.out.println(ls);
    }


    static class Students implements Comparable{
        String name;
        int age;

        public Students(String n, int a){
            name = n;
            age = a;
        }

        @Override
        public int compareTo(Object o) {
            Students that = (Students)o;
            if(this.age > that.age){
                return 1;
            } else {
                return -1;
            }
        }


        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
