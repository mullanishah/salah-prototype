package com.core.salah_prototype.time_based;

import com.core.salah_prototype.rakat_based.ThreeRakatNamaz;
import com.core.salah_prototype.rakat_based.TwoRakatNamaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class MagribNamaz {

	/**
	 * @param 
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
		adaNamaz();
	}
	
	public static void adaNamaz() {
		TwoRakatNamaz magrib_sunnat = new TwoRakatNamaz(2, "Fajr", "Sunnat");
		System.out.println("-----------------------XXXX--------------------");
		ThreeRakatNamaz magrib = new ThreeRakatNamaz(3, "Magrib", "Farz");
		System.out.println("-----------------------XXXX--------------------");
	}

}
