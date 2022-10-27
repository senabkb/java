package dersproje;

import java.util.Scanner;

public class Yasort {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);

		int sayi,ortalama,toplam=0;
		int n=0;
		int i;
		System.out.println("kaç kişinin not ortalamasını  ulmak istiyordunuz: ");
		sayi=input.nextInt();
		while(n<=sayi+1) {
			n++;
			System.out.println("Notunuzu yaziniz:");
			i=input.nextInt();
			toplam+=i;
			if(n==sayi) {
				ortalama=toplam/n;
				System.out.println("ortalama:"+ortalama);
				break;
			}
			
			
			
			
		}
		
		

	}

}
