package m26queues;

public class queueusingstack {
     static class Queuee{
        static int arr[];
        static int size;
        static int rear;
        Queuee(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

         public static boolean isEmpty(){
             if (rear==-1){return true;}
             return false;
         }
         public static void add(int data){
            if(rear==size-1){
                System.out.println("Full");
            }
            rear=rear+1;
            arr[rear]=data;
         }
         public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
         }
         public static int peek(){
            if (isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }








    }
    public static void main(String[] args) {
         Queuee q =new Queuee(5);
         q.add(5);
        q.add(3);
        q.add(8);
        q.add(6);
         while (!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
         }

    }

}
