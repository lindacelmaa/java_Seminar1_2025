package service;

import java.util.Arrays;
import java.util.Random;

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
		
		// exercise 2 - factorial
		
		System.out.println("");
		System.out.println("--------  Exercise 2  ---------");
		System.out.println("");
		
		int N = 5;
		
		System.out.println("Factorial of " + N + " is (for loop): " + factorialForLoop(N));
		System.out.println("Factorial of " + N + " is (recursive): " + factorialRecursive(N));
		
		// exercise 3 - arrays
		
		System.out.println("");
		System.out.println("--------  Exercise 3  ---------");
		System.out.println("");
		
		double lower = 1.5;
		double upper = 7.25;
		int A = 5;
		
		System.out.println("Array with random values:");
		double arrayRandom[] = generateArray(N, lower, upper);
		for(int i = 0; i < N; i++) {
			System.out.print(arrayRandom[i] + ", ");
		}
		System.out.println("");
		System.out.println("Arrays mean value: " + getMean(arrayRandom));
		System.out.println("Arrays min value: " + getMin(arrayRandom));
		System.out.println("Arrays max value: " + getMax(arrayRandom));
		System.out.println("Sorted array:");
		double sortedArray[] = arraySort(arrayRandom);
		for(int i = 0; i < N; i++) {
			System.out.print(sortedArray[i] + ", ");
		}
		System.out.println("");
		
		// exercise 4 - 2D arrays
		
		System.out.println("");
		System.out.println("--------  Exercise 4  ---------");
		System.out.println("");
		
		int S = 5;
		
		System.out.println("Array with values:");
		double arrayNew[][] = generateMatrix(S);
		for(int i = 0; i < S; i++) {
			for(int j = 0; j< S; j++) {
				System.out.print(arrayNew[i][j] + ",");
			}
		}
		System.out.println("");
				
		System.out.println("Product of 2 row, 2 column: " + getProduct(arrayNew, 2, 2));
		
		// exercise 5 - probabilities
		
		System.out.println("");
		System.out.println("--------  Exercise 5  ---------");
		System.out.println("--------  Part one  ---------");
		System.out.println("");
		
		System.out.println("Heads, tails count and ratio when N= 10: ");
		double[] coinArray1 = coinFlip(10);
		for (int i = 0; i < coinArray1.length; i++) {
			System.out.print(coinArray1[i] + ", ");
		}
		System.out.println("");
		System.out.println("Heads, tails count and ratio when N= 100: ");
		double[] coinArray2 = coinFlip(100);
		for (int i = 0; i < coinArray2.length; i++) {
			System.out.print(coinArray2[i] + ", ");
		}
		System.out.println("");
		System.out.println("Heads, tails count and ratio when N= 1000: ");
		double[] coinArray3 = coinFlip(1000);
		for (int i = 0; i < coinArray3.length; i++) {
			System.out.print(coinArray3[i] + ", ");
		}
		System.out.println("");
		System.out.println("Heads, tails count and ratio when N= 10000: ");
		double[] coinArray4 = coinFlip(10000);
		for (int i = 0; i < coinArray4.length; i++) {
			System.out.print(coinArray4[i] + ", ");
		}
		System.out.println("");
		System.out.println("--------  Part two  ---------");
		System.out.println("");
		System.out.println("number of occurences for each case (1 - 6): ");
		int[] diceArray = rollDice(100);
		for (int i = 0; i < diceArray.length; i++) {
			System.out.print(diceArray[i] + ", ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("--------  Part three  ---------");
		System.out.println("");
		System.out.println("Number of tries until the desired combination becaume true: " + roll2Dices());
	
		// exercise 6 - bytes to char
		System.out.println("");
		System.out.println("--------  Exercise 6  ---------");
		System.out.println("");
		
		byte[] array = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
				32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
		
		System.out.println("Byte array to string: " + getTextFromBytes(array));
		
		// exercise 7 - Pascal's triangle
		System.out.println("");
		System.out.println("--------  Exercise 7  ---------");
		System.out.println("");
		
		int level = 6;
		System.out.println("Pascal numbers in string: " + pascalsTriangle(level));
		
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
	
	public static int factorialForLoop(int N) {
		int result = 1;
		for (int i = 1; i < N + 1; i++) {
			result = result * i;
		}
		
		return result;
	}
	
	public static int factorialRecursive(int N) {
		if (N == 0) {
			return 1;
		}
		return N * factorialRecursive(N - 1);
	}
	
	public static double[] generateArray(int N, double lower, double upper) {
		double max = upper;
		double min = lower;
		Random rand = new Random();
		double[] array = new double[N];
		
		if (lower > upper) {
			return new double[0];
		}
		
		for (int i = 0; i < N; i++) {
			array[i] = rand.nextDouble() * (upper - lower) + lower;
		}
		return array;
	}
	public static double getMean(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		double mean = sum/array.length;
		return mean;
	}
	
	public static double getMin(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	public static double getMax(double[] array) {
		double max = array[0];
		for (int i=1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	public static double[] arraySort(double[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j< array.length - i - 1; j++) {
				if(array[j] > array[j +1]) {
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	public static double[][] generateMatrix(int N){
		double[][] array = new double[N][N];
		Random rand = new Random();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = rand.nextDouble() * 100;
			}
		}
		return array;
	}
	public static double getProduct(double[][] matrix, int i, int j) {
		double product = 0;
		
		for (int n =0; n< matrix.length; n++) {
			product += matrix[i][n] * matrix[n][j];
		}
		
		return product;
	}
	
	public static double[] coinFlip(int N) {

		Random rand = new Random();
		
		int[] coins = new int[N];
		
		for (int i = 0; i < N; i++) {
			coins[i] = rand.nextInt(2);
		}
		// tail = 0; heads = 1;
		int tailCount = 0;
		int headsCount = 0;
		for (int i = 0; i < N; i++) {
			if(coins[i] == 0) {
				tailCount ++;
			}if(coins[i] == 1) {
				headsCount ++;
			}
		}
		 double ratio = 0.0;
		    if (tailCount != 0) {
		        ratio = (double) headsCount / tailCount;
		    }
		
		double[] array = {headsCount, tailCount, ratio};
		
		
		return array;
	}
	
	public static int[] rollDice(int N) {
		Random rand = new Random();
		
		int[] rolls = new int[N];
		
		for (int i=0; i <N; i++) {
			rolls[i] = rand.nextInt(6) + 1;
		}
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		for (int i = 0; i < N; i++) {
			if(rolls[i] == 1) {
				one ++;
			}else if(rolls[i] == 2) {
				two ++;
			}
			else if (rolls[i] == 3) {
				three ++;
			}else if(rolls[i] == 4) {
				four ++;
			}
			else if(rolls[i] == 5) {
				five ++;
			}else if(rolls[i] == 6) {
				six ++;
			}
		}
		int[] array = {one, two, three, four, five, six};
		
		return array;
		
	}
	
	public static int roll2Dices() {
		
		Random rand = new Random();
		
		int firstDice = 0;
		int secondDice = 0;
		
		
		int loops = 0;
		do {
			firstDice = rand.nextInt(6) + 1;
			secondDice = rand.nextInt(6) + 1;
			
			loops ++;
		} while (firstDice != secondDice);
		
		return loops;
	}
	
	public static String getTextFromBytes(byte[] array) {
		
		char[] newArray = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = (char) array[i];
		}
		
		String fromArray = Arrays.toString(array);
		
		return fromArray;
	}
	
	public static String pascalsTriangle(int level) {
		int[] row = new int[level + 1];
		
		for (int i= 0; i <= level; i++) {
			
			int factorialForN = 1;
			int factorialForR = 1;
			int factorialForNMinusR= 1;
			
			for(int j = 1; j <= level; j++) {
				factorialForN = factorialForN * j;
			}
			
			for(int j = 1; j <= i; j++) {
				factorialForR = factorialForR * j;
			}
			for(int j = 1; j <= level - i; j++) {
				factorialForNMinusR = factorialForNMinusR * j;
			}
			
			row[i] = factorialForN / (factorialForR * factorialForNMinusR);
		}
		String fromArray = Arrays.toString(row);
		return fromArray;
	}
}
