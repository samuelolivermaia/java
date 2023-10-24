package appliction;

public class Program12 {

	public static void mai(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}
		
		System.out.println("---------------------");
		for (String obj : vect) {
			System.out.println(obj);

		}

	}

}
