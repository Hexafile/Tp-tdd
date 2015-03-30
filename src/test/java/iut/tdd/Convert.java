package iut.tdd;

import java.util.HashMap;

import junit.framework.Assert;

public class Convert extends Hashtabl {

	public static String num2text(String input) {
		int num = new Integer(Integer.parseInt(input));
		if (tabl.containsKey(input)) {
			return tabl.get(input);
		} else if (num < 100) {
			return tabl.get(getDizaine(num)) + " " + tabl.get(getUnite(num));
		}
		return getCentaine(num) + " " + tabl.get(getDizaine(num))
				+ " " + tabl.get(getUnite(num));
	}

	public static String text2num(String input) {

		return null;
	}

	public String toString(int num) {
		return toString(num);
	}

	public static String getCentaine(int chiffre) {
		int centaine =chiffre / 100;
		if(centaine == 1){
			return "cent";
		}
		return tabl.get(Integer.toString(centaine))+" cent";
	}

	public static String getDizaine(int chiffre) {
		if(chiffre>=100){
			chiffre=chiffre-chiffre/100*100;
		}
		int dizaine = chiffre / 10;
		if (dizaine == 7 || dizaine == 9) {
			dizaine = dizaine - 1;
		}
		if (dizaine == 0){
			return "";
		}
		return Integer.toString(dizaine * 10);
	}

	public static String getUnite(int chiffre) {
		int unite;
		int dizaine = chiffre / 10;
		if (dizaine == 7 || dizaine == 9) {
			unite = (chiffre - dizaine * 10) + 10;
		} else {
			unite = chiffre - dizaine * 10;
		}
		return Integer.toString(unite);
	}
}