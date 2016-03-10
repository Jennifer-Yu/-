/*======================================
  class MergeSortTester
  ALGORITHM:
  1. If you have more than 1 card, split into two and call function again.
  2. Repeat until 1 card remains.
  3. Give card to "elder".
  4. "Elder" sorts cards based on comparison of first cards in each stack.
  5. Repeat step 4 until sorted.
  
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(n log(n))
  
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester {
	
  public static long tester(int[] arr, int n) {
	//n is the number of tests
	
  long totalsum = 0;

	for (int x = 0; x < n; x++) { 
 
	    long t1 = System.nanoTime(); //time stamp start
	    
	    MergeSort.sort(arr);

	    long t2 = System.nanoTime(); //time stamp end
	    
	    totalsum += t2 - t1;

	}
	    
	return totalsum / n;

  }

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/

  public static void main(String[] args) {
	  int[] arr0 = {0};
		int[] arr1 = {1};
		int[] arr2 = {1,2};
		int[] arr3 = {3,4};
		int[] arr4 = {1,2,3,4};
		int[] arr5 = {4,3,2,1};
		int[] arr6 = {9,42,17,63,0,512,23};
		int[] arr7 = {9,42,17,63,0,9,512,23,9};
		System.out.println(tester(arr7, 10));
  }//end main

}//end class
