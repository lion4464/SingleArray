public class Seven_07 {
	/** Main Method */
	public static void main(String[] args) {
		int[] counts = new int[10]; // Array of ten integers

		// Store the counts of 100 random numbers
		for (int i = 1; i <= 200; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("Count for each number between 0 and 9:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + "s: " + counts[i]);
			
		}
		for (int k=0;k<counts.length;k++ ) {
			System.out.print(counts[k]+" ");
			
		}
	}
}