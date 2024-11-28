package aaryanTestPack;

import java.util.Scanner;

public class Factorialn {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("What is your n!");  
		int n=sc1.nextInt();
		int ans=1;
		for(int i=1; i<=n;i++)
		{
			ans=ans*i;
			System.out.println(ans);
		}
			
			sc1.close();
		
	}

}
