package clinica_deportiva;

public class Deportista extends Usuario {

	// Atributos:
	private String disciplina; // Deporte al que se dedica.

	// Constructor:
	public Deportista(String nombre, String telefono, String disciplina) {
		super(nombre, telefono); // Hace referencia a la clase Usuario.
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void mostrar() { // EL método mostrar es polimorfico.
		System.out.print("\n\t +-------- DEPORTISTA -------+");
		System.out.print("\n\t | Nombre: "+this.getNombre());
		System.out.print("\n\t | Teléfono: "+this.getTelefono());
		System.out.print("\n\t | Deporte: "+this.getDisciplina());
		System.out.print("\n\t +---------------------------+");
	}	
	
}
