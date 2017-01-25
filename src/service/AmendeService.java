package service;

import radars.Amende;
import radars.Voiture;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
//import java.util.List;

/**
 * Created by paabdougaye on 25/01/2017.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AmendeService {
    @WebMethod
    void enregistrer(Voiture car);

    @WebMethod
    int signaler(String immatricul, String modele, int tarif);


    @WebMethod
    ArrayList<Amende> lister(String immatricul);


    @WebMethod
    void payer(int numero, String nom, String prenom);
}