package edu.asu.bmi.cda.Homework6;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OWLTest {
	
	@Test
	public Test1() throws OWLOntologyCreationException, OWLOntologyStorageException{
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = manager.loadOntologyFromOntologyDocument(
		 this.getClass().getResourceAsStream( "/skos_ext.owl" )
		);
		OWLDataFactory factory = manager.getOWLDataFactory();
		manager.saveOntology( ontology, System.err );
	}
}
