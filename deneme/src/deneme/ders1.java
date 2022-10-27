package deneme;

import java.util.Scanner;

public class ders1 {
	
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in) ;
		int limit;
		int i=1;
		int n=1;
		int sonuc;
		int sonuc2;
		System.out.println("kaça kadar olan tek sayılaı yazdırmak istediğiniiz yazınız:");
		limit=sc.nextInt();
		System.out.println("tek sayılar:");
		while(i<=limit) {
			sonuc=i%2;
			if(sonuc==1 || i==1) {
			System.out.println(i);
		    i+=2;
			}

	}
	
	System.out.println("çift sayılar:");
	
	while(n<=limit) {
		sonuc2=n%2;
		if(sonuc2==0 && n!=1) {
		System.out.println(n);
	    n+=2;
		}
		else
			n++;
}
		
		
		
		
	
	}
}
