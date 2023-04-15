package basicos;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int respuesta=0, intentos=0;
		
		System.out.print("\n\t Estoy pensando en un número del 1 al 100.");
		System.out.print("\n\t ¡Adivina cual es!");
		
		int numAleatorio=(int)(Math.random()*100)+1; 
		// Mínimo: 0.0000*100=0.0 -> 0 = 0+1 = 1 y Máximo: 0.99999*100=99.99 -> 99 = 99 + 1 = 100

		while(true) { // Este ciclo whie aparentemente va a ser infito.
			
			System.out.print("\n\t Dame tu respuesta: ");
			respuesta = entrada.nextInt(); entrada.nextLine();
			intentos++;
			
			if(respuesta==numAleatorio) {
				System.out.print("\n\t Felicidades, lograste adivinar el número.");
				System.out.printf("\n\t Lograste adivinar en %d intentos.",intentos);
				break; // Termina el ciclo while.
			}
			
			// Suponemos: 79
			// Respuesta: 50 -> pista: El número a adivinar es mayor.
			
			if(respuesta<numAleatorio) 
				System.out.print("\n\t Pista: el número a adivinar es mayor...");
			
			if(respuesta>numAleatorio) 
				System.out.print("\n\t Pista: el número a adivinar es menor...");
			
		}
		
		System.out.println("\n\t Fin del juego, gracias por jugar. :D");
		
		
		entrada.close();
		
	}

}
