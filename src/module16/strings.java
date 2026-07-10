package module16;

public class strings {
    public static void printletters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean ispallindromne(String str){
        for (int i = 0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
//                System.out.println("It is a pallindrome");
                return false;

            }
        }
        //System.out.println("It is not a pallindrome");
        return true;
    }
    public static double getshortestpath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if (dir == 'N'){
                y++;
            }
            else if (dir=='S') {
                y--;
            }
            else if (dir=='E') {
                x++;
            }
            else {x--;}
        }
        int x2=x*x;
        int y2=y*y;
        return Math.sqrt(x2+y2);
    }
    public static String substring(String str,int si,int ei){
        String substr="";
        for (int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
        return substr;
    }
    public static String touppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){// second condition isliye di because last me bhi space ho sakta h pr use last m word nhib milega to error
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compression(String str){
        String newstr="";
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return  newstr;
    }


    public static void main(String[] args) {
//        char arr[]={'a','b','c'};
//        String str="abcd";
//        String str1=new String("xyz");
//
//
//        // Strings are immutable
//
//        Scanner sc =new Scanner(System.in);
//        String name;
//        name=sc.next(); // prints single word
//        System.out.println(name);
//        String Name;
//        Name= sc.nextLine();
//        System.out.println(Name);
//        String Fullname="Tony stark";
//        System.out.println(Fullname.length());

        // Concatenation
//        String Firstname="Harshit";
//        String Lastname="Vats";
//        String Fullname=Firstname+" "+Lastname;
//        System.out.println(Fullname);
//        System.out.println(Fullname.charAt(4));
//        printletters(Fullname);
//        String x="racecar";
//        System.out.println(ispallindromne(x));
        String path="NS";
        System.out.println(getshortestpath(path));
        String s1="X";
        String s2="X";
        String s3=new String("X");
        if (s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if (s1==s3){// not equal h ye
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if (s1.equals(s3)){      // ye unki value ko equal h ya nhi check krta h
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        String strr="Hello World!";
        substring(strr,0,5);
        System.out.println(strr.substring(0,5));
        String fruits[]={"apple","banana","Mango"};
        String largest=fruits[0];
        for (int i=1;i< fruits.length;i++){
            if (largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        String st="hi i am shradha";
        System.out.println(touppercase(st));
        String first="aaaabbbbbcccccddddeeee";

        System.out.println(compression(first));



    }
}
