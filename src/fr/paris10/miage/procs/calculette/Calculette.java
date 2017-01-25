package fr.paris10.miage.procs.calculette;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculette {

	@WebMethod int additionner (int number1, int number2);
}
