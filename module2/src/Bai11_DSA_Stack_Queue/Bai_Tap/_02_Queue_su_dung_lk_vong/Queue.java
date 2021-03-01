package Bai11_DSA_Stack_Queue.Bai_Tap._02_Queue_su_dung_lk_vong;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if(front == null){
            if(rear == null){
                this.front = this.rear = temp;
                this.rear.link = this.front;
            }
        } else {
            this.rear.link = temp;
            this.rear = temp;
            this.rear.link = this.front;
        }
    }
}
