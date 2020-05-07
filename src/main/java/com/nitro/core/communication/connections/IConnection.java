package com.nitro.core.communication.connections;

import com.nitro.core.communication.messages.IMessageComposer;
import com.nitro.core.communication.messages.IMessageEvent;
import com.nitro.core.communication.servers.IServer;

import java.util.List;

public interface IConnection {

    void init();
    void dispose();
    void handleEvent(IMessageEvent event);
    void handleEvents(List<IMessageEvent> events);
    void processComposer(IMessageComposer composer);
    void processComposers(List<IMessageComposer> composers);
    IServer getServer();
    void setServer(IServer server);
    IConnectionContainer getContainer();
    void setContainer(IConnectionContainer container);
    int getId();
    String getIp();
}
