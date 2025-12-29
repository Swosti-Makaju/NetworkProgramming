package lab19;
import java.net.*;
import java.io.*;
public class Server_swosti {
	public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int number = in.readInt();

            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }

            out.writeLong(fact);

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
