package service;

/**
 * Created by paabdougaye on 25/01/2017.
 */
import javax.xml.ws.Endpoint;

public class AmendeLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/saam", new AmendeImpl());
    }
}