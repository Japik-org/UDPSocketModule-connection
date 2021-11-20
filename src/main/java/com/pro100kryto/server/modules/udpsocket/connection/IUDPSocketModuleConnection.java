package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packets.Packet;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public interface IUDPSocketModuleConnection extends IModuleConnection {
    void setPacketListener(ISocketListener listener);
    void removePacketListener();

    boolean hasNextPacket();
    @Nullable
    void getNextPacket();

    void send(Packet packet) throws IOException;
    void sendAndRecycle(Packet packet) throws IOException;
}
