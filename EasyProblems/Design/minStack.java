class MinStack {
    
     static class Element{
            final int value;
            final int min;
            Element(final int value , final int min){
                this.value=value;
                this.min=min;
            }
        }

    /** initialize your data structure here. */
   final Stack<Element> st=new Stack<>();
    public MinStack() {
        
       
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push(new Element(x,x));
        }
        else{
            st.push(new Element(x,Math.min(x,st.peek().min)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
