package fr.paris10.miage.procs.calculetteclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.calculette.Calculette;

public class CalculetteClient {

	   public static void main(String[] args) throws Exception {
	        URL url = new URL("http://localhost:9999/ws/calculette?wsdl");
	        QName qname = new QName("http://calculette.procs.miage.paris10.fr/", "CalculetteImplService");
	        Service service = Service.create(url, qname);
	        Calculette calculette = service.getPort(Calculette.class);
	        System.out.println(calculette.additionner(2,3));
	    }
}
