package iut.tdd;

import java.util.HashMap;

public abstract class Hashtabl {
	public static HashMap<String, String> tabl = new HashMap<String, String>();
	static {
		tabl.put("", "");
		tabl.put("0", "zéro");
		tabl.put("1", "un");
		tabl.put("2", "deux");
		tabl.put("3", "trois");
		tabl.put("4", "quatre");
		tabl.put("5", "cinq");
		tabl.put("6", "six");
		tabl.put("7", "sept");
		tabl.put("8", "huit");
		tabl.put("9", "neuf");
		tabl.put("10", "dix");
		tabl.put("11", "onze");
		tabl.put("12", "douze");
		tabl.put("13", "treize");
		tabl.put("14", "quatorze");
		tabl.put("15", "quinze");
		tabl.put("16", "seize");
		tabl.put("20", "vingt");
		tabl.put("30", "trente");
		tabl.put("40", "quarante");
		tabl.put("50", "cinquante");
		tabl.put("60", "soixante");
		tabl.put("70", "soixante-dix");
		tabl.put("80", "quatre-vingt");
		tabl.put("90", "quatre-vingt-dix");
		tabl.put("21", "vingt-et-un");
		tabl.put("31", "trente-et-un");
		tabl.put("41", "quarante-et-un");
		tabl.put("51", "cinquante-et-un");
		tabl.put("61", "soixante-et-un");
		tabl.put("71", "soixante-et-onze");
		tabl.put("81", "quatre-vingt un");
		tabl.put("91", "quatre-vingt-onze");
		tabl.put("100", "cent");
		tabl.put("1000", "mille");
	}
}
