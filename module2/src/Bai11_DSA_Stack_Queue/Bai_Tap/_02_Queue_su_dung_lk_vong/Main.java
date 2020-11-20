package Bai11_DSA_Stack_Queue.Bai_Tap._02_Queue_su_dung_lk_vong;

//import static Bai11_DSA_Stack_Queue.Bai_Tap._02_Queue_su_dung_lk_vong.Solution.*;

public class Main {
    public static void main(String[] args) {
        Queue  q = new Queue();
//        q .front = q .rear =  null;
//
//        // Inserting elements in Circular Queue
//        enQueue(q, 14);
//        enQueue(q, 22);
//        enQueue(q, 6);
//
//        // Display elements present in Circular Queue
//        displayQueue(q);
//
//        // Deleting elements from Circular Queue
//        System.out.printf(" Deleted value = %d", deQueue(q));
//        System.out.printf(" Deleted value = %d", deQueue(q));
//
//        // Remaining elements in Circular Queue
//        displayQueue(q);
//
//        enQueue(q, 9);
//        enQueue(q, 20);
//        displayQueue(q);

        q.enQueue(3);
        q.enQueue(5);
        q.enQueue(7);
        //displayQueue
        Node i = q.front;
        while(i.link != q.front){
            System.out.println(i.data);
            i = i.link;
        }
        System.out.println(i.data);

    }
}
