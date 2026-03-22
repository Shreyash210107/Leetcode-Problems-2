import java.util.*;

class Validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') valid = false;
                if (ch == '}' && top != '{') valid = false;
                if (ch == ']' && top != '[') valid = false;
            }
        }

        if (!stack.isEmpty()) valid = false;

        if (valid)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}