class Seven_30{
	public static void main(String[] args) {
		int[] list={1,1,3,1,1};
		boolean fore=isConsecutiveFour(list);
			System.out.println(fore);
	}
	public static boolean isConsecutiveFour(int[] values)
	{
		boolean fourcount=false;
		int count=0;
		for (int i=0;i<values.length-1;i++) {
				if (values[i]==values[i+1]) {
					count++;
				}
		}
		if (count>=4) {
			fourcount=true;
		}
		return fourcount;
	}	
}