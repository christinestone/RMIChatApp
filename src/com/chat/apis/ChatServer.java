package com.chat.apis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatServer extends Remote {
    void registerUser(ChatClient client, String name) throws RemoteException;

    void broadcastMessages(String message) throws RemoteException;

    void sendPrivateMessage(String message, String user) throws RemoteException;

    ArrayList<String> listRegisteredUsers() throws RemoteException;
}
