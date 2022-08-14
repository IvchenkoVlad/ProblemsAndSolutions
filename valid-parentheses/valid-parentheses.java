class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
       
        for(Character ch : s.toCharArray()){
            if(isOpen(ch)){
                stack.push(ch);
            }
            else{
                if(stack.empty() || map.get(ch) != stack.peek()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.empty() ? true : false;
    }
    public boolean isOpen(char a){
        if(a == '{' || a == '[' || a == '('){
            return true;
        }
        return false;
        
    }
}