package m26queues;

public class queueusingll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class linkedlistsequeue{
        static Node head;
        static Node tail;
        public static boolean isEmpty(){
            if (head==null && tail==null){
                return true;
            }
            return false;
        }


        public static void add(int data){
            Node newnode =new Node(data);
            if (head==null){
                head=tail=newnode;
                return;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
            }
            int front=head.data;
            if(tail==head){// single element
                tail=head=null;
            }else{
                head=head.next;
            }
           return front;

        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        linkedlistsequeue q=new linkedlistsequeue();
        q.add(1);
        q.add(2);
        System.out.println(q.remove());
    }
}
