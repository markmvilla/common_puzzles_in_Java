//  Mark Villa
//  4/20/18
//  Top Scores
//  O(n+k) (n=size and k=range) time, O(n) space. count sort.

public class P32 {

    public Integer[] countingSort(Integer[] data, int maxScore) {
        int[] store = new int[maxScore];

        for (Integer i : data) {
            store[i]++;
        }

        Integer[] out = new Integer[data.length];
        int idx=0;
        for (int i=0; i<store.length; i++) {
            while (store[i] != 0) {
                store[i] = store[i] - 1;
                out[idx] = i;
                idx++;
            }
        }
        return out;
    }

}
