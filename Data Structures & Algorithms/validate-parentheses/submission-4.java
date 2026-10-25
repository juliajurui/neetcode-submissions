class Solution {
    public boolean isValid(String s) {
        //make stack
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch: s.toCharArray()){
            if (ch == '('){
                stack.push(')');
            } else if (ch == '['){
                stack.push(']');
            } else if (ch == '{'){
                stack.push('}');
            } else{
                if (stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
