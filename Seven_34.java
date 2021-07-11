import java.util.*;

class Seven_34 {
// Main
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		String text=input.nextLine();
		char[] sorttext=new char[text.length()];

			SelSort(text,sorttext);
			for (char ch:sorttext) {
				System.out.print(ch);
			}
	}

	public static void SelSort(String s,char[] sorttext){

		for (int i=0;i<s.length();i++) {
			sorttext[i]=s.charAt(i);
		}

		for (int i=0;i<sorttext.length;i++) {
			char min=sorttext[i];
			int minIndex=i;
			
			for (int j=i+1;j<sorttext.length;j++) {
				if (min>sorttext[j]) {
					min=sorttext[j];
					minIndex=j;
				}
			}

			if (minIndex!=i) {

					 sorttext[minIndex]=sorttext[i];
						sorttext[i]=min;
				}	
		}
	}
}