package fr.paris10.miage.procs.calculette.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.calculette.Calculette;

public class CalculetteTest {

	Calculette calc;

	@BeforeClass
	public void setUp() throws Exception {
		URL url = new URL("http://localhost:9999/ws/calculette?wsdl");
		QName qname = new QName("http://calculette.procs.miage.paris10.fr/", "CalculetteImplService");
		Service service = Service.create(url, qname);
        calc = service.getPort(Calculette.class);

	}

	@AfterClass
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdditionner() throws Exception {
		assertEquals(calc.additionner(2, 3), 5);
	}
}
