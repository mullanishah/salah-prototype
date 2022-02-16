package com.core.salah_prototype.rakat_based;

import com.core.salah_prototype.namaz.Salah;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class ThreeRakatNamaz extends TwoRakatNamaz{
	
	public static boolean flagForSana = false;
	
	public ThreeRakatNamaz(int noOfRakat, String typeTime, String typeOfSalah) {
		super(noOfRakat, typeTime, typeOfSalah);
		System.out.println("----------------------------------");
		thirdRakat();
	}

	public void secondRakat(){
		flagForSana = false;
		Salah.rakat(flagForSana);
		Salah.attahiyat();
		//Salah.durood();
	}
	
	public void thirdRakat(){
		flagForSana = false;
		Salah.rakat(flagForSana);
		Salah.attahiyat();
		Salah.durood();
		Salah.salam();
	}
}
