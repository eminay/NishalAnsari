package edu.asu.bmi.cda.Homework7.api.impl;

import edu.asu.bmi.cda.Homework7.api.FHIRService;

import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.impl.DateImpl;
import org.hl7.fhir.model.impl.DateTimeImpl;
import org.hl7.fhir.model.impl.HumanNameImpl;
import org.hl7.fhir.model.impl.PatientImpl;
import org.hl7.fhir.model.impl.StringImpl;
import org.springframework.stereotype.Service;

@Service( "fhirService#default" )
public class DefaultFHIRService
	implements FHIRService
{
	public Patient getPatient( String pid ) {
	Patient pat = new PatientImpl()
		.withId(pid)
		.withNames(new HumanNameImpl()
				.withFamilies(new StringImpl().withValue("Ansari"))
				.withGivens(new StringImpl().withValue("Nishal")));
	return pat;
	}
}