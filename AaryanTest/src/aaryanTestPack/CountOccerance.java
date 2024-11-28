package aaryanTestPack;
import java.util.Scanner;
import java.lang.Math;



public class CountOccerance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		      Scanner sc = new Scanner(System.in);
		     
		      System.out.println("Enter Integer(0 to stop)");
		      int firstvalue= sc.nextInt();
		     
		        
		        int secondotherval=0;
		        int prevalue = 0;
		        int equalval=0;
		        while (firstvalue > 0)
		        {
		        	System.out.println("first value Integer:" + firstvalue + "Prev Value" + prevalue);

		        	  if (firstvalue == prevalue)
		        	  
			           {
				           equalval = equalval + 1;
				           System.out.println("count Integer:" + equalval );
				        
			           }   
		        	
		        	System.out.println("Second Integer:");
		           secondotherval = sc.nextInt();
		          if (secondotherval==0) {
 
		        	   break;
		           }
		           if (firstvalue==secondotherval)
		           {
			          //1 equalval = equalval + 1;
			           prevalue = secondotherval;
			           System.out.println(" first number"+firstvalue+" Second number" +secondotherval + " count number" + equalval);
		           }
		           else {
		           
		           prevalue = secondotherval;
		           System.out.println("Previous valus " + prevalue);
		           
		           System.out.println("FirstTird Integer:");
		           firstvalue= sc.nextInt();
		          
		          
		           }
		          
		       
		           
		        }
		         System.out.println("Amount of equal values is "+equalval);
		  }
		

	}
