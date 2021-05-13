import java.util.Scanner;
public class allo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		while (bool) {
			System.out.println("Bienvenue dans le convertisseur de degre");
			System.out.println("Que desires-tu convertir ? 1 ou 2");
			System.out.println("1. Farheneit a Celcius");
			System.out.println("2. Celcius a Farhenheit");
			System.out.print("Appuyez sur 1 ou 2 : ");
			int switchcf = input.nextInt();
			switch (switchcf) {
				case 1:
					System.out.println("\n\nFarheneit a Celcius");
					System.out.println("Saisie le degre en °F");
					double ftoc = input.nextDouble();
					double ftoc2 = (ftoc - 32) * 5 / 9;
					System.out.println(ftoc + "°F est egal a " + ftoc2 + "°C");
					bool = false;
					break;
				case 2:
					System.out.println("\n\nCelcius a Farhenheit");
					System.out.println("Saisie le degre en °C");
					double ctof = input.nextDouble();
					double ctof2 = (ctof * 9 / 5) + 32;
					System.out.println(ctof + "°C est egal a " + ctof2 + "°F");
					bool = false;
					break;
				default:
					System.out.println("erreur \n\n");
			}
		}
		input.close();
	}
}