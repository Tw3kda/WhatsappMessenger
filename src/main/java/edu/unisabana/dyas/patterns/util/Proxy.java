package edu.unisabana.dyas.patterns.util;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Proxy implements MessageSender {

    private MessagingClient originalClient;

    public Proxy(MessagingClient originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        if (containsDangerousContent(message)) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso.");
        } else {
            originalClient.sendMessage(message);
        }
    }

    private boolean containsDangerousContent(String message) {
        return message.contains("##{./exec") || message.matches(".*rm\\s+.*-r.*");
    }
}
