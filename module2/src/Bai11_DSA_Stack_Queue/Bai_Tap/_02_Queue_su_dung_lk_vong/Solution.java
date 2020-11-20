//package Bai11_DSA_Stack_Queue.Bai_Tap._02_Queue_su_dung_lk_vong;
//
//public class Solution {
//
//    //Function them 1 phan tu vao Queue
//    static void enQueue(Queue q, int value){
//        Node temp = new Node();
//        temp.data = value;
//        if(q.front == null) {
//            q.front = temp;
//        } else {
//            q.rear.link = temp;
//        }
//        q.rear = temp;
//        q.rear.link = q.front;
//    }
//
//    //Xoa 1 Node khoi queue
//    static  int deQueue(Queue  q)
//    {
//        if (q .front ==  null)
//        {
//            System.out.printf ("Queue is empty");
//            return Integer.MIN_VALUE;
//        }
//
//        // If this is the last node to be deleted
//        int value; // Value to be dequeued
//        if (q .front == q .rear)
//        {
//            value = q .front .data;
//            q .front =  null;
//            q .rear =  null;
//        }
//        else  // There are more than one nodes
//        {
//            Node  temp = q .front;
//            value = temp .data;
//            q .front = q .front .link;
//            q .rear .link= q .front;
//        }
//
//        return value ;
//    }
//
//    //Hien thi
//    static void displayQueue( Queue  q)
//    {
//        Node  temp = q .front;
//        System.out.printf("Elements in Circular Queue are: ");
//        while (temp .link != q .front)
//        {
//            System.out.printf("%d ", temp .data);
//            temp = temp .link;
//        }
//        System.out.printf("%d", temp .data);
//    }
//}
