package Bai2;
import java.util.ArrayList;

class myOwnStack <T>{
    int size = 0;
    boolean isFixed = false;
    private ArrayList<T> stack;
    public myOwnStack(){
        stack = new ArrayList<T>();
    }
    public myOwnStack(int size){
        stack = new ArrayList<T>(size);
        isFixed = true;
        this.size = size;
    }
    public void push(T t){
        stack.add(t);
    }
    public T pop(){
        if (stack.size() == 0){
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
    public boolean isEmty(){
        return stack.size() == 0;
    }
    public boolean isFull(){
        if (isFixed){
            return stack.size() == size;
        }
        return false;
    }
    public int getSize(){
        return stack.size();
    }
    public T peak(){
        if (stack.size() == 0){
            return null;
        }
        return stack.get(stack.size() - 1);
    }
}
class StackOfChars extends myOwnStack<Character> {
    public StackOfChars() {
        super();
    }
    
    public StackOfChars(int size) {
        super(size);
    }
    public void push(char c) {
        super.push(c);
    }
}
class StackOfIntegers extends myOwnStack<Integer> {
    public StackOfIntegers() {
        super();
    }
    public StackOfIntegers(int size) {
        super(size);
    }
    public void push(int i) {
        super.push(i);
    }
}