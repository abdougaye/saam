package client;

/**
 * Created by paabdougaye on 25/01/2017.
 */
import radars.Personne;
import radars.Voiture;
import service.AmendeService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class AmendeClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/saam?wsdl");
        QName qname = new QName("http://service/", "AmendeImplService");
        Service service = Service.create(url, qname);
        AmendeService ams = service.getPort(AmendeService.class);

        Personne bob = new Personne("Sponge","Bob","France");
        Voiture clio3 = new Voiture("AB 123 CD","Clio 3",bob);
        ams.enregistrer(clio3);

        Personne capitaine = new Personne("Haddock","Capitaine","France");
        Voiture punto = new Voiture("AB 124 CD","Punto",capitaine);
        ams.enregistrer(punto);

        // SIGNALEMENT INFRACTION CLIO3
        ams.signaler("AB 123 CD","Clio 3",90);
        ams.signaler("AB 123 CD","Clio 3",140);

    }
}
