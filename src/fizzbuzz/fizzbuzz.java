package fizzbuzz;

public class fizzbuzz {

	public static String fizzbuzz(int valeur) {
		if(valeur%3==0) {
			return "fizz";
		}
		return Integer.toString(valeur);
	}
}
