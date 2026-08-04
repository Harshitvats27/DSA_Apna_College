package m26queues;

public class circularqueue {
    static class ueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        ueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            if (rear==-1){return true;}
            return false;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Full");
            }
            if (front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else {
                front=(front+1)%size;
            }

            return result;
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }








    }

    public static void main(String[] args) {
        ueue q=new ueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
