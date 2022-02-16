package com.core.salah_prototype.time_based;

import com.core.salah_prototype.rakat_based.FourRakatNamaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class AsarNamaz {

	public static void main(String[] args) {
		adaNamaz();
	}

	public static void adaNamaz() {
		FourRakatNamaz asar_sunnat = new FourRakatNamaz(4, "Asar", "Sunnat");
		System.out.println("-----------------------XXXX--------------------");
		FourRakatNamaz asar = new FourRakatNamaz(4, "Asar", "Farz");
		System.out.println("-----------------------XXXX--------------------");
	}
}
