package com.core.salah_prototype.namaz;

/**
 * @author Shahrukh
 * @since 16-Feb-2022
 */
public class Salah {
	
	public static void wudu() {
		System.out.println("[WUDU]");
	}
	
	public static void niyyat(Integer noOfRakat, String typeTime, String typeOfSalah){
		System.out.println("[NIYYAT] Niyyat karta hu ki " + noOfRakat + " rakat " + typeTime 
				+ " ki " + typeOfSalah + " namaz");
	}
	
	public static void ruku(){
		System.out.println("[RUKU] Subhanna Rabiyal Adheem");
	}
	
	public static void sajda(){
		System.out.println("[SAJDAH] Subhanna Rabbiyal A'laa");
	}
	
	public static void adaan(){
		System.out.println("[ADAAN]");
	}
	
	public static void attahiyat(){
		System.out.println("[Attahiyaat] At-tahiyyaatu Lillaahi wassalaawaatu");
	}
	
	public static void salam(){
		System.out.println("[TASLEEM] As-salamu alaykum");
	}
	
	public static void sana(){
		System.out.println("[SANA] Subhanakal-lahumma Wabihamdika");
	}
	
	public static void takbir(){
		System.out.println("[TAKBIR] Allahu-Akbar");
	}
	
	static public void tawajjuh(){
		System.out.println("[TAWAJJUH] A'auodu billaahi minash-shaytaanir rajeem");
	}
	
	public static void durood(){
		System.out.println("[DUROOD] Allahumma salli'ala Muhammad");
	}
	
	public static String surahs(){
		String surah;
		int randValue = (int) Math.floor((Math.random()*10) + 1);
		switch(randValue){
			case 1: surah = "Ikhlas"; break;
			case 2: surah = "Falak"; break;
			case 3: surah = "Yaseen"; break;
			case 4: surah = "Al-Kahf"; break;
			case 5: surah = "Baqarah"; break;
			case 6: surah = "Mulk"; break;
			case 7: surah = "Kausar"; break;
			case 8: surah = "Kafiroon"; break;
			case 9: surah = "Nas"; break;
			case 10: surah = "Rahman"; break;
			default: surah = "Waqiah"; break;
		}
		return "" + surah;
	}
	
	public static void rakat(boolean flagForSana){
		takbir();
		if(flagForSana == true){
			sana();
		}
		System.out.println("[Surah Al-Fatiha] Bismillaahir Rahamaanir Raheem");
		System.out.println("Surah: " + surahs());
		ruku();
		sajda();
	}
}
