package Collections;

import java.util.LinkedList;
import java.util.List;

public class StackImplementationUsingLinkedList {
    public static void main(String[] args) {
        List<String> stack = new LinkedList<>();

        push(stack,"1");
        push(stack,"2");
        push(stack,"3");
        push(stack,"4");
        push(stack,"5");

        System.out.println("stack:"+ stack);

        push(stack, "22");
        System.out.println("stack:"+ stack);

        pop(stack);
        System.out.println("stack:"+ stack);
    }

    static void push(List<String> ls, String element){
        ls.add(0, element);
        System.out.println("Added element");
    }

    static String pop(List<String> ls){
        System.out.println("removing the top element");
        return ls.remove(0);
    }
}
