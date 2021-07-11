
class Seven_27{
	// main method
	public static void main(String[] args) {
		int[] array={0,3,6,9};
			boolean isCI=isSortedConstantInterval(array);
		// System.out.print("{ ");
				for (int e :array ) {
				System.out.print(+e+" ");
				}
		// System.out.print("}");
		System.out.print("\n"+isCI);
		}
		// check constant interval method
		public static boolean isSortedConstantInterval(int[] list){
			int interval=list[1]-list[0];
			boolean isconst=true;
			for (int i=1;i<list.length-1;i++) {
				if (list[i+1]-list[i]!=interval) {
					isconst=false;
				}
			}
			return isconst;
		}
}