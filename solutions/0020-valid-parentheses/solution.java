class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (ch == ')' || ch == '}' || ch == ']')
                    return false;
            }
            if (ch == ')') {
                if (stack.peek() != '(')
                    return false;
                stack.pop();
            } else if (ch == '}') {
                if (stack.peek() != '{')
                    return false;
                stack.pop();
            } else if (ch == ']') {
                if (stack.peek() !='[')
                    return false;
                stack.pop();
            } else
                stack.push(ch);
        }
        return stack.isEmpty();
    }
}
