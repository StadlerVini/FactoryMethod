package Notificacao;

public class NotificacaoPush implements INotificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviar Push Notification: " + mensagem);
    }
}
