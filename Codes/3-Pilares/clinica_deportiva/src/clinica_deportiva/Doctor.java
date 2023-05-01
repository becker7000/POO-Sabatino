package clinica_deportiva;

public class Doctor extends Usuario {

	// Atributos:
	private ESPECIALIDAD especialidad;
	
	// Constructor:
	public Doctor(String nombre, String telefono, ESPECIALIDAD especialidad) {
		super(nombre, telefono); // Hace referencia a la superclase 'Usuario'
		this.especialidad = especialidad;
	}
	
	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(ESPECIALIDAD especialidad) {
		this.especialidad = especialidad;
	}

	@Override // Anotación que describe 'sobreescritura'.
	public void mostrar() {
		System.out.print("\n\t +-------- MÉDICO -----------+");
		System.out.print("\n\t | Nombre: "+this.getNombre());
		System.out.print("\n\t | Teléfono: "+this.getTelefono());
		System.out.print("\n\t | Especialidad: "+this.getEspecialidad().toString().toLowerCase());
		System.out.print("\n\t +---------------------------+");
	}

}
