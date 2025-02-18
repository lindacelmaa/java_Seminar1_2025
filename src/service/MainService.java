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
		
		
		String name1 = "Jānis";
		String name2 = "Ventspils Kuldīga";
		System.out.println(isCorrectFormating(name1));
		System.out.println(isCorrectFormating(name2));
		//
		
		String courseTitle = "Programmesana Timekli JAVA";
		String facultyTitle = "ITF";
		String studyProgram = "Datorzinatnes";
		String accountNo = "LV03HABA0551002144730";
		String emaill = "karina.krinkele@venta.lv";

		
		System.out.println("Kursa nosaukuma garums: " + courseTitle.length());
		System.out.println(facultyTitle.charAt(0) + " " + facultyTitle.charAt(1)
		+ " " + facultyTitle.charAt(2));
		System.out.println("Sakas ar D: " + studyProgram.startsWith("D"));
		
		System.out.println("Programma atbilst formatejumam: " 
		+ studyProgram.matches("[A-Z]{1}[a-z ]{4,30}"));
	
		System.out.println("Konta numurs atbilst formatejumam: "
				+ accountNo.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}$"));
		
		System.out.println("Epasts atbilst formatejumam: "
				+ emaill.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?"));
		
		// exercise 0 - two columns
		
		System.out.println("");
		System.out.println("--------  Exercise 0  ---------");
		System.out.println("");
		
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ", " + times[i]);
		}
		
		// exercise 1 - calculator
		
		System.out.println("");
		System.out.println("--------  Exercise 1  ---------");
		System.out.println("");
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		
		System.out.println("Pos in "+fallingTime+" sec :"+positionCalc(gravity, initialVelocity, initialPosition, fallingTime));
		
	}
	
	public static double average(int[] grades) {
	    int sum = 0;
	    for (int i = 0; i < grades.length; i++) {
	        sum += grades[i];
	    }
	    return sum / grades.length;
	}
	 //Uztaisīt funkciju, kas saņem string un atgriež varda formatejumam, pieņemot, ka var but divi vārdi
	
	public static boolean isCorrectFormating(String name) {
		if(name != null && !name.isEmpty()) {
			return (name.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?"));
		}
		return false;
		
	}
	
	public static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime){
		double position = 0;
		position = 0.5 * gravity * (fallingTime * fallingTime) + initialVelocity * fallingTime + initialPosition;
		return position;
	}
	

}
