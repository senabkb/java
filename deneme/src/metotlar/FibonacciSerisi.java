package metotlar;

import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		//öz yinelemeli fonksiyon kuullannarak finonacci serisi oluşturma
		Scanner s=new Scanner(System.in);
		System.out.println("fibonacci serisinin kaçıncı terimini görmek istiyorsunuz:");
		int n;
		n=s.nextInt();
		System.out.println(fib(n));
	
		

	}
	
 public static int fib(int n) {
	 if(n==1 || n==2) {
	 return 1;
	 }
	 else 
		 return fib(n-2)+fib(n-1);
 }	

}

