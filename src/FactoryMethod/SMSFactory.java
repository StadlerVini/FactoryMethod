package FactoryMethod;

import Notificacao.INotificacao;
import Notificacao.NotificacaoSMS;

public class SMSFactory extends NotificacaoFactory{
    @Override
    public INotificacao criarNotificacao(){
        return new NotificacaoSMS();
    }
}
