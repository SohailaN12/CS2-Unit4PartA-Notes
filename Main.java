public class Main {

   public static void main(String []args) {

      // 1D ARRAY is a block of memory that stores a COLLECTION 
      // of data items (elements) of the same type
      // UNDER ONE VARIABLE NAME!!!


      // How to DECLARE and CREATE an empty Array variable 
      String[] apCompSci = new String[13];
      double[] prices = new double[5]; // default values: 0.0
      String[] names = new String[5]; // default values: null
      int[] luckyNums = new int[10]; // default values: 0
      boolean[] yesNo = new boolean[3]; // default values: false

     // How to ACCESS an item in an Array
      // arrayName[i] -> i is the INDEX (position)
      System.out.println( prices[0] ); // FIRST ITEM!

      // Use the same syntax to SET a value in an Array
      luckyNums[0] = 13; 
      luckyNums[5] = 7;
      System.out.println( luckyNums[0] );
      System.out.println( luckyNums[5] );
      System.out.println( luckyNums[3] ); // prints 0
      // System.out.println( luckyNums[45] ); // index 45 is out of bounds!

      // Create an array with values using an INITIALIZER LIST
      String[] table = { "Mia", "Ethan", "Aaniyah" };
      System.out.println( table[1] ); // gets the SECOND value in array
      System.out.println( table[0] ); // gets the FIRST value (index 0)
      // ONLY use INITIALIZER LIST shortcut when first declaring array
      // i.e. we can't do: apCompSci = {"name1", "name2"}

      // The .length ATTRIBUTE gets the NUMBER OF ITEMS in array
      int lengthOfTableArray = table.length;
      System.out.println( lengthOfTableArray ); // 3 items 
      // To get the LAST INDEX use: arrayName.length - 1
      int finalIndex = table.length - 1;
      System.out.println( finalIndex ); // 2 is final index
      // To get the LAST ITEM use: arrayName[arrayName.length - 1]
      System.out.println( table[finalIndex] ); // table[2] -> "Aaniyah"
      System.out.println( table[table.length - 1 ] ); // same as above

      // *** 4.4: TRAVERSING ARRAYS ***
      double[] scores = { 45.0, 20.0, 89.5, 97.8 };
      // look at one item using an index
      System.out.println( scores[1] );
      // use a STANDARD FOR LOOP to iterate through EVERY item
      for ( int i = 0; i < 4; i++ ) {
         System.out.println( "Current item: " + scores[i] );
      }
      // instead of picking the endpoint with a number like 4,
      // what if we just use the array's length?
      for ( int i = 0; i < scores.length; i++) {
         System.out.println( "Score before curve: " + scores[i] );
         // "curve the test scores" -> modify array items
         scores[i] = scores[i] + 10;
         System.out.println( "Score after curve: " + scores[i]);
      }

      // SHORTCUT if you only want to "visit" items, not modify
      // Use an ENHANCED FOR-EACH loop
      double sum = 0;
      // "for each individual score in the array of scores"
      for ( double score : scores ) {
         // don't need [] brackets, index is not relevant here
         sum += score; // add current item to the sum
      }
      System.out.print(sum);
      double avg = sum / scores.length;
      System.out.println(avg);

      
   } // end Main METHOD
} // end Main CLASS
