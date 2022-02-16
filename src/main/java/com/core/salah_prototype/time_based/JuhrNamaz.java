package com.core.salah_prototype.time_based;

import com.core.salah_prototype.rakat_based.FourRakatNamaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class JuhrNamaz {

	/**
	 * @param 
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
		adaNamaz();
	}

	public static void adaNamaz() {
		FourRakatNamaz juhr_sunnat = new FourRakatNamaz(4, "Juhr", "Sunnat");
		System.out.println("-----------------------XXXX--------------------");
		FourRakatNamaz juhr = new FourRakatNamaz(4, "Juhr", "Farz");
		System.out.println("-----------------------XXXX--------------------");
	}

}
