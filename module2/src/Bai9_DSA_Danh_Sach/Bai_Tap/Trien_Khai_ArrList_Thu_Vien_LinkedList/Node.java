package Bai9_DSA_Danh_Sach.Bai_Tap.Trien_Khai_ArrList_Thu_Vien_LinkedList;

public class Node {
    public Node next;
    public Object data;

    public Node(){
    }

    public Node(Object data){
        this.next = null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
