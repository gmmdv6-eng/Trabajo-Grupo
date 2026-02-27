package com.ejerccio;

public class NotificationService {

	private static final String TYPE_PUSH = "push";
	private static final String TYPE_SMS = "sms";
	private static final String TYPE_EMAIL = "email";

	public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals(TYPE_EMAIL)) {
            System.out.println("Enviando email a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(TYPE_SMS)) {
            System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
        } else if (tipo.equals(TYPE_PUSH)) {
            System.out.println("Enviando push a " + destinatario + ": " + mensaje);
        }
    }
}