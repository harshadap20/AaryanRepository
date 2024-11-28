package aaryanTestPack;

import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your income?");  
	    double income=sc.nextDouble();
	      
	     
	      System.out.println("What is your housing cost?");
	      double houseCost=sc.nextDouble();
	     
	      System.out.println("What is your total number of children?");
	      double totalChildren=sc.nextDouble();
	     
	      System.out.println("What is your total number of children in school?");
	      double schoolChildren=sc.nextDouble();
	     
	      double de1=schoolChildren*1000;
	      double de2=(totalChildren-schoolChildren)*500;
	      double taxpayable=0;
	      double taxd=0;
	      
	      if(houseCost>8000) 
	          taxpayable=income*0.18;
	    	  else 
	    	  taxpayable=(income-10000)*0.18;
	      	  
	      if(taxpayable>2000)
	          taxpayable*=1.15;
	      	  
	      taxd=taxpayable-de2-de1;  
	      double finaltaxd = taxd;
	//     System.out.println("The payble tax is "+taxpayable);
	//     System.out.println("The payble taxd is "+taxd);
	    	  double refund=0;
	 
	    	  if(houseCost<6000) {
	       		  if(totalChildren>2) {
	    			  if(schoolChildren>=1) {
	    				  refund=taxd*-1;
	    				  
	    				  
	    			  }
	    		  }
	    	  }
	    	  else {
	    		  taxd=0;
	    		  System.out.println("The refund is 0.00"); 
	    	  }
				  
	    	//  System.out.println("The payble refund  is "+refund);
	    	  if(taxd>0)
		    	  System.out.println("The payble tax is "+taxd);
		    	  else if (refund > 0)
		    		  System.out.println("Te refund is "+refund);
		    	  else
		    		  System.out.println("The payble tax is "+finaltaxd);
		    	 
	    
	}

}