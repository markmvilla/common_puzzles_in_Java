//  Mark Villa
//  4/20/18
//  In Place Shuffle
//  O(n) time, O(1) space. in place random spwaping.

public p35 {

  public String[] shuffle(String[] data ) {

        String temp ;
        for (int i=0; i< data.length ; i++) {
            int dest = (int) Math.floor((Math.random() * data.length));
            temp = data[i] ;
            data[i] = data[dest] ;
            data[dest] = temp ;
        }
        return data ;
    }

}
