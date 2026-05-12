class Solution {

    public boolean isPair(char a, char b) {
        if(a == '(' && b == ')') {
            return true;
        } else if(a == '[' && b == ']') {
            return true;
        } else if(a == '{' && b == '}') {
            return true;
        }

        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '}' || c == ')' || c == ']') {

                if(stack.isEmpty()) {
                    return false;
                }
                
                char popped = stack.pop();
                if(!isPair(popped, c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
