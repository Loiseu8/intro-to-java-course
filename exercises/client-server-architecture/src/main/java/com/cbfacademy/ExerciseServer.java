package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {

    public static void main(String[] args) {
        // Step 1: Create a ServerSocket on port 4040
        // Try-with-resources will ensure the server socket closes automatically
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040");

            // Step 2: Wait for a client connection
            // This will block until a client connects
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("Connected to client");

                // Step 3: Read and print the message sent by the client
                String message = reader.readLine();
                System.out.println("Received message from client: " + message);

            } catch (IOException e) {
                e.printStackTrace(); // If an error occurs with client connection or reading, print the error
            }

        } catch (IOException e) {
            e.printStackTrace(); // If an error occurs with the server socket, print the error
        }
    }
}
