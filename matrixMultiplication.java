package matrixMultiplication;
import java.util.*;
public class matrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String name;
		int fil1,col1,fil2,col2;
		int f = 0;
		
		do {
			System.out.println("Please give me your name: ");
			name = sc.nextLine();
			System.out.println("Hello " + name + "\n");
			System.out.println("Today we will perform multiplication of matrices \nThe system will perform the multiplication with matrices up to : \n10x10 \n");
			System.out.println("Select an option");
			System.out.println("1.-Continue");
			System.out.println("2.-Exit");
			
			System.out.println("Please enter the number of row for matrix 1: ");
			fil1 = sc.nextInt();
			System.out.println("Please enter the number of columns for matrix 1: ");
			col1 = sc.nextInt();
			System.out.println("Please enter the number of  rows matrix 2: ");
			fil2 = sc.nextInt();
			System.out.println("Please enter the number of columns for matrix 2: ");
			col2 = sc.nextInt();
			
				if (((fil1 > 10)||(col1 > 10))||((fil2 > 10)||(col2 > 10)))
				{
					System.out.println("It can not be solved");
				}
				else 
				System.out.println("Hola");	
			
			
			sc.close();
		
	   }while (f==0);
	}	

}
