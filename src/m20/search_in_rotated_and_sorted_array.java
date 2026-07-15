package m20;

public class search_in_rotated_and_sorted_array {
    public static void main(String[] args) {
      int[] arr={4,5,6,7,0,1,2};
        System.out.println(searchinrotatedarray(arr,0,0,arr.length-1));
    }
    public static int searchinrotatedarray(int[] arr,int trg,int si,int ei){
            if(si>ei){return -1;}
        int mid=si+(ei-si)/2;
        if (arr[mid]==trg){
            return mid;
        }
        //line1
        if(arr[si]<=arr[mid]){
            // case a
            if(arr[si]<=trg && trg<=arr[mid]){
                return searchinrotatedarray(arr,trg,si,mid);
            }

            // case b
            else {
               return searchinrotatedarray(arr,trg,mid+1,ei);
            }

        }
        // line2
        else {
            // case c
            if(arr[mid]<=trg && trg<=arr[ei]){
                return searchinrotatedarray(arr,trg,mid+1,ei);

            }
            // casend
            else {
               return searchinrotatedarray(arr,trg,si,mid-1);
            }




        }

    }
}
