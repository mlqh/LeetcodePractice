package Basics;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    // Definition for a pair
    class Pair {
        int key;
        String value;
    
        Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public class Solution {
        public List<List<Pair>> insertionSort(List<Pair> pairs) {
            List<List<Pair>> state = new ArrayList<>();
            
            for(int i = 0; i < pairs.size(); i++) {
                for(int j = i - 1; j >= 0 ; j--) {
                    if(pairs.get(j + 1).key < pairs.get(j).key) {
                        Pair temp = pairs.get(j+1);
                        pairs.set(j+1, pairs.get(j));
                        pairs.set(j, temp);
                    }
                }
                List<Pair> newClone = new ArrayList<>(pairs);
                state.add(newClone);
            }
            return state;
        }
    }
}
