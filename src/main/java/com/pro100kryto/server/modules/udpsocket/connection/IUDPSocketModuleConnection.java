package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packet.DatagramPacketWrapper;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.rmi.RemoteException;

public interface IUDPSocketModuleConnection extends IModuleConnection {
    void setPacketListener(ISocketListener listener) throws RemoteException;
    void removePacketListener() throws RemoteException;

    boolean hasNextPacket() throws RemoteException;
    @Nullable
    DatagramPacketWrapper getNextPacket() throws RemoteException;
    void recycleAllPackets() throws RemoteException;

    void send(DatagramPacketWrapper packet) throws RemoteException, IOException;
    void sendAndRecycle(DatagramPacketWrapper packet) throws RemoteException, IOException;
}
