//  Mark Villa
//  4/20/18
//  Merge Sorted Array
//  O(A*B) time, O(1) space. in place iteration comparing each both array values and emptiness for placement in merged array.

public class p43 {

	public static void main(String[] args) {
		int[] fh = {1,3,5,7,9};
		int[] sh = {2,14,16,18,110};
		System.out.println(Arrays.toString(mergeSorted(fh,sh)));
	}
	
	public static int[] mergeSorted(int[] arr1, int[] arr2)  {
		int half1Count     = 0, half2Count = 0;
	  	int[] merged = new int[arr1.length + arr2.length];
	  	for (int i = 0; i < merged.length ; i++) {
			if (half1Count < arr1.length && half1Count < arr2.length) {
			  if (arr1[half1Count] >= arr2[half2Count]) {
				merged[i] = arr2[half2Count];
				half2Count++;
			  }else if (arr1[half1Count] < arr2[half2Count]) {
				merged[i] = arr1[half1Count];
				half1Count++;
			  }
			} else if(half1Count >= arr1.length) {
			  merged[i] = arr2[half2Count];
			  half2Count++;
			} else if(half2Count >= arr2.length) {
			  merged[i] = arr1[half1Count];
			  half1Count++;
			}
		}
		return merged;
	}
}
