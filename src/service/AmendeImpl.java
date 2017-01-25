package service;

import radars.Amende;
import radars.Voiture;

/**
 * Created by paabdougaye on 25/01/2017.
 */
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "service.AmendeService")
public class AmendeImpl implements AmendeService {

    @Override
    public void enregistrer(Voiture car) {

    }

    @Override
    public int signaler(String immatricul, String modele, int tarif) {
        return 0;
    }

    @Override
    public ArrayList<Amende> lister(String immatricul) {
        return null;
    }

    @Override
    public void payer(int numero, String nom, String prenom) {

    }
}
