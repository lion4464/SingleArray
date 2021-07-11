class Seven_28{
	public static void main(String[] args) {
		int[] array={1,2,3};

		Permutations(array);
	}
	public static void Permutations(int[] list){
		int Index=0;
		int sum=1;
		for (int i=0;i<list.length;i++) {
			for (int e=0;e<list.length;e++) {
					if (i!=e) {
							System.out.println(list[i]+""+list[e]);
							 }
			}
		}
		
	}
}