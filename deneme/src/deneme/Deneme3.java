package deneme;

import java.util.Scanner;

public class Deneme3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner input1= new Scanner(System.in);
		double a,b,c,d;
		String islem;
		System.out.println("HESAP MAKİNESİ\n\n");
		a=input.nextDouble();
		islem=input1.nextLine();
		 b=input.nextDouble();
		
				switch(islem) {
		case "+":
			double toplam;
	        
	       
		// Aappend metoduyla dene nesne oluştur nesnenin ifadelerini birleştirir. 
			// add methody toplama yapıyor
		toplam=a+b;
		System.out.println("Toplam: "+toplam);
		
		break;
		
		
		case "-":
			
			
			double a1,b1;
			double cikarma;
	        System.out.println("Çıkaracağınız sayıları yazınız :");
	        System.out.println("a =");
		a1=input.nextDouble();
		System.out.println("b =");
		b1=input.nextDouble();
		
		cikarma=a1-b1;
		System.out.println("Sonuç: "+cikarma);
			
		break;
		
		case "*":
			double carpim;
			double a2,b2;
			 System.out.println("Çarpacağınız sayıları yazınız :");
		        System.out.println("a =");
			a2=input.nextDouble();
			System.out.println("b =");
			b2=input.nextDouble();
			
			carpim=a2*b2;
			System.out.println("Çarpım: "+carpim);
		break;
		
		
		case "/":
			double bolum;
			double a3,b3;
			 System.out.println("Böleceğiniz sayıları yazınız :");
		        System.out.println("a =");
			a3=input.nextDouble();
			System.out.println("b =");
			b3=input.nextDouble();
			if(b3==0) {
				System.out.println("İşleminiz tanımsızdır b'yi tekrar yazın:");
				b3=input.nextDouble();
				bolum=a3/b3;
				System.out.println("Bölüm: "+bolum);
			break;
			}
			bolum=a3/b3;
			System.out.println("Bölüm: "+bolum);
		break;
		
		
		
		
		}
	
/*
		String islem;
		System.out.println("islem:");
		islem=input.nextLine();
		switch(islem) {
		case "+":
		System.out.println("4");
		break;
		
		case "-":
			System.out.println("0");
			break;
			
		
		}
		*/
		
		
		
		
		
	}

}
