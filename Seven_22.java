// (Count the number of vowels in a string) Write a program that prompts the user to enter
// a string, and counts and displays the number of both lowercase and uppercase vowels
// in the string.


import java.util.*;
public class Sevent_21{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string:");
		String text=input.nextLine();
// call method countLetters
		 CountLetters(text);
				
	}
// Count all uppercase and Lowercase latters
	public static void CountLetters(String topic){

		int lowercase=0;
		int uppercase=0;

		 for (int i=0;i<topic.length();i++) {
		 	char ch=topic.charAt(i);
	// detect white space
		 	if (ch!=' ') {
	// incement lowercase amount
		 		 if (Character.isLowerCase(ch)) {
		 			lowercase++;
		 		 }
		 		 else{
	// incement Uppercase amount
		 			 uppercase++;
		 		}
		 		
		 	}
		 }
		 System.out.println("There are:("+lowercase+") Lowercase letters");
		 System.out.println("There are:("+uppercase+") Uppercase letters");
	}
}