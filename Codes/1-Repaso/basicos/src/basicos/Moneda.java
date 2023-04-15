package basicos;

public class Moneda {

	public static void main(String[] args) {
		
		int moneda; // 0 o 1
		
		// Math.random() nos devuelve un número double.
		// Entre 0.00000 y 0.999999.
		moneda = (int)(Math.random()*2); // Mínimo: 0.00000, Máximo: 1.988888
		// Ejemplo: si moneda=1.56, entonces al convertirlo a entero será 1.
		
		// System.out.printf("\n\t (Prueba) Moneda: %d",moneda);
		
		if(moneda==0) {
			System.out.println("\n\t "+MonedaTexto.SOOOOOOL);
		}else {
			System.out.println("\n\t "+MonedaTexto.ÁGUILAAAA);
		}
		
	}

}
