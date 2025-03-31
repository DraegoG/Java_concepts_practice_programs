package Collections.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class EqualsAndHashCodeExample {
    public static void main(String[] args) {
        HashMap<Person, Integer> hm = new HashMap<>();
        Person p1 = new Person(25, "Abhishek");
        Person p2 = new Person(24, "Abhishek");
        Person p3 = new Person(25, "Abhishek");
        System.out.println("-------------------Adding elements to the hashmap-------------------");
        hm.put(p1, p1.getAge());
        hm.put(p2, p2.getAge());
        hm.put(p3, p3.getAge());
        System.out.println("Size of hashmap:" + hm.size());

    }

    static class Person{
        private int age;
        private String name;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o){
            //1. Check NULL
            //2. Check if the objects are equal
            //3. Check if the variables inside the objects are equal
            System.out.println("Equals called");
            if(o == null || getClass() != o.getClass()) return false;
            if(this == o) return true;
            Person p = (Person)o;
            return (this.age == p.getAge() && Objects.equals(name, p.getName()));
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode called");
            return Objects.hash(name, age);
        }
    }
}
