package m26queues;

import java.util.OptionalInt;
import java.util.Stack;

public class queueusing2stack {
    public static class qu2s {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
         return s1.isEmpty();
        }

        public  void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());

            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());

            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            return s1.peek();
        }


    }

    public static void main(String[] args) {
        qu2s q=new qu2s();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
