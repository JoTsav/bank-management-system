package com.dev.bank.adminPanel.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Statement;

public class Server {
    static final int PORT = 1245;
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.printf("Server Started on port %d%n", PORT);

        Statement statement = DatabaseConnection.Connection();

        while (true){
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Client Connected");
                new ServerThread(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
