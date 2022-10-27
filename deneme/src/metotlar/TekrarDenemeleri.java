package metotlar;

import java.util.Scanner;

public class TekrarDenemeleri {
	public static void main(String[] args) {
		//polindrol olup olmadığını buldurma
		Scanner s=new Scanner(System.in);
		int sayi;
		System.out.println("sayiniz:");
		sayi=s.nextInt();
		System.out.println(isPolindrom(sayi));
		
	}
public static boolean isPolindrom(int sayi) {
	int temp,ters=0,kalan;
	temp=sayi;
	while(temp!=0) {
		kalan=temp%10;
		ters=ters*10+kalan;
		temp/=10;
			}
	if(ters==sayi) {
		return true;
	}
	else
		return false;
}


}
