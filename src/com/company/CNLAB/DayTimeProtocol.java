package com.company.CNLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DayTimeProtocol {
    public static void main(String[] args) {
        String serverAddress = "time.nist.gov"; // NIST Internet Time Service
        int serverPort = 13;

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Create a BufferedReader to read from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read and print the response from the server
            String serverResponse;
            while ((serverResponse = reader.readLine()) != null) {
                System.out.println("Server response: " + serverResponse);
            }

            // Close the socket and reader
            reader.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + serverAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

