package com.core.salah_prototype;

import com.core.salah_prototype.eid.Eid_ul_Fitr;
import com.core.salah_prototype.time_based.AsarNamaz;
import com.core.salah_prototype.time_based.FajrNamaz;
import com.core.salah_prototype.time_based.IshaNamaz;
import com.core.salah_prototype.time_based.JuhrNamaz;
import com.core.salah_prototype.time_based.MagribNamaz;

public class MainTester{

	public static void main( String[] args ) {
		
		singleDaySimulation();
		
		//adaEidulFitrNamaz();
	}

	private static void singleDaySimulation() {
		FajrNamaz.adaNamaz();

		JuhrNamaz.adaNamaz();

		AsarNamaz.adaNamaz();

		MagribNamaz.adaNamaz();

		IshaNamaz.adaNamaz();
	}
	
	private static void adaEidulFitrNamaz() {
		
		new Eid_ul_Fitr(2, "Eid-ul-Fitr", "Wajib", true);
	}
}
