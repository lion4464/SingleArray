
// (Eliminate duplicates) Write a method that returns a new array by eliminating the
// duplicate values in the array using the following method header:
// public static int[] eliminateDuplicates(int[] list)
// Write a test program that reads in 10 integers, invokes the method, and displays
// the distinct numbers separated by exactly one space. Here is a sample run of the
// program:

// Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
// The distinct numbers are: 1 2 3 6 4 5


public class Seven_14{

// Main Method
	public static void main(String[] args) {
		int[] numbers={1,2,3,2,1,6,3,4,5,2};

for (int k:numbers) {
	System.out.print(k+", ");
	
}

		int[] Newarr=eliminateDuplicates(numbers);


	System.out.println();
	System.out.println("Result: ");
	int count=0;
	for (int a:Newarr) {
			if (a!=0) {
			System.out.print(a+" ");
				}
			else{
				count++;
			}
		}	
	System.out.println();
			System.out.println(count+1+"ta bir xil son bor!!!");
	}

	public static int[] eliminateDuplicates(int[] arr){
		for (int i=0;i<arr.length;i++) {
			int son=arr[i];
			for (int j=0;j<arr.length;j++) {
				if (son==arr[j]) {
					arr[j]=0;
				}
			}
			arr[i]=son;
		}
		return arr;
	}




}