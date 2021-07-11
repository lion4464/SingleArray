import java.util.*;
public class Sevent_21{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] array=new double[4];
		for (int i=0;i<array.length;i++) {
			array[i]=input.nextDouble();
		}
		NormalInteger(array);

		for (int i=0;i<array.length;i++) {
			System.out.printf("%.3f",array[i]/array[array.length-1]);
			System.out.println();
		}
	}

// check sort via SelectSort
public static void NormalInteger(double... a){
		for (int i=0;i<a.length;i++) {
			double min=a[i];
			int minIndex=i;
			for (int j=i+1;j<a.length;j++) {
				if (min>a[j]) {
					min=a[j];
					minIndex=j;
				}
			}
			if (minIndex!=i) {
				double temp=a[i];
				a[minIndex]=a[i];
				a[i]=temp;
				}
		}
	}

}