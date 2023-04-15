package basicos;

import java.util.Scanner;

public class CalculadoraGrados {

	public static void main(String[] args) {
		
		// Entradas:
		Scanner entrada = new Scanner(System.in);
		double gradosF, gradosC;
		
		System.out.print("\n\t Escribe los °F: ");
		gradosF=entrada.nextDouble(); // Guarda el primer double que encuentra.
		entrada.nextLine(); // Cerrar la línea.
		
		// Cálculos o control (if,switch,for,while,do-while):
		gradosC=(gradosF-32)*1.8;
		
		// Salidas:
		// System.out.println("\n\t "+gradosF+" °F son equivales a "+gradosC+" °C.");
		System.out.printf("\n\t %.2f °F son equivales a %.2f °C.",gradosF,gradosC);
		
		entrada.close(); // Cierra el Scanner entrada
		
	}
	
}
