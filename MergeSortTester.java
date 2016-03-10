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
  n=1       time: 507166 ns
  n=10      time: 10262 ns
  n=100     time: 63717 ns
  ...
  n=10000  time: 1087456 ns
  ANALYSIS:
  
  The method is O(n log(n)) but for some reason a list of one element takes much longer than a list of 10 and 100 elements.
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
	  for (int i = 0; i < 5; i++) {
	  	System.out.println( "Run time for a set of " + Math.pow(10, i) + " elements");
	  	int[] w = new int[(int)(Math.pow(10, i))];
	  	for (int u = 0; u < (int)(Math.pow(10, i)); u++) {
	  		w[i] = (int)(Math.random() * Math.pow(10, i));	
	  	}
	  	System.out.println(tester(w));
	  }
	
  }//end main

}//end class

/* ALTERNATE METHOD
public class MergeSortTester {
	
    public static long tester(int tests, int n) {
	//tests is the number of tests
	//n is the number of items in the dataset
	
    long totalsum = 0;
    
    int[] arr = new int[n];
    
    for (int y = 0; y < n; y++) { //create array
        arr[y] = (int)(Math.random()*n);
    }

	for (int x = 0; x < tests; x++) { //take the average time
 
	    long t1 = System.nanoTime(); //time stamp start
	    
	    MergeSort.sort(arr);

	    long t2 = System.nanoTime(); //time stamp end
	    
	    totalsum += t2 - t1;

	}
	    
	    return totalsum / tests;

    }

    public static void main(String[] args) {
		System.out.println(tester(5, 1));
		System.out.println(tester(5, 10));
		System.out.println(tester(5, 100));
		System.out.println(tester(5, 10000));
	    }
}
*/
