package listarPersonasSanchezSantiago;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class listado {

	public static void main(String[] args) {
		
		persona personauno = new persona ();
		personauno.setNombre("Marcos");
		personauno.setApellido("Estevanez");
		
		persona personados = new persona ();
		personados.setNombre("Eugenia");
		personados.setApellido("Vilar");
		
		persona personatres = new persona ();
		personatres.setNombre("Andrés");
		personatres.setApellido("Mamani");
		
		
		persona personacuatro = new persona ();
		personacuatro.setNombre("Agustina");
		personacuatro.setApellido("Corballán");
		
		persona personacinco = new persona ();
		personacinco.setNombre("Ignacio");
		personacinco.setApellido("Britos");
		
		List<persona> personas = Arrays.asList(personauno, personados, personatres, personacuatro, personacinco);
		/* Ordenar alfabeticamente por nombre */
        Collections.sort(personas, Comparator.comparing(persona::getNombre));
        System.out.println("Lista ordenada alfabeticamente por nombre: \n" + personas);

        /* Ordenar alfabeticamente por apellido */ 
        Collections.sort(personas, Comparator.comparing(persona::getApellido));
        System.out.println("Lista ordenada alfabeticamente por apellido: \n" + personas);

        /* Ordenar inversamente por apellido*/
        Collections.sort(personas, Comparator.comparing(persona::getApellido).reversed());
        System.out.println("Lista ordenada inversamente por apellido: \n" + personas);
	}
}
