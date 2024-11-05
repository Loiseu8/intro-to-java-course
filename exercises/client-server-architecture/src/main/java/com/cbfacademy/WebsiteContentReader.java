package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteContentReader {

    public static void main(String[] args) {
        // Step 1: Specify the URL to connect to
        String urlString = "https://codingblackfemales.com";

        // Step 2: Establish connection and read content
        // Using try-with-resources here to automatically close resources
        try {
            // Create a URL object from the string (Java's way to handle URLs)
            URL url = new URL(urlString);

            // Open a connection to the URL, allowing us to access the website’s content
            URLConnection connection = url.openConnection();

            // Use a BufferedReader wrapped around an InputStreamReader to read the content
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;

                // Read each line from the website's response
                while ((line = reader.readLine()) != null) {
                    System.out.println(line); // Print each line as we go
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // If an error occurs, print the error message
        }
    }
}
