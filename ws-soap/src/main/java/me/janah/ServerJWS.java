package me.janah;

import jakarta.xml.ws.Endpoint;
import me.janah.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9191/", new BanqueService());
        System.out.println("*** Web Service deployed at http://127.0.0.1:9191/");
    }
}
