package intro_poo;

public class Planeta {

	// Atributos:

	private String nombre;
	private int posicion;
	private String color;
	
	// Constructor:
	
	public Planeta(String nombre, int posicion, String color) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.color = color;
	}

	
	// Getters y Setters:
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Mostrar planeta
	
	public void showPlaneta() {
		System.out.print("\n\t Nombre: "+this.getNombre());
		System.out.print("\n\t Posición: "+this.getPosicion());
		System.out.print("\n\t Color: "+this.getColor());
	}
	
}
