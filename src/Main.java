import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Informe um n�mero inteiro:");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.printf("%d � par", x);
		}
		else {
			System.out.printf("%d � impar", x);
		}
		sc.close();
	}
}
