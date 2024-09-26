package com.cbfacademy;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.Set;

    public class LoadAndReadProperties {
        public static void main(String[] args) {

            // Specify the path to the given properties file
            String propertiesFilePath = "example.properties";

            // Create a Properties object
            Properties properties = new Properties();

            try (FileInputStream input = new FileInputStream(propertiesFilePath)) {
                // Load the properties file
                properties.load(input);

                // Get all the property names
                Set<String> propertyNames = properties.stringPropertyNames();

                // Print each property and its value
                for (String propertyName : propertyNames) {
                    String propertyValue = properties.getProperty(propertyName);
                    System.out.println(propertyName + "=" + propertyValue);
                }
            } catch (IOException e) {
                System.err.println("Error loading properties file: " + e.getMessage());
            }
        }
    }


