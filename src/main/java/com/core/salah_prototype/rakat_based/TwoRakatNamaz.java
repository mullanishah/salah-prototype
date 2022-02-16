package com.core.salah_prototype.rakat_based;

import com.core.salah_prototype.namaz.Salah;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class TwoRakatNamaz {
	
public static boolean flagForSana = false;
	
	public TwoRakatNamaz() { 
		
	}
	public TwoRakatNamaz(int noOfRakat, String typeTime, String typeOfSalah) {
		Salah.wudu();
		Salah.adaan();
		System.out.println("----------------------------------");
		Salah.niyyat(noOfRakat, typeTime, typeOfSalah);
		System.out.println("----------------------------------");
		firstRakat();
		System.out.println("----------------------------------");
		secondRakat();
	}

	public void firstRakat(){
		flagForSana = true;
		Salah.rakat(flagForSana);
	}
	
	public void secondRakat(){
		flagForSana = false;
		Salah.rakat(flagForSana);
		Salah.attahiyat();
		Salah.durood();
		Salah.salam();
	}
}
