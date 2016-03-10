//Sachal Malick

/*======================================
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm: 
  
  Sachal Malick
The Merge Sort algorithm uses recursive calls to continuously divide up the work
required to sort a set of elements.  First you divide up the elements into two groups,
then you divide both of those groups into two groups, you keep on doing that until you have
just one element.  Then you merge your sorted deck with the other deck who originated from
the same mommy/daddy deck.  So you are calling the recursive call twice, once on each of the sub decks.
Kind of like in the fibonacci sequence.  So im going to take one deck, split it into two baby decks
then merge the sort of sub1 and the sort of sub2.  If i get to the point where i have just one element
then i can just hand it back to daddy because its already sorted.  When you are comparing to decks
with more than one element in them you only need to compare consecutive elements since each deck is sorted
so each element in each deck is greater than the element that came before it.
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
		int count = 0;
		int bval = 0;
		int aval = 0;
		int newarr [] = new int [a.length +  b.length];
		while (count < newarr.length) {
			if (aval >= a.length) {
				newarr[count] = b[bval];
				bval++;
			}
			else if (bval >= b.length) {
				newarr[count] = a[aval];
				aval++;
			}
			else {
			if (a[aval] < b[bval]) {
				newarr[count] = a[aval];
				aval++;
			}
			else {
				newarr[count] = b[bval];
				bval++;
			}
			}
			count++;
		}
		
		/*
		0,3,5     1,2,4,6,7,9
        0,1,3,4,5,6,7,9 		
		*/
		
		return newarr;

    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length == 1) {
		return arr;
	}
	else {
	int s = arr.length / 2;
	int [] split1 = new int [s];
	int [] split2 = new int [arr.length - s];
	for (int i = 0; i < arr.length; i++) {
		if (i < s) {
			split1[i] = arr[i];
		}
		else {
			split2[i-s] = arr[i];
		}
	}
	return merge (sort(split1), sort(split2));
	}
	
	
    }//end sort()

//3,5,

    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {
	
	
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};
	//System.out.println("\nTesting mess-with-array method...");
	//printArray( arr3 );
	//mess(arr3);
	//printArray( arr3 );
	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );
	System.out.println("\nMerging arr2 and arr3: ");
	printArray( merge(arr2,arr3) );
	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr7 ) );
/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~

	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort