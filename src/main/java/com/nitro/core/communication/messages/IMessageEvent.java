package com.nitro.core.communication.messages;

import com.nitro.core.communication.connections.IConnection;

import java.lang.reflect.Method;

public interface IMessageEvent {

    void dispose();
    Method getMessageCallback();
    IMessageListener getMessageListener();
    void setMessageListener(IMessageListener listener);
    Class<? extends IMessageParser> getParserClass();
    IMessageParser getParser();
    void setParser(IMessageParser parser);
    IConnection getConnection();
    void setConnection(IConnection connection);
}
