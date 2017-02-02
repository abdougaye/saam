package service;

import radars.Amende;
import radars.Voiture;

/**
 * Created by paabdougaye on 25/01/2017.
 */
import javax.jws.WebService;
import java.util.ArrayList;


@WebService(endpointInterface = "service.AmendeService")
public class AmendeImpl implements AmendeService {

    @Override
    public void enregistrer(Voiture car) {
        System.out.println("Voiture enregistrée");
        System.out.println(car.getModele()+" "+car.getImmatriculation());
        System.out.println("possédée par "+car.getProprietaire().getPrenom()+" "+car.getProprietaire().getNom());
    }

    static int numero=0;
    @Override
    public int signaler(String immatricul, String modele, int tarif) {
        if(modele.equals("Clio 3") && immatricul.equals("AB 123 CD") && tarif==90){
            System.out.println("Amende enregistrée") ;
            numero++;
            System.out.println("Amende numero "+numero+ " de "+tarif+" EUR pour "+immatricul);
        }
        else if(modele.equals("Clio 3") && immatricul.equals("AB 123 CD") && tarif==140){
            System.out.println("Amende enregistrée") ;
            numero++;
            System.out.println("Amende numero "+numero+ " de "+tarif+" EUR pour "+immatricul);
        }
        else{
            numero =-1;
        }

        return numero;

    }

    @Override
    public ArrayList<Amende> lister(String immatricul) {
        return null;
    }

    @Override
    public void payer(int numero, String nom, String prenom) {

    }
}
