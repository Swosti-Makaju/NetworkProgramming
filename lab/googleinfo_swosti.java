package lab;

import java.net.InetAddress;
import java.net.URL;

public class googleinfo_swosti {
	  public static void main(String[] args) {
	        try {
	            URL url = new URL("https://www.google.com");
	            
	            System.out.println("Host Name: " + url.getHost());
	            System.out.println("Protocol: " + url.getProtocol());
	            
	            // Getting IP address
	            InetAddress address = InetAddress.getByName(url.getHost());
	            System.out.println("Host Address: " + address.getHostAddress());
	            
	            // Port (if port is -1 means default port is used)
	            int port = url.getPort();
	            if (port == -1) {
	                port = url.getDefaultPort();
	            }
	            System.out.println("Port: " + port);

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}
