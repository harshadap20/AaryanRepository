package aaryanTestPack;
import java.util.Scanner;

public class Triandisplay {

public static void main(String[] args) {
	String dayweek;
		Scanner scr =new Scanner(System.in);
		Scanner scrStr =new Scanner(System.in);
System.out.println("days n a mont");
		int numofdays=scr.nextInt();
		
		System.out.println("day of te mont");
		dayweek = scrStr.nextLine();
		System.out.println("Day is "+dayweek);
		System.out.println("Sun   Mon   Tue   Wed   Thur   Fri   Sat");
		switch (dayweek) {
		case "wed": {
			System.out.print("         	");
			for(int k=1;k<=4;k++) {
			System.out.print("     "+k);
			}
			System.out.println();
			int j=1;
			for(int i=5; i<=numofdays;i++)
			{
				System.out.print(i+ "    ");
				
				
				if(j%7==0)
					System.out.println();
				j++;
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dayweek);
		}
		/*for(int i=1; i<=30;i++)
		{
			if(i<=10)
			{
				System.out.print(i+ "    ");
			}
			else {
				System.out.print(i+ "   ");}
				if (i%7==0)
					System.out.println();
					
		}
		System.out.println();
		
		scr.close();*/
	}

}
