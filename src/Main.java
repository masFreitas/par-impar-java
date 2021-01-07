import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Informe um número inteiro:");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.printf("%d é par", x);
		}
		else {
			System.out.printf("%d é impar", x);
		}
		sc.close();
	}
}
