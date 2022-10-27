package ders;

import java.util.Scanner;

public class Account {

	public Account(String adi, String soyadi, int yasi) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String adi;
		String soyadi;
		int yasi;
		System.out.println("adinizi ggiriniz:");
		Scanner input=new Scanner(System.in);
		adi=input.nextLine();
		System.out.println("soyadinizi ggiriniz:");
		soyadi=input.nextLine();
		System.out.println("yaşınızı ggiriniz:");
		yasi=input.nextInt();
		Account person=new Account(adi,soyadi,yasi);
		System.out.println("Hoşgeldiniz:"+ person.getName()+" "+person.getSurname());
		System.out.println("Yaşınız:"+person.);
		Account person=new.Account("Mehmet","Yılmaz","35");//aynı sınıftan ikinci bir nesne oluştruldu

		
		
		
		
		
		
		
		
		
	}

}
