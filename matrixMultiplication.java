package matrixMultiplication;
import java.util.*;
public class matrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String name;
		int fil1,col1,fil2,col2;
		int i,j,x;
		int f = 0;
		int option, correct1, correct2;
		double matrix1 [][] = null;
		double matrix2 [][] = null;
		double matrix3 [][] = null;

		System.out.println("Please give me your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "\n");
		System.out.println("Today we will perform multiplication of matrices \nThe system will perform the multiplication with matrices up to : \n10x10 \n");
		
		do {
			
			System.out.println("Select an option");
			System.out.println("1.-Continue");
			System.out.println("2.-Exit");
			option = sc.nextInt();
			
			switch(option)
			{
			 case 1:
        			System.out.println("Please enter the number of row for matrix 1: ");
        			fil1 = sc.nextInt();
        			System.out.println("Please enter the number of columns for matrix 1: ");
        			col1 = sc.nextInt();
        			System.out.println("Please enter the number of  rows matrix 2: ");
        			fil2 = sc.nextInt();
        			System.out.println("Please enter the number of columns for matrix 2: ");
        			col2 = sc.nextInt();
    			
				if ((col1 == fil2)&&(fil1 <= 10)&&(col1<=10)&&(fil2<=10)&&(col2<=10))
			    {
		        	 matrix1 = new double [fil1][col1];                                      //First matrix
		    				System.out.println("Give me the numbers of matrix 1: ");
		    				for (i=0;i<fil1;i++)
		    				{
		    					for(j=0;j<col1;j++)
		    					{
		    						System.out.print("Position " + i + ","+j+": ");
		    						matrix1[i][j] = sc.nextDouble();
		    					}
		    				}
		    				
		    				System.out.println("The first matrix is:");
						 	  for (i=0;i<fil1;i++)
						 	  {
						 		  for (j=0;j<col1;j++)
						 		  {
						 			  System.out.print(matrix1[i][j]+"\t");
						 			  
						 		  }
						 		  System.out.println(" ");
						 	  }
						 	  System.out.println("\n");                                             
		    				
		    				System.out.println("Are the values of the matrix correct ?");
		 					System.out.println("1.-Yes");
		 					System.out.println("2.-No");
		 					correct1  = sc.nextInt();
			 					do {
									switch (correct1)
									 {
									  case 2:
											  System.out.println("Rewrite the values: ");
													  for (i = 0; i<fil1;i++)
														{
															for(j = 0;j<col1;j++)
															{
																System.out.print("Position " + i + ","+j + ": ");
																matrix1[i][j] = sc.nextDouble();
																
															}
														}
													  System.out.println("\n"); 
														System.out.println("The matrix is: ");
														for (i = 0; i<fil1;i++)
														{
															for(j = 0;j<col1;j++)
															{
																System.out.print(matrix1[i][j]+"\t");
															}
															System.out.println("");
														}
														
														System.out.println("Are the values of the matrix correct ?");
														System.out.println("1.-Yes");
														System.out.println("2.-No");
														correct1 = sc.nextInt();
										  break;
										  
									case 1:
									  System.out.println("They are correct");		
									  correct1 = 1;
						           break;
						           
						           default:
						        	   System.out.println("That is not an option");
						        	   correct1 = 2;
						        	   System.out.println("Are the values of the matrix correct ?");
										System.out.println("1.-Yes");
										System.out.println("2.-No");
										correct1 = sc.nextInt();
						           break;
						           
						           
					            }
					}while (correct1 != 1);	                                                          //First matrix
			    	 System.out.println("\n");			 
			    				 
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
		 					
		    				 
		    		 matrix2 = new double [fil2][col2];                                      //Second matrix
		     				System.out.println("Give me the numbers of matrix 2: ");
		     				for (i=0; i<fil2; i++)
		     				{
		     					for(j=0; j<col2; j++)
		     					{
		     						System.out.print("Position " + i + ","+j+": ");
		     						matrix2[i][j] = sc.nextDouble();
		     					}
		     				}
		     				
		     				System.out.println("The second matrix is:");
							 	  for (i=0; i<fil2; i++)
							 	  {
							 		  for (j=0; j<col2; j++)
							 		  {
							 			  System.out.print(matrix2[i][j]+"\t");
							 			  
							 		  }
							 		  System.out.println(" ");
							 	  }
							 	  System.out.println("\n");                                             
		     				 System.out.println("");                                              //Second matrix
		     				 
		     				 
		     				System.out.println("Are the values of the matrix correct ?");
							System.out.println("1.-Yes");
							System.out.println("2.-No");
							correct2 = sc.nextInt();
		 					do {
										switch (correct2)
										 {
										  case 2:
												  System.out.println("Rewrite the values: ");
														  for (i = 0; i<fil2;i++)
															{
																for(j = 0;j<col2;j++)
																{
																	System.out.print("Position " + i + ","+j + ": ");
																	matrix2[i][j] = sc.nextDouble();
																	
																}
															}
														  System.out.println("\n"); 
															System.out.println("The second matrix is: ");
															for (i = 0; i<fil2;i++)
															{
																for(j = 0;j<col2;j++)
																{
																	System.out.print(matrix2[i][j]+"\t");
																}
																System.out.println("");
															}
															
															System.out.println("Are the values of the matrix correct ?");
															System.out.println("1.-Yes");
															System.out.println("2.-No");
															correct2 = sc.nextInt();
											  break;
										case 1:
										  System.out.println("They are correct");		
										  correct2 = 1;
							           break;
							           
							           default:
							        	   System.out.println("That is not an option");
							        	   correct2 = 2;
							        	   System.out.println("Are the values of the matrix correct ?");
											System.out.println("1.-Yes");
											System.out.println("2.-No");
											correct2 = sc.nextInt();
							           break;
					           
							         }
						}while (correct2 != 1);	                                                         
				    	 System.out.println("\n");	
				     				 
		     				 
		     				 
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	     		////////////Multiplication 		 
		     			
							
		     				 System.out.println("The result of the multiplication is: ");         ////////////Multiplication 

		     				matrix3 = new double [fil1][col2];
		     				for (i=0; i<fil1 ;i++)
		     				{
		     					for(j=0; j<col2; j++)
		     					 {
		     						for(x=0; x<col1; x++)
		     						  {
		     									matrix3 [i][j] = matrix3 [i][j] + (matrix1[i][x] * matrix2 [x][j]);
		     						  }
		     						System.out.print(matrix3[i][j]+"\t");
		     					  }
		     					System.out.println("");
		     				    }
		     				    System.out.println("\n");
		     		    }
			                      else 
			                    	  System.out.println("It can not be solved \nThe number of columns and rows exceeds the limit \nOr The number of columns in matrix 1 is not the same as the number of rows in matrix 2 \n");
         		break;	
				case 2:
			        f=1;
			    break;
			    default:
			      System.out.println("Select a real option \n");
			     break;
			     
		   }
	}while (f==0);	
	System.out.println("Bye");
	sc.close();
    }
}

         	

