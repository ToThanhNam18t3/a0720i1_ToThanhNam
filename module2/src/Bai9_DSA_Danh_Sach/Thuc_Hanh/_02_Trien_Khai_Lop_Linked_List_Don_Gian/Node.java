package Bai9_DSA_Danh_Sach.Thuc_Hanh._02_Trien_Khai_Lop_Linked_List_Don_Gian;

public class Node {
    public Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }
}
