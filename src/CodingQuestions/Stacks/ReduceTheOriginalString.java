package CodingQuestions.Stacks;

import java.util.Stack;

public class ReduceTheOriginalString {
    public static void main(String[] args) {
//        String str = "BAABABABABAABBB";
        String str = "BBBBB";
        //remove the occurrences of AB and BB and return the length of final string
        System.out.println("The reduced string length is:" + stringReducer(str));
    }

    private static int stringReducer(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                stack.push(str.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    continue;
                }
                stack.push(str.charAt(i));
            }
        }

        return stack.size();
    }
}
