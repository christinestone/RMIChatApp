package com.chat.apis;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClient extends Remote {
    void display(String message) throws RemoteException;
}
