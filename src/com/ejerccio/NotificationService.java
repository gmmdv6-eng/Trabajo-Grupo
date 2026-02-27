package com.ejerccio;

public class NotificationService {

	private static final String TYPE_PUSH = "push";
	private static final String TYPE_SMS = "sms";
	private static final String TYPE_EMAIL = "email";

	public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        if (tipo.equals(TYPE_EMAIL)) {
            enviarEmail(mensaje, destinatario);
        } else if (tipo.equals(TYPE_SMS)) {
            enviarSMS(mensaje, destinatario);
        } else if (tipo.equals(TYPE_PUSH)) {
            enviarPush(mensaje, destinatario);
        }
    }

	private void enviarPush(String mensaje, String destinatario) {
		System.out.println("Enviando push a " + destinatario + ": " + mensaje);
	}

	private void enviarSMS(String mensaje, String destinatario) {
		System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
	}

	private void enviarEmail(String mensaje, String destinatario) {
		System.out.println("Enviando email a " + destinatario + ": " + mensaje);
	}
}