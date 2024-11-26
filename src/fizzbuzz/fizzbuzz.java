package fizzbuzz;

public class fizzbuzz {

	public static String fizzbuzz(int valeur) {
		if(valeur%3==0) {
			if(valeur%5==0) {
				return "fizzbuzz";
			}else {
				return "fizz";
			}
		}
		if(valeur%5==0) {
			return "buzz";
		}
		return Integer.toString(valeur);
	}
}
