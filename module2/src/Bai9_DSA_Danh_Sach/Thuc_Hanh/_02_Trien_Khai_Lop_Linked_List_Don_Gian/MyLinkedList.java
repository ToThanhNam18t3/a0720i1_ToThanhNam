package Bai9_DSA_Danh_Sach.Thuc_Hanh._02_Trien_Khai_Lop_Linked_List_Don_Gian;

import java.util.Objects;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(){
    }

    public MyLinkedList(Object data){
        this.head = new Node(data);
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

}
