package FactoryMethod;

import Notificacao.INotificacao;
import Notificacao.NotificacaoPush;

public class PushFactory extends NotificacaoFactory{
    @Override
    public INotificacao criarNotificacao(){
        return new NotificacaoPush();
    }
}
