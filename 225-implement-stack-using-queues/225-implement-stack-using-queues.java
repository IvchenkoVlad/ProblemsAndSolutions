class MyStack {
    
    private List<Integer> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }
    
    public void push(int x) {
        elements.add(x);
    }
    
    public int pop() {
        int size = elements.size();
        return elements.remove(size-1);
    }
    
    public int top() {
        int size = elements.size();
        return elements.get(size-1);
    }
    
    public boolean empty() {
        if(elements.size() == 0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */