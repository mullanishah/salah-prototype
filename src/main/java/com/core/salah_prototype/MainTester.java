package com.core.salah_prototype;

import com.core.salah_prototype.time_based.AsarNamaz;
import com.core.salah_prototype.time_based.FajrNamaz;
import com.core.salah_prototype.time_based.IshaNamaz;
import com.core.salah_prototype.time_based.JuhrNamaz;
import com.core.salah_prototype.time_based.MagribNamaz;

public class MainTester{

	public static void main( String[] args ) {
		allInDay();
	}

	private static void allInDay() {
		FajrNamaz.adaNamaz();

		JuhrNamaz.adaNamaz();

		AsarNamaz.adaNamaz();

		MagribNamaz.adaNamaz();

		IshaNamaz.adaNamaz();
	}
}
