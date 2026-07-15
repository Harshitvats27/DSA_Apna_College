package m20backtracking;

public class find_subsets {

    public static void subsets(String str,String ans,int i){
        if(i==str.length()){
            if (ans.length()==0){
                System.out.print("null");
                return;
            }else{
                System.out.println(ans);
                return;
            }

        }
        // recursion ka kaam
        // yes
        subsets(str,ans+str.charAt(i),i+1);
        // no
        subsets(str,ans,i+1);
    }
    public static void main(String[] args) {
String str="abc";
subsets(str,"",0);
    }
}
