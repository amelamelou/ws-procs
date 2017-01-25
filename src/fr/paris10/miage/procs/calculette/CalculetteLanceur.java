package fr.paris10.miage.procs.calculette;

import javax.xml.ws.Endpoint;

import fr.paris10.miage.procs.calculette.CalculetteImpl;;

public class CalculetteLanceur {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/calculette", new CalculetteImpl());
	}
}
