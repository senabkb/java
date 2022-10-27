package labproje;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);
		
   int dogumtarihi;
   String isim,soyisim;
   
    System.out.println("adınızı yazınız:");
	isim=input.nextLine();
	System.out.println("soyadınızı yazınız:");
	soyisim=input.nextLine();
	System.out.println("dogum tarihinizi yazınız:");
	dogumtarihi=input1.nextInt();
		
	Heartrate p1=new Heartrate(isim,soyisim,dogumtarihi);
	
	p1.show();
	
	
	
	
	
		
	}

}
