package com.core.salah_prototype.eid;

import com.core.salah_prototype.namaz.Salah;

/**
 * @author Shahrukh
 * @since 10-May-2022
 */
public class Eid_ul_Fitr {
	
	public static boolean flagForSana = false;
	
	public static void main(String[] args) {
		
		new Eid_ul_Fitr(2, "Eid-ul-Fitr", "Wajib", true);
	}
	
	public Eid_ul_Fitr(int noOfRakat, String typeTime, String typeOfSalah, boolean takbeerFlag) {
		Salah.wudu();
		Salah.adaan();
		System.out.println("----------------------------------");
		
		Salah.niyyat(noOfRakat, typeTime, typeOfSalah);
		isTakbeer(true);
		System.out.println("----------------------------------");
		
		firstRakat();
		System.out.println("----------------------------------");
		
		secondRakat();
		System.out.println("----------------------------------");
	}
	
	private void firstRakat() {
		flagForSana = true;
		
		Salah.takbir();
		if(flagForSana == true){
			Salah.sana();
		}
		adaExtraTakbeer();
		System.out.println("[Surah Al-Fatiha] Bismillaahir Rahamaanir Raheem");
		System.out.println("Surah: " + Salah.surahs());
		
		Salah.ruku();
		Salah.sajda();
	}
	
	public void secondRakat(){
		flagForSana = false;
		
		if(flagForSana == true){
			Salah.sana();
		}
		System.out.println("[Surah Al-Fatiha] Bismillaahir Rahamaanir Raheem");
		System.out.println("Surah: " + Salah.surahs());
		adaExtraTakbeer();
		
		Salah.ruku();
		Salah.sajda();
		
		Salah.attahiyat();
		Salah.durood();
		Salah.salam();
	}

	private static void isTakbeer(boolean takbeerFlag) {
		
		if(takbeerFlag) {
			System.out.println(", Zahid 6 Takbiro k sath , wastle Allah k, muh mera Kaaba Shareef ki taraf, Iss Imam ke peeche");
		}
	}
	
	private static void adaExtraTakbeer() {
		
		for(int i = 1; i <= 3; i++)
			System.out.print("[TAKBIR- " + i + "] Allahu-Akbar");
		System.out.println("");
	}
}
