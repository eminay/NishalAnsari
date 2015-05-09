package edu.asu.bmi.cda.Homework7.api;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.impl.PatientImpl;
import java.lang.String;

@Path( "FHIRService" )
public interface FHIRService
{
	@Path( "Patient/{pid}" )
	@GET
	@Produces( { "application/xml" } )
	Patient getPatient( @PathParam( "pid" ) String pid );
}