package module12arrays;

import java.util.*;
import java.util.Scanner;
public class mmm {
    public static void update(int Marks[]) {
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }

    public static int Linearsearch(int numbers[], int key) {// time Complexity is O(n)
        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest =numbers[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if (smallest>numbers[i]){
                smallest =numbers[i];
            }
        }
        return smallest;
    }
    public static int binarysearch(int numbers[],int key){
        int start =0; int end =numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int numbers[]){
        int first =0 ; int last = numbers.length-1;
        while(first<last){
            // swap
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void pairs(int numbers[]){
        int tp =0;
        for(int i = 0;i<numbers.length;i++){
            int curr =numbers[i];
            for(int j=0;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void subarrays(int numbers[]){
        int ts=0;
        for (int i =0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end =j;
                for(int k =start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays:"+ts);
    }
    public static void Max_subarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i =0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end =j;
                currsum=0;
                for(int k =start;k<=end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if (maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum"+maxsum);
    }
    public static void Max_subarray_prefix(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for (int i =1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i =0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end =j;
                currsum= start==0? prefix[end]:prefix[end]-prefix[start-1];
                if (maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum"+maxsum);
    }
    public static void kadans(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Max sum is "+ms);
    }
    public static int trapped_rain_water (int height[]){
        int n=height.length;
        //calculate leftmaxboundary--array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate rightmaxboundary--array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        // loop
        int trappedrain=0;
        for (int i=0;i<n;i++){
            //waterlwevel = min of left max and right max
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped water =water level - height
            trappedrain+=waterlevel-height[i];
        }
        System.out.println("the trapped rain water is ");
        return trappedrain;
    }
    public static  int stokes_profit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){//profit
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {//video 3
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics Marks" + marks[0]);
        System.out.println("Chemistry Marks" + marks[1]);
        System.out.println("Maths Marks" + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 100;
        int Marks[] = {56, 8, 54, 6, 7};
        update(Marks);
        for (int i = 0; i<Marks.length; i++) {
            System.out.print(Marks[i] + " ");
        }


        int numbers[] = {2, 4, 56, 54, 42, 3};
        int key = 59;
        int index = Linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("not found ");
        }
        else{
            System.out.println("key is at index:"+index);
        }
        System.out.println("The largest Value is :"+ getlargest(numbers));
        System.out.println("The smallest Value is :"+ getsmallest(numbers));
        System.out.println("index for key is:"+ binarysearch(numbers,56));
        reverse(numbers);
        //print array
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        pairs(numbers);
        int Numbers[]={1,-2,6,-1,3};
        subarrays(Numbers);
        Max_subarray(Numbers);
        Max_subarray_prefix(Numbers);
        int lumbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(lumbers);
        // rain water problem
        int height[]={4,2,0,6,3,2,5};
        System.out.println( trapped_rain_water(height));
        // stokes
        int prices[]={7,1,5,3,6,4};
        System.out.println(stokes_profit(prices));



    }
}
