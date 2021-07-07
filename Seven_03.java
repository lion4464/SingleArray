// **7.3 (Count occurrence of numbers) Write a program that reads the integers between
// 1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
// is a sample run of the program:

// Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0
// 2 occurs 2 times
// 3 occurs 1 time
// 4 occurs 1 time
// 5 occurs 2 times
// 6 occurs 1 time
// 23 occurs 1 time
// 43 occurs 1 time


public class Seven_03{

	public static void main(String[] args) {
	// get amount of  numbers
		System.out.print("Please enter amount of numbers: ");
		int[] a=new int[4];
		String[] nechta=new String[4];
	// enter its elements
		System.out.println("Enter elements of  array: ");
		
					for (int i=0;i<a.length;i++)
						a[i]=(int)(Math.random()*10);
	Find(a,nechta);

	// print all elements and how many times are they showing
		System.out.println("show: ");
		// for (int e:a) {
				
		// 	}	
		for (int i=0;i<nechta.length;i++) {
		System.out.println(nechta[i]);
			
		}
	}

	public static void Find(int[] a,String[] b){
		int search=0;
		for (int i=0;i<a.length;i++) {
			int count=0;
			search=a[i];
			for (int j=0;j<a.length;j++) {
				if (search==a[j]) {
				count++;		
				}
			}
		 b[i]=search+"dan"+count+"ta";
		}
	}

}