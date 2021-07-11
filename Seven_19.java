
public class Seven_19{
	public static void main(String[] args) {
		int[] array={0,1,2,3,10};
		boolean check=Detect(array);
		System.out.println(check);
	}
	public static boolean Detect(int... a){
// check sort via SelectSort
			boolean check=false;
		for (int i=0;i<a.length;i++) {
			int min=a[i];
			int minIndex=i;
			for (int j=i+1;j<a.length;j++) {
				if (min>a[j]) {
					min=a[j];
					minIndex=j;
				}
			}
			if (minIndex!=i) {
				int temp=a[i];
				a[minIndex]=a[i];
				a[i]=temp;
			 check=true;
			}
		}
		return check;
	}
}