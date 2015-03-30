package iut.tdd;
import java.util.HashMap;

public class Convert extends Hashtabl{

	public static String num2text(String input) {
		int num =new Integer(Integer.parseInt(input));
		if(num<20 && num>16){
			num=num-10;
			return "dix-"+tabl.get(Integer.toString(num));
		}
		return tabl.get(input);
	}
	public static String text2num(String input) {
		
		return null;
	}
	public String toString(int num){
		return toString(num);
	}
}