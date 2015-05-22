class MinStack {
    int min = -1;
    int size = 0;
    int minSize = 0;
    ArrayList<Integer> listOfMin = new ArrayList<Integer>();
    LinkedList <Integer> unsortedStack = new LinkedList <Integer>();
    public void push(int x) {
        if(size == 0){
            min = x;
            listOfMin.add(min);
            minSize++;
        }else{
            if(x <= min){
            min = Math.min(x, min);
            listOfMin.add(min);
            minSize++;
            }
        }
        unsortedStack.add(x);
        size++;
    }

    public void pop() {
        if(minSize > 0 && unsortedStack.getLast() == min){
            min = minSize-2 >= 0? listOfMin.get(minSize-2) : -1;
            listOfMin.remove(minSize - 1);
            minSize--;
        }
        unsortedStack.removeLast();
        size--;
    }

    public int top() {
        return unsortedStack.getLast();
    }

    public int getMin() {
        return min;   
    }
}
