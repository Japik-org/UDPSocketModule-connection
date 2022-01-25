package com.pro100kryto.server.modules.udpsocket.connection;

import com.pro100kryto.server.utils.datagram.packet.DatagramPacketWrapper;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISocketListener extends Remote {
    void process(DatagramPacketWrapper packet) throws RemoteException;
}
