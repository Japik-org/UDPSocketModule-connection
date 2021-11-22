package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.utils.datagram.packet.Packet;

public interface ISocketListener {
    void process(Packet packet);
}
