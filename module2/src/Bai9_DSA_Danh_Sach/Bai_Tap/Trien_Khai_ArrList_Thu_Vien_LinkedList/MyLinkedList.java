package Bai9_DSA_Danh_Sach.Bai_Tap.Trien_Khai_ArrList_Thu_Vien_LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;


    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }

    public void add(int index, E element){
        //Khai bao 1 bien temp tro den head
        Node temp = head;

        //Khai bao mot bien node la holder
        Node holder;

        //Cho con tro chay den vi tri index -1
        for ( int i = 0 ; i < index-1 && temp.next != null; index++){
                temp = temp.next;
        }

        //Cho holder tham chieu toi vi tri cua index
        holder = temp.next;
        //Node moi se tro den holder
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element){
        Node temp = head; // Con tro = phan tu dau tien
        head = new Node(element); // Tao 1 element ngay phan tu dau tien
        head.next = temp; // Gan lien ket cua phan tu moi tao
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }
}
