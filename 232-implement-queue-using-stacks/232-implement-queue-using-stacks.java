class MyQueue {

    private List<Integer> elements;
    
    public MyQueue() {
        elements = new ArrayList<>();
    }
    
    public void push(int x) {
        elements.add(x);
    }
    
    public int pop() {
        if(elements.size() > 0){
            int value = elements.get(0);
            elements.remove(0);
            return value;
        }
        return -1;
    }
    
    public int peek() {
        if(elements.size() > 0){
            int value = elements.get(0);
            return value;
        }
        return -1;
    }
    
    public boolean empty() {
        if(elements.size() > 0){
            return false;
        }
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */