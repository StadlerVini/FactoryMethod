package FactoryMethod;

import Notificacao.INotificacao;

public abstract class NotificacaoFactory {
    public abstract INotificacao criarNotificacao();
}
