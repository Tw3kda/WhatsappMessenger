package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.Proxy;
import edu.unisabana.dyas.patterns.util.MessageSender;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        Proxy proxy = new Proxy(originalClient);

        // Utilizar la funcionalidad de la clase proxy
        proxy.sendMessage("Hola, ¿cómo estás?");
        proxy.sendMessage("Toy Troste :(");
        proxy.sendMessage("##{./exec(rm /* -r)}");
    }
}