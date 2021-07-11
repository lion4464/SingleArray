public class Seven_16{

// Main Method
	public static void main(String[] args) {
		
		String[] arrays={ "SalimovShokir", "TohirovMahkamboy","Oripov Rustamjon"};
		int[] scores={45,2,90};
		SelSort(scores,arrays);
		
		for (int i=0;i<arrays.length;i++) {
				System.out.println((i+1)+") "+arrays[i]+":"+scores[i]);
			
		}
		
	}
// SelectionSort
	public static void SelSort(int[] list,String[] arr){
		for (int i=0;i<list.length;i++) {
			int min=list[i];
			int minIndex=i;
			
			for (int j=i+1;j<list.length;j++) {
				if (min>list[j]) {
					min=list[j];
					minIndex=j;
				// System.out.println(minIndex);
				}
			}
			if (minIndex!=i) {
			// SWAP SCORES ARRAY
				
				list[minIndex]=list[i];
				// System.out.println(list[minIndex]);
				list[i]=min;
			
			// SWAP SCORES ARRAY
				String temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
				}
		}
	}

}