package proje;

import java.util.Scanner;

public class İkinci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int birler_bas,onlar_bas,yuzler_bas,binler_bas,yuzbinler_bas;
		
		int sayi;
		System.out.println("basamaklarına ayırmak istediğiniz 5 basamaklı sayıyı giriniz:");
		sayi=input.nextInt();
		basamak(sayi);
		
		
		
		
	}

	public static void basamak(int sayi){
		int birler_bas,onlar_bas,yuzler_bas,binler_bas,onbinler_bas;
		birler_bas=sayi%10;
		onlar_bas=((sayi%100)-birler_bas)/10;
		yuzler_bas=((sayi%1000)-(onlar_bas+birler_bas))/100;
		binler_bas=((sayi%10000)-(yuzler_bas+onlar_bas+birler_bas))/1000;
		onbinler_bas=(sayi/10000);
		
		System.out.println("sayi="+sayi +"\n" +birler_bas +"\n"+onlar_bas 
				+ "\n" +yuzler_bas +"\n"
				+binler_bas +"\n"+ onbinler_bas);
	
	
	
	
	}
	
	
	
	
	
}
