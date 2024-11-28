package aaryanTestPack;
import java.util.Scanner;

public class CalendarDisplay {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("enter day of week");
    String dayofweek=scanner.nextLine();
    System.out.println(dayofweek);
   
    System.out.println("how many days in the month");
    int numofdays=scanner.nextInt();
    System.out.println(numofdays);
   
    System.out.println("Sun    Mon    Tue    Weds   Thur    Fri    Sat");
    System.out.println();
   
    String Sun = "Sunday";
    String Mon = "Monday";
    String Tue = "Tuesday";
    String Wed = "Wednesday";
    String Thur = "Thursday";
    String Fri = "Friday";
    String Sat = "Saturday";
   
    int firstDay=0;
    while(numofdays<32){
    if(dayofweek.equals(Sun))
    {System.out.print("  ");
    firstDay=0;
        break;
    }
    else if(dayofweek.equals(Mon)){
    System.out.print("           ");
    firstDay=1;
        break;
    }
    else if(dayofweek.equals(Tue)){
    System.out.print("                  ");
    firstDay=2;
        break;
    }
    else if(dayofweek.equals(Wed)){
    System.out.print("                      ");
    firstDay=3;
        break;
    }
    else if(dayofweek.equals(Thur)){
    System.out.print("                           ");
    firstDay=4; 
        break;
    }
    else if(dayofweek.equals(Fri)){
    System.out.print("                                ");
    firstDay=5;
        break;
    }
    else if(dayofweek.equals(Sat)){
    System.out.print("                                    ");
    firstDay=6;
        break;
    }
    }
   
        int i; 
    for(i=1;i<=7-firstDay;i++)
    System.out.print(i+"       ");
    System.out.println();
    System.out.println();
    
    int sevendays=7;
    int j;
    while(i<numofdays) {
    	
    for(j=0;j<sevendays;j++) {
    	//System.out.print("   ");
    	System.out.print("  " +i+"   ");
    	if(i==numofdays)
    		break;
    	if (i<numofdays)
    	i = i + 1;
    }
    System.out.println();
    System.out.println();
    //i++;
    }
    
    /*for(;7>=i;i++)
    System.out.println();
    //System.out.println();
    System.out.print(" "+i+"    ");
    System.out.println();
    System.out.println();*/
    
   

  }
}