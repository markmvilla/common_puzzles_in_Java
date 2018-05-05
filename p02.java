// Mark Villa
// 4/20/18
// Array of Products
// O(n) time O(n) space. maintain a left[] and right[] product for each i. return out[] with each left[] * right[].

class Product {
   public int[] products(int[] values) {
     int[] products;

     if (values.length<2) {
       return -1;
     }

     int temp = 1;
     
     for (int i=0; values.length; i++) {
       products[i] = temp;
       temp *= values[i];
     }
     
     temp = 1;
     
     for (int j=values.length-1; j>=0; j--) {
       products[j] *= temp;
       temp *= values[j];
     }
     
     return products;
   }
}
