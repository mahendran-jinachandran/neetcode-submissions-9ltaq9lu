class Solution {

    public int calPoints(String[] operations) {
        
        Stack<String> op = new Stack<>();

        for(String o: operations) {

            if(o.equals("+")) {
                int firstValue = Integer.parseInt(op.pop());
                int secondValue = Integer.parseInt(op.pop());
                int finalValue = firstValue + secondValue;
                op.push(Integer.toString(secondValue));
                op.push(Integer.toString(firstValue));
                op.push(Integer.toString(finalValue));       
            } else if(o.equals("D")) {
                int doubleValue = Integer.parseInt(op.peek()) * 2;
                op.push(Integer.toString(doubleValue));
            } else if(o.equals("C")) {
                op.pop();
            } else {
                op.push(o);
            }
        }

        int sum = 0;
        while(!op.isEmpty()) {
             sum += Integer.parseInt(op.pop());
        }

        return sum;
    }
}