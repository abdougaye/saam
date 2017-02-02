package service;

import radars.Amende;
import radars.Voiture;

/**
 * Created by paabdougaye on 25/01/2017.
 */
import javax.jws.WebService;


@WebService(endpointInterface = "service.AmendeService")
public class AmendeImpl implements AmendeService {

    @Override
    public void enregistrer(Voiture car) {
        System.out.println("Voiture enregistrée");
        System.out.println(car.getModele()+" "+car.getImmatriculation());
        System.out.println("possédée par "+car.getProprietaire().getPrenom()+" "+car.getProprietaire().getNom());
    }

    static Amende[] amendes = new Amende[3] ;
    static int numero=0;
    @Override
    public int signaler(String immatricul, String modele, int tarif) {


        Amende amende = new Amende();
        if(modele.equals("Clio 3") && immatricul.equals("AB 123 CD") && tarif==90){
            System.out.println("Amende enregistrée") ;
            numero++;
            amende.setImmatriculation(immatricul);
            amende.setNumero(numero);
            amende.setTarif(tarif);
            amendes[numero-1]=amende;
            System.out.println("Amende numero "+amende.getNumero()+ " de "+amende.getTarif()+" EUR pour "+amende.getImmatriculation());
        }
        else if(modele.equals("Clio 3") && immatricul.equals("AB 123 CD") && tarif==140){
            System.out.println("Amende enregistrée") ;
            numero++;
            amende.setImmatriculation(immatricul);
            amende.setNumero(numero);
            amende.setTarif(tarif);
            amendes[numero-1]=amende;
            System.out.println("Amende numero "+amende.getNumero()+ " de  "+amende.getTarif()+" EUR pour "+amende.getImmatriculation());
        }
        else{
            numero =-1;
        }

        return numero;

    }

    @Override
    public Amende[] lister(String immatricul) {
        Amende[] am = null ;
        int i = 0;
        for (Amende amende:amendes
             ) {
            if (amende.getImmatriculation().equals(immatricul)) {
                am[i] = amende ;
            }
        }
        return am;
    }

    @Override
    public void payer(int numero, String nom, String prenom) {

    }
}
