import java.util.*;

class Seven_35 {
	public static void main(String[] args) {
		
		String[] words={"Salom","ona"};
		

// ------------------------------------------------
int sum=0;
	for (int i=0;i<words.length;i++) {
				 String a=words[i];
				 sum+=a.length();
				 }		
// ------------------------------------------------
				 char[] arr=new char[sum];
// ------------------------------------------------
		 for (int i=0;i<words.length;i++) {
				 String a=words[i];
		
		 	for (int j=0;j<a.length();j++) {
		 		arr[j]='*';
		 		// System.out.print(arr[j]);
		 	
		 	}
		 }


		// char signs='l';


			// 	 char charac=signs;
		 // for (int i=0;i<words.length;i++) {
			// 	 String a=words[i];
		 // 	for (int j=0;j<a.length();j++) {
		 // 		char wordLetter=a.charAt(j);
		 // 		if (wordLetter==charac) {
		 // 		// System.out.print(wordLetter);
		 // 			arr[j]=charac;
		 // 		}
		 // 	}
		 // }


for (char e:arr) {
	System.out.print(e);
}

		 // Scanner input=new Scanner(System.in);	
		 // String text=input.nextLine();

		 // Check(text,signs);
	}
	// public static void Check(String,char[] signs)
}