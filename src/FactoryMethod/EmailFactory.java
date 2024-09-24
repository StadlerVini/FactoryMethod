package FactoryMethod;

import Notificacao.*;

public class EmailFactory extends NotificacaoFactory{
    @Override
    public INotificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
