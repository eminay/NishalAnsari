package edu.asu.bmi.cad.FHIRImpl;

import java.util.Date;

import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.impl.CodeImpl;
import org.hl7.fhir.model.impl.CodeableConceptImpl;
import org.hl7.fhir.model.impl.CodingImpl;
import org.hl7.fhir.model.impl.DateTimeImpl;
import org.hl7.fhir.model.impl.PatientImpl;
import org.hl7.fhir.model.impl.HumanNameImpl;
import org.hl7.fhir.model.impl.StringImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FHIRTest {

	@Test
	public void test1(){
		String fname = "Nishal";
		String lname = "Ansari";
		String fullname = "Nishal Ansari";
		String gender = "M";
		Date dob = new Date(86,05,27);
		
		Patient p = new PatientImpl()
			.withNames(new HumanNameImpl()
				.withGivens(new StringImpl().withValue(fname))
				.withFamilies(new StringImpl().withValue(lname))
				.withText(new StringImpl().withValue(fullname)))
			.withGender(new CodeableConceptImpl()
				.withCodings(new CodingImpl()
					.withCode(new CodeImpl().withValue(gender))))
			.withBirthDate(new DateTimeImpl()
				.withValue(dob));	
			
		System.out.println(p.getNames().get(0).getText().getValue()+"\t"+p.getGender().getCodings().get(0).getCode().getValue()+"\t"+p.getBirthDate().getValue().toString());
		
		assertEquals(fullname, p.getNames().get(0).getText().getValue());
		assertEquals(gender, p.getGender().getCodings().get(0).getCode().getValue());
		assertEquals(dob, p.getBirthDate().getValue());
	}
}