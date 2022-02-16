package com.core.salah_prototype.time_based;

import com.core.salah_prototype.rakat_based.TwoRakatNamaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class FajrNamaz {

	/**
	 * @param 
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
		adaNamaz();
	}

	public static void adaNamaz() {
		TwoRakatNamaz fajr_sunnat = new TwoRakatNamaz(2, "Fajr", "Sunnat");
		System.out.println("-----------------------XXXX--------------------");
		TwoRakatNamaz fajr = new TwoRakatNamaz(2, "Fajr", "Farz");
		System.out.println("-----------------------XXXX--------------------");
	}

}
