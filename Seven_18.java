public class Seven_16{

// Main Method
	public static void main(String[] args) {
		
		int[] arrays={4,5,6,89,8,15,0};
		BubleSort(arrays);
		for (int e:arrays) {
			System.out.println(e);
		}
	}
	
	public static void BubleSort(int[] a){
		
		for (int i=0;i<a.length;i++) {
				System.out.println("a: "+i);
			for (int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				System.out.println("step:"+j+"="+a[j]+","+a[j+1]);
				
			}
			
		}
	} 
}