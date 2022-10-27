package deneme;

import java.util.Scanner;

//not ortalaması hesaplayan program

public class NotoOrtalama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		int a,b;
		double ortalama;
		System.out.println("NOT: vize notunun %40'ı  final notunun %60'ı etkiler.");
		System.out.println("vize notunuzu yazınız:");
		a=input.nextInt();
		System.out.println("final notunuzu yazınız:");
		b=input.nextInt();
		ortalama=(a*0.4)+(b*0.6);
		
		System.out.println("0rtalamamız : "+ortalama);
		
		String sonuc=(ortalama >=55)?"Geçtiniz":"Kaldınız";
		
		System.out.println(sonuc);

		if(ortalama <55) {
			
			double butunleme=(55-(a*0.4))/0.6;
			System.out.println("Bütünleme sınavındn almanız gereken en düşük puan :"+butunleme);
			
		}
		
		
		
		//dairenin alanı , çevresini ve kürenin hacmi:
		
		/*
		double pi=3.14;
		int r;
		double yaricap,cevre,hacim,alan;
		
		System.out.println("yarıçap uzunluğunu yazınız :");
		r=input.nextInt();
		cevre=2*pi*r;
		alan=(r*r)*pi;
		hacim=(4/3)*pi*(r*r*r);
		System.out.println("dairenin alamı :"+ alan);
		System.out.println("daienin çevresi: "+cevre);
		System.out.println("kürenin hacmi: "+hacim);
		*/
		
		
		
	}
}
