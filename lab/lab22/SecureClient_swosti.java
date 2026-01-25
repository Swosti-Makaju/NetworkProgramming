package lab22;
import javax.net.ssl.*;
import java.io.*;
public class SecureClient_swosti {
	 public static void main(String[] args) {
	        try {
	            // Set truststore for client
	            System.setProperty("javax.net.ssl.trustStore", "clienttruststore.jks");
	            System.setProperty("javax.net.ssl.trustStorePassword", "password");

	            SSLSocketFactory factory =
	                    (SSLSocketFactory) SSLSocketFactory.getDefault();
	            SSLSocket socket =
	                    (SSLSocket) factory.createSocket("localhost", 4443);

	            BufferedReader in = new BufferedReader(
	                    new InputStreamReader(socket.getInputStream()));

	            System.out.println("Server says: " + in.readLine());

	            socket.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}

