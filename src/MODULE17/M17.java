package MODULE17;

public class M17 {
    public static void oddoreven(int n ){
        int bitmask =1;
        if((n&bitmask)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static int getithbit(int n,int i ){
        int bitmask =1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setbit(int n , int i){
        int bitmask =1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n , int i){
        int bitmask =~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n,int i,int newbit){
        if(newbit==0){
            return clearithbit(n,i);
        }
        else {
            return setbit(n,i);
        }
//        n=clearithbit(n,i);
//        int Bitmask=newbit<<i;
//        return n|Bitmask;
    }
    public static int clerarlastibits(int n ,int i) {
        int bitmask =~(0)<<i;
        return n & bitmask;
    }
    public static int clearrangeofbits(int n, int i, int j ){
        int a =(~(0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static boolean ispowerof2(int n){
        return (n & n-1)==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while (n>0){
            if ((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastexpo(int a ,int n ){// a to the power n
        int ans =1;
        while(n>0){
            if((n&1)!=0){// check lsb yhan 1 h
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~0);
        System.out.println(5<<2);
        System.out.println(5>>2);
        oddoreven(8);
        System.out.println(getithbit(10,2));
        System.out.println(setbit(10,2));
        System.out.println(clearithbit(10,1));
        System.out.println(updateithbit(10,2,1));
        System.out.println(clerarlastibits(15,2));
        System.out.println(clearrangeofbits(10,2,4));
        System.out.println(ispowerof2(8));
        System.out.println(countsetbits(16));
        System.out.println(fastexpo(3,5));
    }
}
