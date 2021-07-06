// *7.1 (Assign grades) Write a program that reads student scores, gets the best score, and
// then assigns grades based on the following scheme:
// Grade is A if score is Ú best -5
// Grade is B if score is Ú best -10;
// Grade is C if score is Ú best -15;
// Grade is D if score is Ú best -20;
// Grade is F otherwise.
// The program prompts the user to enter the total number of students, and then
// prompts the user to enter all of the scores, and concludes by displaying the grades.
// Here is a sample run:
// Enter the number of students: 4
// Enter 4 scores: 40 55 70 58
// Student 0 score is 40 and grade is F
// Student 1 score is 55 and grade is C
// Student 2 score is 70 and grade is A
// Student 3 score is 58 and grade is C

import java.util.Scanner; 

public class Seven_01{

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

// get amount of students' numbers
System.out.println("Please enter number of Students: ");
int[] Scores=new int[input.nextInt()];
char[] Grades=new char[Scores.length];

// enter theirs Scores
System.out.print("Enter score of "+Scores.length+" Students: ");
for (int i=0;i<Scores.length;i++) {
	Scores[i]=input.nextInt();
}

// Get grade of Students 
getGrade(Scores,Grades);

// Print all score and grades

for (int i=0;i<Scores.length;i++) {

System.out.println("Score of student "+i+"is: "+Scores[i]+" And grade is: "+Grades[i]);


}

	
}
// find method the best score
public static int max(int[] array){
int max=array[0];
for (int i=1;i<array.length;i++) {
	if(array[i]>max) 
		max=array[i];
	}
 return max;

}
// get score of numbers
public static void getGrade(int[] Scores,char[] Grades) {
		int best= max(Scores);
		for (int i=0;i<Scores.length;i++) {
			if (Scores[i]>=best-5) 
					Grades[i]='A';
			else if (Scores[i]>=best-10) 
						Grades[i]='B';
			else if (Scores[i]>=best-15) 
						Grades[i]='C';
			else if (Scores[i]>=best-20) 
						Grades[i]='D';
			else
				Grades[i]='F';
		}
	}
	
}