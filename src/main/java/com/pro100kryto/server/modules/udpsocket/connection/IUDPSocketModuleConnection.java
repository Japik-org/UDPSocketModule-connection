package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packet.DatagramPacketWrapper;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public interface IUDPSocketModuleConnection extends IModuleConnection {
    void setPacketListener(ISocketListener listener);
    void removePacketListener();

    boolean hasNextPacket();
    @Nullable
    DatagramPacketWrapper getNextPacket();
    void recycleAllPackets();

    void send(DatagramPacketWrapper packet) throws IOException;
    void sendAndRecycle(DatagramPacketWrapper packet) throws IOException;
}
