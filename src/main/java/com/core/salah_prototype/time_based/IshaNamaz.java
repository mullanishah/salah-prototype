/**
 * 
 */
package com.core.salah_prototype.time_based;

import com.core.salah_prototype.rakat_based.FourRakatNamaz;
import com.core.salah_prototype.rakat_based.ThreeRakatNamaz;
import com.core.salah_prototype.rakat_based.TwoRakatNamaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class IshaNamaz {

	/**
	 * @param 
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
		adaNamaz();
	}
	
	public static void adaNamaz() {
		TwoRakatNamaz fajr_sunnat = new TwoRakatNamaz(2, "Isha", "Sunnat");
		System.out.println("-----------------------XXXX--------------------");
		FourRakatNamaz isha = new FourRakatNamaz(4, "Isha", "Farz");
		System.out.println("-----------------------XXXX--------------------");
		ThreeRakatNamaz isha_wajib = new ThreeRakatNamaz(3, "Isha", "Wajib");
		System.out.println("-----------------------XXXX--------------------");
	}

}
