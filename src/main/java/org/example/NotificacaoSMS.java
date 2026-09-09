package org.example;

public class NotificacaoSMS implements INotificacao{

    public String enviar() {
        return "Enviar Notificação de SMS";
    }

    public String receber() {
        return "Receber Notificação de SMS";
    }
}
