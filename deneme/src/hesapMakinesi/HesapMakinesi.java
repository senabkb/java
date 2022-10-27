package hesapMakinesi;

import java.util.Scanner;
// q yu kapatma tuşu olarak kullan.



public class HesapMakinesi {

	public static void main(String[] args) {
		// Aappend metoduyla dene nesne oluştur nesnenin ifadelerini birleştirir. 
			// add methody toplama yapıyor
		
		
		Scanner input=new Scanner(System.in);
		Scanner input1= new Scanner(System.in);
	    double a,b,sonuc;
		String islem;
		
		System.out.println("HESAP MAKİNESİ\n\n");
		 
		 
		 do{
			 
		StringBuilder sb= new StringBuilder();
	    StringBuilder s= new StringBuilder();
	   
		
		a=input.nextDouble();
		// String karakter=String.valueOf(a);
		sb.append(a);
	    islem=input1.nextLine();
	    s.append(islem);
	    b=input.nextDouble();
		sb.append(b);
		
		
				switch(islem) {
		case "+":
		sonuc=a+b;	 
		System.out.println(sonuc);
		
		break;
		
		
		case "-":		
			 sonuc=a-b;
		     System.out.println(sonuc);
			
		break;
		
		
		case "*":
		    sonuc=a*b;
			System.out.println(sonuc);
		break;
		
		
		
		
		case "/":
		   if(b==0) {
				System.out.printf("İşleminiz tanımsızdır...\n paydaya '0' hariç bir sayi giriniz...\n ");
				b=input.nextDouble();
				sonuc=a/b;
				System.out.println(sonuc);
			break;
			}
			
			sonuc=a/b;
			System.out.println(sonuc);
		    break;
		    
		    
		case "^":
			sonuc=1;
			for(int i=1;i<=b;i++) {
				
				sonuc*=a;	
			}
			System.out.println(sonuc);
		
		
		case "|":
			// | kök alma işlemi  demek
	        //math kütüphaesi eklemelisin
			
			
			
		
		}
	

		
		
		
		 } while(String(a)!="q");
	}
		 
		public double  devam(double x,double y) {
			String krkt=String(x);
			 if("krkt"=="e") {
			
				return y;

			 }
			
			 
	}

	private static String String(double a) {
		// TODO Auto-generated method stub
		return null;
	}

}

