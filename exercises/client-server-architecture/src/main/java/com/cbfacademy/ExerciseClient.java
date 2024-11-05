package com.cbfacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {

    public static void main(String[] args) {
        // Step 1: Connect to the server at localhost on port 4040
        // Try-with-resources to ensure the socket closes automatically
        try (Socket socket = new Socket("localhost", 4040);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to the server");

            // Step 2: Send a message to the server
            String message = "Hello, Server!";
            writer.println(message); // Sends the message through the socket to the server
            System.out.println("Sent message to server: " + message);

        } catch (IOException e) {
            e.printStackTrace(); // If there's an error connecting to the server, print the error
        }
    }
}
