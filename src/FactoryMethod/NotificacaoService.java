package FactoryMethod;

import Notificacao.INotificacao;

public class NotificacaoService {
    public void enviarNotificacao(NotificacaoFactory factory, String mensagem){
        INotificacao notificacao = factory.criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
