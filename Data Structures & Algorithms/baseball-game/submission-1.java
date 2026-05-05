class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        int totalPoints = 0;
        for(String op : operations){
            if(op.equals("+")){
                stack.push(stack.peek() + stack.get(stack.size()-2));
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        for(int val : stack){
            totalPoints += val;
        }
        return totalPoints;
    }
}