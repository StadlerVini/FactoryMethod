package Notificacao;

public class NotificacaoSMS implements INotificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviar SMS: " + mensagem);
    }
}
