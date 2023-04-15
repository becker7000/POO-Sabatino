package basicos;

public class CodigosFormato {

	public static void main(String[] args) {
		
		int entero = 45;
		char letra = 'R';
		float flotante = 1.16f; // Le agregamos una f porque por naturaleza es un double.
		String mensaje = "Hola a todos desde Java";
		boolean estaActivado = true; 
		
		// %d y %i para enteros.
		System.out.printf("\n\t Entero: %d",entero);
		
		// %c para caracteres.
		System.out.printf("\n\t Letra: %c ",letra);
		
		// %f o %lf
		System.out.printf("\n\t Flotante: %.2f ",flotante);
		
		// %s es el código de formato para las cadena.
		System.out.printf("\n\t Mensaje: %s",mensaje);
		
		// %b es para booleanos.
		System.out.printf("\n\t Está activado? R: %b",estaActivado);
		
	}

}
