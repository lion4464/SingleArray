// *7.11 (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
// deviation of numbers. This exercise uses a different but equivalent formula to
// compute the standard deviation of n numbers.
// mean =
// nai=1
// xi
// n
// =
// x1 + x2 + g + xn
// n
// deviation = H ia=n1(xni -- mean) 1 2
// To compute the standard deviation with this formula, you have to store the individual numbers using an array, so they can be used after the mean is obtained.
// Your program should contain the following methods:
// /** Compute the deviation of double values */
// public static double deviation(double[] x)
// /** Compute the mean of an array of double values */
// public static double mean(double[] x)
// Write a test program that prompts the user to enter 10 numbers and displays the
// mean and standard deviation, as presented in the following sample run:

// Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
// The mean is 3.11
// The standard deviation is 1.55738



import java.util.Scanner; 
public class Seven_11{
	public static void main(String[] args) {
		
		double[] array={1.9,2.5,3.7, 2, 1,6,3,4,5,2};
	
	double chiq=Mean(array);
	double devate=Deviation(array);

		System.out.printf("%.2f\n",chiq);
		System.out.printf("%5f\n",devate);
	}

	/** Compute the deviation of double values */
  		public static double Deviation(double[] x){
			 double sum=0;
			 double dev=0;
			double mean=Mean(x);
			int n=0;
			for (double e:x) {
				sum+=Math.pow((e-mean),2);
				n++;
			}
			return dev=Math.sqrt(sum/(n-1));

  		}
  	/** Compute the mean of an array of double values */
		public static double Mean(double[] x){
			double sum=0;
			double mean;
			int n=0;
			for (double e:x) {
				sum+=e;
				n++;
			}
			return mean=sum/n;
		}
}