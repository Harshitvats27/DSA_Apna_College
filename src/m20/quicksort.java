package m20;

import static module13sorting.sorting.printarr;

public class quicksort {
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8,};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pindx =partitonindex(arr,si,ei );// iska kaam h pivot ko uski jgh par leke aana
        quicksort(arr,si,pindx-1);// pivot ke left wale element sort karega ye
        quicksort(arr,pindx+1,ei);// pivot ke right wale element ko sort karega
    }
    public static int partitonindex(int[] arr, int si, int ei){
        int pivot =arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp =pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
