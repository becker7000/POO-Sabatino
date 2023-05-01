package clinica_deportiva;

// Las clases abstractas no se instancian.
// sólo se usan para poder crear otras clases (subclases).
public abstract class Usuario {

	// Atributos:
	
	protected String nombre;
	protected String telefono;
	
	// Constructor:

	public Usuario(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	// Getters:
		
	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}
	
	// Setters:

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// Método abstracto:
	// Son métodos que se implentan en las subclases.
	// Su implementación será obligatoria.
	public abstract void mostrar();
	
	
}
