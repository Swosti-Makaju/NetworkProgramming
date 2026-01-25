package lab22;
import javax.net.ssl.*;
import java.io.*;
public class SecureServer_swosti {
	public static void main(String[] args) {
        try {
            // Set keystore for server
            System.setProperty("javax.net.ssl.keyStore", "serverkeystore.jks");
            System.setProperty("javax.net.ssl.keyStorePassword", "password");

            SSLServerSocketFactory factory =
                    (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket serverSocket =
                    (SSLServerSocket) factory.createServerSocket(4443);

            System.out.println("Secure server started...");

            SSLSocket socket = (SSLSocket) serverSocket.accept();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from secure server");

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}