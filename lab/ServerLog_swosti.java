package lab;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerLog_swosti {
	 public static void main(String[] args) {
	        try {
	            // Create server socket on port 5000
	            ServerSocket serverSocket = new ServerSocket(5000);
	            System.out.println("Server started. Waiting for clients...");

	            while (true) {
	                // Wait for client connection
	                Socket client = serverSocket.accept();
	                System.out.println("New client connected: " 
	                        + client.getInetAddress().getHostAddress());
	            }

	        } catch (Exception e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	    }
}
