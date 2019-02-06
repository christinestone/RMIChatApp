package com.chat.apis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatServer extends Remote {
    void register(ChatClient client, String name) throws RemoteException;
    void broadcast(String message) throws RemoteException;
    void privateMessage(String message, String user) throws RemoteException;
    ArrayList<String> listUsers() throws RemoteException;
    void updateUsersList(String clientName) throws RemoteException;
}
