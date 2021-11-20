package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.utils.datagram.packets.Packet;

public interface ISocketListener {
    void process(Packet packet);
}
