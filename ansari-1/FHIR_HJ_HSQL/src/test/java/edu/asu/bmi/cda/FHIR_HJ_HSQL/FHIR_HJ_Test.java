package edu.asu.bmi.cda.FHIR_HJ_HSQL;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.impl.AddressImpl;
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
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class FHIR_HJ_Test {
	//test Patient
	@Test
	public void test1(){
		String fname = "Nishal";
		String lname = "Ansari";
		String fullname = "Nishal Ansari";
		String gender = "M";
		String address = "123 Test St.";
		String city = "Tempe";
		String state = "AZ";
		String zip = "85287";
		String maritalStatus = "M";
		Date dob = new Date(102,00,01);
		
		Patient p = new PatientImpl()
			.withNames(new HumanNameImpl()
				.withGivens(new StringImpl().withValue(fname))
				.withFamilies(new StringImpl().withValue(lname))
				.withText(new StringImpl().withValue(fullname)))
			.withGender(new CodeableConceptImpl()
				.withCodings(new CodingImpl()
					.withCode(new CodeImpl().withValue(gender))))
			.withBirthDate(new DateTimeImpl()
				.withValue(dob))
			.withAddresses(new AddressImpl()
					.withLines(new StringImpl().withValue(address))
					.withCity(new StringImpl().withValue(city))
					.withState(new StringImpl().withValue(state))
					.withZip(new StringImpl().withValue(zip)))
			.withMaritalStatus(new CodeableConceptImpl()
				.withCodings(new CodingImpl()
					.withCode(new CodeImpl().withValue(maritalStatus))));
			
		//System.out.println(p.getNames().get(0).getText().getValue()+"\t"+p.getGender().getCodings().get(0).getCode().getValue()+"\t"+p.getBirthDate().getValue().toString());
		
		assertNotNull(p);
		
		assertEquals(fullname, p.getNames().get(0).getText().getValue());
		assertEquals(gender, p.getGender().getCodings().get(0).getCode().getValue());
		assertEquals(dob, p.getBirthDate().getValue());
		assertEquals(address, p.getAddresses().get(0).getLines().get(0).getValue());
		assertEquals(city, p.getAddresses().get(0).getCity().getValue());
		assertEquals(state, p.getAddresses().get(0).getState().getValue());
		assertEquals(zip, p.getAddresses().get(0).getZip().getValue());
		assertEquals(maritalStatus, p.getMaritalStatus().getCodings().get(0).getCode().getValue());
		
	}
	
	//test serialized xml file of Patient
	@Test
	public void test2() throws JAXBException, FileNotFoundException{		
		JAXBContext c = JAXBContext.newInstance( Patient.class.getPackage().getName() );
		Unmarshaller um = c.createUnmarshaller();
		
		InputStream is = new FileInputStream(new File("src/main/resources/sample-data/patient-example.xml"));
		Patient p = (Patient) um.unmarshal( is );
		
		/*
		System.out.println(p.getNames().get(0).getGivens().get(0).getValue() + " " + p.getNames().get(0).getFamilies().get(0).getValue() + '\n'
				+ p.getAddresses().get(0).getLines().get(0).getValue() + ", " + p.getAddresses().get(0).getCity().getValue() + ", "
				+ p.getAddresses().get(0).getState().getValue() + " " + p.getAddresses().get(0).getZip().getValue());
		*/	

		assertNotNull(p);
		
		assertEquals("Peter", p.getNames().get(0).getGivens().get(0).getValue());
		assertEquals("James", p.getNames().get(0).getGivens().get(1).getValue());
		assertEquals("Chalmers", p.getNames().get(0).getFamilies().get(0).getValue());
		assertEquals("Jim", p.getNames().get(1).getGivens().get(0).getValue());
	}
	
	// test round-trip of xml > object > xml
	@Test
	public void test3() throws JAXBException, IOException, ClassNotFoundException{		
		JAXBContext c = JAXBContext.newInstance( Patient.class.getPackage().getName() );
		Unmarshaller um = c.createUnmarshaller();
		
		InputStream is = new FileInputStream(new File("src/main/resources/sample-data/patient-example.xml"));
		Patient p = (Patient) um.unmarshal( is );
		
		File fileOut = new File("src/main/resources/sample-data/patient-example2.xml");
		if(!fileOut.exists())
			fileOut.createNewFile();
		OutputStream os = new FileOutputStream(fileOut, false);
		Marshaller m = c.createMarshaller();
		m.marshal( p, os );
		
		is = new FileInputStream(fileOut);
		Patient p2 = (Patient) um.unmarshal( is );
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(p);
		byte[] bp = bos.toByteArray();
		
		bos = new ByteArrayOutputStream();
		oos = new ObjectOutputStream(bos);
		oos.writeObject(p2);
		byte[] bp2 = bos.toByteArray();
		
		// check if arrays are equal
		assertArrayEquals(bp, bp2);
		
		/*
	    ByteArrayInputStream bis = new ByteArrayInputStream(bp);
	    ObjectInputStream ois = new ObjectInputStream(bis);
	    Object bpo = ois.readObject();
	    
	    bis = new ByteArrayInputStream(bp2);
	    ois = new ObjectInputStream(bis);
	    
	    //assertTrue(ois.equals(bpo));
	    */
	}
}
