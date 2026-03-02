Proyecto 04 - Refactorización de Notificaciones

Este es el trabajo grupal para la asignatura de Entornos de Desarrollo. Hemos limpiado el código de un servicio de notificaciones y configurado el flujo de trabajo en Git.


    Alumno1: [Gabriel Martin-Mulas]
    Alumno2: [Samuel Rincón]

    Curso: 1º DAM

 Cambios realizados (Refactor)

Hemos aplicado tres mejoras principales usando las herramientas de Eclipse:

    Rename: Cambiados nombres de variables (mensaje, destinatario) por otros más claros.

    Extract Constant: Hemos sacado los tipos de envío ("email", "sms", "push") a constantes para no tener textos sueltos por el código.

    Extract Method: El método enviarNotificacion ahora delega el trabajo a tres métodos nuevos: enviarEmail(), enviarSMS() y enviarPush(). Así cada trozo de código hace solo una cosa.

 Contenido del Repositorio

    /src: Código fuente ya refactorizado.

    MEMORIA: Documento con las capturas de pantalla del IDE y de la configuración de GitHub (colaboradores y protección de rama master).


 Notas técnicas

    La rama master está protegida y requiere Pull Request para subir cambios.
