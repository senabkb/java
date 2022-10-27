package proje;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double kilo;
		double boy;
		double bmı;
		System.out.println("kilonuzu ve boyunuzu yazınız(kilogram ve metre şeklinde)");
		kilo=input.nextDouble();
		boy=input.nextDouble();
		bmı=kilo/(boy*boy);
		if(bmı<=18.5) {
			System.out.println("zayıf");
		}
		if(bmı>18.5 && bmı<=24.9) {
			System.out.println("normal");
		}
		
		if(bmı>24.9 && bmı<=29.9) {
			System.out.println("şişman");
		}
		if(bmı>=30) {
			System.out.println("obez");
		}
		
		
	}

}
