package dersproje;

import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		//vize%20 proj%30 lab%10 final%40 not iste ort hesapla ba vs gibi yazcır
		Scanner input=new Scanner(System.in);
		double vize,finalnot,lab,proje,ortalama;
		int sonuc;
		System.out.println("vize notunuzu giriniz:");
		vize=input.nextDouble();
		System.out.println("final notunuzu giriniz:");
		finalnot=input.nextDouble();
		System.out.println("laboratuar notunuzu giriniz:");
		lab=input.nextDouble();
		System.out.println("proje notunuzu giriniz:");
		proje=input.nextDouble();
		
		ortalama=(vize*0.2)+(proje*0.3)+(finalnot*0.4)+(lab*0.1);

	if(ortalama<100 && ortalama>=90) {
		sonuc=1;
	}
	else if(ortalama>=85&&ortalama<90){
		sonuc=2;
	}	
	else if(ortalama>=80&&ortalama<85){
		sonuc=3;
	}	
	else if(ortalama>=75&&ortalama<80){
		sonuc=4;
	}	
	else if(ortalama>=65&&ortalama<75){
		sonuc=5;
	}	
	else if(ortalama>=60&&ortalama<65){
		sonuc=6;
	}	
	else if(ortalama>=55&&ortalama<60){
		sonuc=7;
	}	
	else if(ortalama>=50&&ortalama<55){
		sonuc=8;
	}		
	
	else
		sonuc=9;
	
	
		switch(sonuc) {
		
		case 1:
			 
				System.out.println("ortalamanız: "+ortalama);
				System.out.println("başarı notu : AA"+" "+"4.00"+" "+"başarılı");
				
			break;
		
		case 2:
			
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : BA"+" "+"3.75"+" "+"başarılı");
			
			break;
		
		
		case 3:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : BB"+" "+"3.50"+" "+"başarılı");
			
			break;
		
		case 4:
			
		System.out.println("ortalamanız: "+ortalama);
		System.out.println("başarı notu : CB"+" "+"3.25"+" "+"başarılı");
		
			break;
		
		
		
		case 5:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : CC"+" "+"3.00"+" "+"başarılı");
			
		break;
		
		
		
		case 6:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : DC"+" "+"2.25"+" "+"başarılı");
			
		break;
		
		
		
		case 7:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : DD"+" "+"2.00"+" "+"başarılı");
			
		break;
		
		case 8:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : FD"+" "+"1.00"+" "+"başarısız");
			
		break;
		
		
		case 9:
			System.out.println("ortalamanız: "+ortalama);
			System.out.println("başarı notu : FF"+" "+"0.00"+" "+"başarısız");
			
		break;
		
		
		}
		
		
		
	}

}
