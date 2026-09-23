import java.util.Scanner;
public class IT24102055Lab6Q2B   {
	public static void main(String[] args)   {
	
	Scanner value = new Scanner(System.in);
	
	int x = 1;
	int number = 0;
	String numbers = "" ;
	System.out.println("Please enter 10 numbers:"); 


	while (x <= 10)  {
		
		System.out.print("Enter number " + x +  ": ");
		
		number = value.nextInt();
		numbers += number + " " ;
		x = x+1;
		
		
		  }
		 

		System.out.println("\nThe number you entered are:"  );
		System.out.print(numbers);

	}
			
		
}
