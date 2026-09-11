package m28_greedy_algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity_selection_unsorted {
    public static void main(String[] args) {
        int start[] = {3, 1, 0, 5, 8, 5};
        int end[] = {4, 2, 6, 7, 9, 9};


        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // lambda fn to sort it
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        int maxact = 0;// jo select karni h
        ArrayList<Integer> ans = new ArrayList<>();// isme daalenge

        maxact = 1;
        ans.add(activities[0][0]);// number daalna h na isme
        int lastendhui = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastendhui) {
                ans.add(activities[i][0]);
                maxact++;
                lastendhui = activities[i][2];
            }
        }

        System.out.println("max act " + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
