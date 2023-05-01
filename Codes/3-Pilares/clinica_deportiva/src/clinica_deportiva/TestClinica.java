package clinica_deportiva;

import java.util.ArrayList;

public class TestClinica {

	public static void main(String[] args) {
	
		// Creamos instancias de la clase Doctor:
		Doctor doctor1 = new Doctor("Eduardo","5501928374",ESPECIALIDAD.CARDIOLOGÍA);
		Doctor doctor2 = new Doctor("Laura","5612345678",ESPECIALIDAD.NEUROLOGÍA);
		
		// Creando instancias de la clase Deportista:
		Deportista deportista1 = new Deportista("Marcos","5599886677","Atletísmo");
		Deportista deportista2 = new Deportista("Samantha","5671625344","Natación");
		
		// El método mostrar es polimorfico 
		// Nota: se comporta diferente de acuerdo al objeto al que lo apliquemos.
		// doctor1.mostrar();
		// deportista1.mostrar();
		
		// Creamos una lista (ArrayList) de usuarios:
		// Nota: los nombres de las listas van en plural
		ArrayList<Usuario> usuarios = new ArrayList<>();
		// Nota: Un ArrayListo sólo puede recibir Objetos
		// es decir lo que va entre los corchetes <> deber ir con 
		// mayúscula inicial.
		
		// int numero=30; // Variable de tipo de dato primitivo
		// Integer numero2 = 50; // Variable de tipo de dato Wrapper
		
		// EL método add nos sirve para agregar elementos a una lista:
		usuarios.add(doctor1);
		usuarios.add(doctor2);
		usuarios.add(deportista1);
		usuarios.add(deportista2);

		// Mostramos elemento por elemento de la lista.
		for(Usuario usuario : usuarios) {
			usuario.mostrar();
		}
		
	}

}
