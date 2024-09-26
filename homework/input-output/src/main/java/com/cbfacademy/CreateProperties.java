package com.cbfacademy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

    public class CreateProperties {
        public static void main(String[] args) {
            // File path for the configuration properties file
            String configFilePath = "configuration.properties";

            //First, I create a new Properties object
            Properties properties = new Properties();

            //Adding the given properties from README
            properties.setProperty("db.url", "localhost");
            properties.setProperty("db.port", "5353");
            properties.setProperty("db.user", "cbfacademy");
            properties.setProperty("db.password", "password");

            //Next, check if the file already exists
            File configFile = new File(configFilePath);
            if (configFile.exists()) {
                System.out.println("The file " + configFilePath + " already exists. No changes made.");
                return;
            }

            // Save the properties to the file
            try (FileOutputStream output = new FileOutputStream(configFilePath)) {
                properties.store(output, "Database Configuration");
                System.out.println("Configuration file created successfully: " + configFilePath);
            } catch (IOException e) {
                System.err.println("Error creating configuration file: " + e.getMessage());
            }
        }
    }



