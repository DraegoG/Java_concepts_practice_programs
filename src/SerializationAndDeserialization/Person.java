package SerializationAndDeserialization;

import java.io.Serializable;

/*
Condition for class to be serializable:
1. Should implement Serializable interface
2. If parent class has implemented serializable interface, child class will be having by default
3. Static and transient data members are not serialized
4. A final and transient data member remains constant during serialization hence no need of transient keyword with final.
5. SerialVersionUID needs to be specified as it is being used to verify the class during deserialization
* */
public class Person implements Serializable {
    private String name;
    private int age;
    private String number;

    public Person(){
    }

    public Person(String name, int age, String number){
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}
