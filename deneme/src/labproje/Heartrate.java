package labproje;

import java.util.Scanner;

public class Heartrate {

	
	String isim;
    String soyisim;
	int dogumtarih;//yıl
	public Heartrate(String isim, String soyisim, int dogumtarih) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumtarih = dogumtarih;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getDogumtarih() {
		return dogumtarih;
	}
	public void setDogumtarih(int dogumtarih) {
		this.dogumtarih = dogumtarih;
	}

	public int yas() {
		int yas=2022-getDogumtarih();
		return yas;
	}
	
	
	
	public int maxHeartRate() {
		
		int mhr=220-yas();
		return mhr;
	}

	
	
	public double targetHeartRate() {
		double thr=maxHeartRate()*0.85;
		return thr;
	}
	
	
	
	
	
	
	
	

public void show() {
		System.out.println("Adi soyadi:"+getIsim()+" "+getSoyisim()+"\n"+"Yasi:"+yas()+"    "+"MHR:"+maxHeartRate()+"    "+"THR:"+targetHeartRate());
		
		
}	}