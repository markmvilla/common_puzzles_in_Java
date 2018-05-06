//  Mark Villa
//  4/20/18
//  Single Riffle Shuffle
//  O(n) time, O(1) space. in place iteration checking if halfstack order is maintained throughout full.

public class P36 {

	public static void main(String[] args) {
		int[] fh = {1,3,5,7,9};
		int[] sh = {2,4,6,8,10};
		int[] full = {1,3,5,2,4,6,7,8,9,10};
		System.out.println(isRiffle(fh,sh,full));
	} 
	
    public static Boolean isRiffle(int[] half1, int[] half2, int[] deck )  {
        int half1Count = 0, half2Count = 0;
        for (int i = 0; i < deck.length ; i++) {
            if (half1Count < half1.length && deck[i] == half1[half1Count]) {
                half1Count++;
            } else if (half2Count < half2.length && deck[i] == half2[half2Count]) {
                half2Count++;
            } else {
                return false;
            }
        }
        return true;
    }
    
}
