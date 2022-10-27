package proje;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {


		
		Scanner input=new Scanner(System.in);

		int x,y;
		System.out.println("sayiları griniz:");
	 x=input.nextInt();
		y=input.nextInt();
		islem(x,y);
		
		
		
		
		
	}

	
	static void islem(int a,int b) {
		int toplam=a+b;
		int fark=a-b;
		int carpim=a*b;
		double bolum=a/b;
		System.out.println("toplam="+toplam +"\n"+"fark="+fark+"\n"+"carpim="+carpim+"\n"+"bolum="+bolum);
		
	}
	
	}


