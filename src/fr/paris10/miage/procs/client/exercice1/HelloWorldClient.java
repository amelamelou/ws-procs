package fr.paris10.miage.procs.client.exercice1;

import fr.paris10.miage.procs.exercice1.HelloWorld;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/bonjour?wsdl");
        QName qname = new QName("http://hello/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.bonjour("Bob"));
    }
}
