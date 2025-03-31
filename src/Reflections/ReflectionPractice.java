package Reflections;

import java.lang.reflect.Field;

public class ReflectionPractice {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat1 = new Cat("kitty", 1);
        System.out.println("Original cat name: " + cat1.getName());

        for(Field f: Cat.class.getDeclaredFields()){
            System.out.println("Field:" + f);
        }

        //changing the PRIVATE and FINAL field using reflection
        for(Field f: Cat.class.getDeclaredFields()){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(cat1, "Another kitty");
            }

        }

        System.out.println("New cat name: " + cat1.getName());
    }

}


class Cat{
    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
}
