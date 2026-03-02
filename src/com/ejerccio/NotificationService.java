package com.ejerccio;

import java.util.Arrays;

public class NotificationService {

    //  Definimos un enum que contiene la lógica de cada tipo
    private enum NotificationType {
        EMAIL("email") {
            @Override
            public void enviar(String m, String d) {
                System.out.println("Enviando email a " + d + ": " + m);
            }
        },
        SMS("sms") {
            @Override
            public void enviar(String m, String d) {
                System.out.println("Enviando SMS a " + d + ": " + m);
            }
        },
        PUSH("push") {
            @Override
            public void enviar(String m, String d) {
                System.out.println("Enviando push a " + d + ": " + m);
            }
        };

        private final String key;

        NotificationType(String key) {
            this.key = key;
        }

        // Método abstracto que cada elemento del enum debe implementar
        public abstract void enviar(String mensaje, String destinatario);

        // Método estático para buscar el enum por su clave de texto
        public static NotificationType fromString(String tipo) {
            return Arrays.stream(values())
                    .filter(t -> t.key.equalsIgnoreCase(tipo))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Tipo no soportado: " + tipo));
        }
    }

    // 2. El método principal queda limpio y sin condicionales
    public void enviarNotificacion(String tipo, String mensaje, String destinatario) {
        NotificationType.fromString(tipo).enviar(mensaje, destinatario);
    }
}
