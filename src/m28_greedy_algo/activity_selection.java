package m28_greedy_algo;

import java.util.ArrayList;

public class activity_selection {
    public static void main(String[] args) {

        // abhi hame phle se hi sorted di hui thi isme warna end task se sort karn ah hame
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int maxact = 0;// jo select karni h
        ArrayList<Integer> ans = new ArrayList<>();// isme daalenge

        maxact = 1;
        ans.add(0);
        int lastendhui = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastendhui) {
                ans.add(i);
                maxact++;
                lastendhui = end[i];
            }
        }

        System.out.println("max act " + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }


    }
}
