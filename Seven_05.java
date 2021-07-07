// **7.5 (The number of even numbers and odd numbers) Write a program that reads ten
// integers, and then display the number of even numbers and odd numbers. Assume
// that the input ends with 0. Here is the sample run of the program

// for example:
// Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0
// The number of odd numbers: 8
// The number of even numbers: 7

// Scanner

import java.util.Scanner; 
public class Seven_03{

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

	// get amount of  numbers
		System.out.print("Please enter amount of numbers: ");
		int var=input.nextInt();
		int[] a=new int[var];
		int Oddcount=0;
		int Evencount=0;
	// enter its elements
		System.out.println("Enter elements of  array: ");
		
					for (int i=0;i<a.length;i++)
						a[i]=input.nextInt();
		
	// print all elements and how many times are they showing
		System.out.println("show: ");
		Findnumbers(a,Oddcount,Evencount);
		
	}


	public static void Findnumbers(int[] a,int Evencount,int Oddcount){
		for (int i=0;i<a.length; i++) {

	  	boolean isOdd=Toq(a[i]);
		  if(a[i]==0){
		  		break;
		  }
		  else{
		  	if (isOdd) 
		  		Oddcount++;
		  	else
		  		Evencount++;
		  }
		}
				System.out.println("There are "+Oddcount+" (Odd) numbers in the array");
				System.out.println("There are "+Evencount+" (Even) numbers in the array");
	}

	public static boolean Toq(int var){
   	
	   boolean toq=true;
	      if (var%2==0)
	         toq=false;
	    return toq;
	}





}