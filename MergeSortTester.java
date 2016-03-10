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
	
  public static long tester(int[] arr) {
	//n is the number of tests
	
  long totalsum = 0;
 
	    long t1 = System.nanoTime(); //time stamp start
	    
	    MergeSort.sort(arr);

	    long t2 = System.nanoTime(); //time stamp end
	    
	    totalsum = t2 - t1;

	}
	    
	return totalsum;

  }

    /******************************
     To gather time data, we will sort a list of a certain size. Then we will increment the size by a factor of 10.
     Then we will analyze the gathered data.
     ******************************/

  public static void main(String[] args) {
	  for (int i = 0; int < 5; int++) {
	  	System.out.println( "Run time for a set of " + Math.pow(10, i) + " elements");
	  	int[] w = new int[Math.pow(10, i)];
	  	for (int u = 0; u < Math.pow(10, i); u++) {
	  		w[i] = (int)(Math.random() * Math.pow(10, i));	
	  	}
	  	System.out.println(tester(w));
	  }
	
  }//end main

}//end class
