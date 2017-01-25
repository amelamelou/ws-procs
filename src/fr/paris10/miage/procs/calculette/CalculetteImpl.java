package fr.paris10.miage.procs.calculette;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.calculette.Calculette")
public class CalculetteImpl implements Calculette {

	@Override
	public int additionner(int number1, int number2) {
		return number1+number2;
	}


}
