package deneme;

import java.util.Scanner;

public class Youtubedeneme {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String user_name,password;
		boolean durum=true;
		do {
		System.out.println("Kullanıcı adınızı giriniz:");
		user_name=scan.nextLine();
		System.out.print("\nŞifrenizi yazınız:");
		password=scan.nextLine();
		
		if(user_name.equals("Sena")&& password.equals("220103")) {
			System.out.println("Sisteme giriş yaptınız");
			durum=false;
			break;
		}

		else {
			System.out.println("Hatalı giriş yaptınız..\n Kullanıcı adınız veya şifreniz hatalı...\n\n\n");
        
		
		}
		
		
		
		}while(durum==true);
			
		
	}

}
