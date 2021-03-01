package Bai9_DSA_Danh_Sach.Bai_Tap.Trien_Khai_ArrList_Thu_Vien;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if(capacity >= 0 ) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    private int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for(int i = 0 ; i <elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(Object object){
        if (elements.length == size){
            this.ensureCapacity(1);
        }
        elements[size] = object;
        size++;
        return true;
    }

    public void add(E element, int index){
        if (index > elements.length) {
            throw new IllegalArgumentException("index" + index);
        } else if(elements.length == size){
            this.ensureCapacity(5);
        }

        if(elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1; i <= index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity){
         if(minCapacity >= 0){
             int newSize = this.elements.length + minCapacity;
             elements = Arrays.copyOf(elements, newSize);
         } else {
             throw new IllegalArgumentException("Mincapacity: " + minCapacity);
         }
    }


}
