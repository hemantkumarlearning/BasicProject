public class StackUsingArray {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackUsingArray(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = data;

    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    public static void main(String[] args){
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
