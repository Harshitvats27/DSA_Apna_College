package m20backtracking;

public class array_basic_backtracking {
    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changearr(int[] arr,int val,int i){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i]=val;
        changearr(arr,val+1,i+1);
        arr[i]=arr[i]-2;//backtracking
    }

    public static void main(String[] args) {
        int arr[] =new int[5];
        changearr(arr,0,1);
        printarr(arr);
    }
}
