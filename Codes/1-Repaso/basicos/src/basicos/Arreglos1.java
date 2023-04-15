package basicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos1 {

	public static void main(String[] args) {
		
        // Scanner entrada = new Scanner(System.in);
		
		// int edad1, edad2, edad3, edad4, edad5, edad6, edad7;
		int[] edades = new int[7];
		
		// Nota: todos los ciclo (for,while) deben cumplir con 3 elementos.
		// 1. Variable de control, 2. Condición y 3. Incremento o decremento.
		
		// Llenando un arreglo:
		for(int i=0;i<edades.length;i++) {
			//System.out.printf("\t Edad #%d: ",i+1);
			edades[i]= Integer.parseInt(JOptionPane.showInputDialog("Escribe una edad: "));
			//edades[i] = entrada.nextInt();
			//entrada.nextLine();
		}
		
		// Imprimiendo el arreglo:
		System.out.print("\n\t Edades guardadas: ");
		for(int i=0;i<edades.length;i++) {
			System.out.printf("\t %d",edades[i]);
		}
		
		// Algoritmo que encuentra el rango de los datos.
		int edad_menor=edades[0], edad_mayor=edades[0]; // La edad menor y la edad mayor van a ser la primera edad.
		
		for(int i=0;i<edades.length;i++) {
			
			if(edad_menor>edades[i]) {
				edad_menor=edades[i];
			}
			
			if(edad_mayor<edades[i]) {
				edad_mayor=edades[i];
			}
			
		}
		
		System.out.printf("\n\t La edad menor es: %d",edad_menor);
		System.out.printf("\n\t La edad mayor es: %d",edad_mayor);
		
		// entrada.close();
		
	}

}
