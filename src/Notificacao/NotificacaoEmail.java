package Notificacao;

public class NotificacaoEmail implements INotificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviar e-mail: " + mensagem);
    }
}
