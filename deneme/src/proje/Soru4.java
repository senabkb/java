package proje;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r;
		double pi=3.14159;
		double cevre,alan;
		System.out.println("dairenizin yaricapini giriniz:");
		r=input.nextInt();
		cevre=2*pi*r;
		alan=pi*r*r;
		System.out.printf("yaricapı %d olan dairenin \n cevresi= %f \n alanı=%f ",r,cevre,alan);
		
		
		
	}

}
