package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.utils.datagram.packet.DatagramPacketWrapper;

public interface ISocketListener {
    void process(DatagramPacketWrapper packet);
}
