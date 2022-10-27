package proje;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int r,temp;
		int n;
		System.out.println("sayiyi giriniz:");
		n=input.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			System.out.print(r);
		
			n=n/10;
			
			
		}
		
		
		
		
		
		
	}

}
