package aula4_ExceptionsStacktraceAndThrows;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println ("Entre um n�mero decimal: ");
		try {
			double num = leNumero();
			System.out.println ("Digitado: " + num);
		} catch (Exception e) {
			System.out.println ("Informa��o inv�lida");
			e.printStackTrace();
		}

	}

	public static double leNumero () throws Exception {
		Scanner scan = new Scanner (System.in);
		double num = scan.nextDouble();
		return num;

	}

}
