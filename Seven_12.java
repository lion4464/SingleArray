// (Reverse an array) The reverse method in Section 7.7 reverses an array by
// copying it to a new array. Rewrite the method that reverses the array passed in
// the argument and returns this array. Write a test program that prompts the user to
// enter 10 numbers, invokes the method to reverse the numbers, and displays the
// numbers.

public class Seven_12 {
	/** Main Method */
	public static void main(String[] args) {
		int[] counts = new int[10]; // Array of ten integers
		int[] reverse = new int[10]; // Array of ten reverse integers

	// Store the counts of 10 numbers
		for (int i =0; i <10; i++) {
			counts[i]=i;
		}
	// call reverse method
		Reverse(counts,reverse);
	// Echo all items of count array
		for (int i =0; i <counts.length; i++) {
		System.out.print(counts[i]+" ");
		}
		System.out.println();
	// Reverse array to count array
		for (int i =0; i <counts.length; i++) {
		System.out.print(reverse[i]+" ");
		}
	}
	// Reverse method
	public static void Reverse(int[] a,int[] b){
			// Store the reverse of 10 numbers
				for (int j =a.length-1,i=0; j >=0; j--) {
					b[j]=a[i];
					i++;
				}
	}

}