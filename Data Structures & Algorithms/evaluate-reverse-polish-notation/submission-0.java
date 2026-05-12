class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> evaluation = new Stack<>();
        
        for(String token: tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                
                int secondOperand = Integer.parseInt(evaluation.pop());
                int firstOperand = Integer.parseInt(evaluation.pop());

                int result = 0;
                if(token.equals("+")) {
                    result = firstOperand + secondOperand;
                } else if (token.equals("-")) {
                    result = firstOperand - secondOperand;
                } else if (token.equals("*")) {
                    result = firstOperand * secondOperand;
                } else {
                    result = firstOperand / secondOperand;
                }

                evaluation.push(String.valueOf(result));
            } else {
                evaluation.push(token);
            }
        }

        return Integer.parseInt(evaluation.pop());
    }
}