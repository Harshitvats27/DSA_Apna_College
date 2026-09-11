package m28_greedy_algo;

import java.util.Arrays;
import java.util.Comparator;

public class max_length_chain_of_pairs {
    public static void main(String[] args) {
        int pairs[][]={
                {5,24},{39,60},{5,28},{27,40},{50,90}
        };

        // sort by second number
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainlength=1;
        int pairend=pairs[0][1]; // abhi phle ek pair liya h to uska last part h bhai

        for(int i =1;i< pairs.length;i++){
            if(pairs[i][0]>pairend){
                chainlength++;
                pairend=pairs[i][1];
            }
        }
        System.out.println(chainlength);




    }
}
