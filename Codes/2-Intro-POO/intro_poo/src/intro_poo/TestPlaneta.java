package intro_poo;

import java.util.Scanner;

public class TestPlaneta {

	public static void main(String[] args) {
		
		// Creando instancias (objetos) de la clase Planeta:
		Planeta planeta1 = new Planeta("Mercurius",1,"Arena");
		Planeta planeta2 = new Planeta("Venus",2,"Anaranjado");
		Planeta planeta3 = new Planeta("Tierra",3,"Azul");
		Planeta planeta4 = new Planeta("Marte",4,"Rojo");
		
		// Modificando el nombre de un planeta:
		planeta1.setNombre("Mercurio");
		
		// Obteniedo el valor de una variable de un objeto de la clase Mercurio:
		System.out.print("\n\t Color de Mercurio: "+planeta1.getColor());
		
		// Mostrando los planetas en consola: 
		planeta1.showPlaneta();
		planeta2.showPlaneta();
		planeta3.showPlaneta();
		planeta4.showPlaneta();
		
		
		
	}

}

// Compilar es traducir a código ByteCode (Archivos .class)
// Ejecutables: todas clase Java se pueden compliar pero 
// no todas se pueden ejecutar.
