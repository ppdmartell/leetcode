// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Deque;
import java.util.ArrayDeque;

class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(({}))[]"));
    }

    private static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.size() == 0) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && c != ')') ||
                    (top == '[' && c != ']') ||
                    (top == '{' && c != '}')) {
                        return false;
                    }
            }
        }
        return stack.size() == 0;
    }

}
