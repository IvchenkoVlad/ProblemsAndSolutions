class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // () {} []
        Map<Character, Character> values = new HashMap<>();
        values.put(']','[');values.put('}','{');values.put(')','(');
        
        
        for(int i = 0; i < s.length(); i++){
            Character curr = s.charAt(i);
            if(isOpened(curr)){
                stack.push(curr);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                else if(values.get(curr) != stack.pop()){
                    return false;
                }
            }
            
        
        }
        return stack.empty() ? true : false;
    }
    
    public boolean isOpened(Character c){
        if(c == '[' || c == '{' || c == '('){
            return true;
        }
        return false;
    }
}