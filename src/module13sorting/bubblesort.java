package module13sorting;

public class bubblesort {
    public static void  Bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for (int j=0;j<arr.length-1-turn;j++){// because wo last wale m sort kr chuka h
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,9,4,3,2,7};
        Bubblesort(arr);
        printarr(arr);
    }

}
