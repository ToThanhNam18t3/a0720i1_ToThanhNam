package Bai11_DSA_Stack_Queue.Thuc_Hanh._01_LinkedList_In_JavaUntill;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public boolean isEmpty(){
        if(stack.size() == 0) {
            return  true;
        } else {
            return false;
        }
    }

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public int size(){
        return stack.size();
    }


    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (stack.isEmpty()){
            throw  new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
