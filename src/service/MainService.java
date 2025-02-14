package service;

import java.util.Arrays;

/**
 * @author localuser
 * @version
 * Main service class for JAVA basics
 */

public class MainService {
	
	private static String name;
	private static int age;
	private static float height;
	private static boolean hasExperienceInJAVA;
	private static char sex;

	public static void main(String[] args) {
		// vienas rindas komentaars
		/*
		 vairaku rindu komentars
		 */
		
		
		System.out.println("Sveiciens JAVA pasaulē!");
		
		name = "Linda";
		age = 26;
		height = 1.69f;
		hasExperienceInJAVA = true;
		sex = 'F'; // var arii sex = 70; jo pec ascii
		
		String surname = "Celma"; // surname = new String("Celma")
		
		
		System.out.println("Mani sauc " + name + " " + surname + ", man ir " + age + " gadi. Esmu " + height + " gara. Pieredze JAVA: " + hasExperienceInJAVA + ". Dzimums: " + sex);
		
		
		// masivu piemeri
		
		int [] grades = {3, 5, 8, 1, 7, 10}; // ja veidosanas bridii ir zinamas šūnu vērtības
		
		System.out.println(grades[3]);
		
		System.out.println(grades);
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("yo");
		
		System.out.println(Arrays.toString(grades));
		
		//foreach cikls
		
		for (int temp :grades) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		
		// string piemēri
		
		String name = "Cat";
		String phrase = "Hello world!";
		String word = "Ventspils";
		String number = "LV2022UNLA88373737373898";
		String email = "lindacelma@gmail.com";
		
		System.out.println("String: " + name + ". Length of variable: " + name.length());
		System.out.println("String: " + phrase + ". The second letter: " + phrase.charAt(1));
		System.out.println("String: " + word + ". Starts with 'V': " + word.startsWith("V"));
		System.out.println("String: " + word + ". Vārds atbilst formatējumam: " + word.matches("[A-Z][a-z]{4,38}"));
		System.out.println("String" + number + " Regex: " + number.matches("[A-Z]{2}[1-9]{4}[A-Z]{4}"));
		System.out.println("String" + email + " Regex: " + email.matches("[a-z]{10}[@]{1}[a-z]{5}[.]{1}[a-z]{3}"));
		
		double PI = 3545.4736354636;
		float PIf = (float)PI;
		long PIl = (long)PI;
		byte PIb = (byte)PI;
		
		System.out.println("Double: " + PI + ", Float: " + PIf + ", Byte: " + PIb + ", Long: " + PIl);
		
		String price = "2.34";
		float pricef = Float.parseFloat(price);
		System.out.println("Cena ir: " + pricef + " eiro");
		
		int agei = Integer.parseInt("18");
		System.out.println("Man ir " +  agei + " gadi");
		
		System.out.println("Masīva videjā vērtība: " + average(grades));
		
		//parbaude
		int sum = 3 + 5+ 8 + 1+ 7+ 10;
		double average = sum / 6;
		System.out.println("Pārbaude manuāli: " + average);
		//
	}
	
	public static double average(int[] grades) {
	    int sum = 0;
	    for (int i = 0; i < grades.length; i++) {
	        sum += grades[i];
	    }
	    return sum / grades.length;
	}


}
