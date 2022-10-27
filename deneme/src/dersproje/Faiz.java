package dersproje;

public class Faiz {

	public static void main(String[] args) {
		
		double r=0.05,a,p=1000,n=10;
		//a= n.yılın son depozito tutar, n yıl,r yıllık faiz oranı, anapara
		
		double temp=(double) (1+r);
		
		a=p*(Math.pow(temp, n));
		System.out.println(a);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
