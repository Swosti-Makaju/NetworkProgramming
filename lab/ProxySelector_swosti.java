package lab;
import java.net.*;
import java.io.*;
import java.util.List;
public class ProxySelector_swosti {

	    public static void main(String[] args) {
	        try {
	            // Set the default ProxySelector
	            ProxySelector.setDefault(new ProxySelector() {
	                @Override
	                public List<Proxy> select(URI uri) {
	                    System.out.println("Selecting proxy for URI: " + uri);
	                    // For demonstration, return a direct connection (no proxy)
	                    return List.of(Proxy.NO_PROXY);
	                }

	                @Override
	                public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
	                    System.out.println("Connection failed to " + uri + " via " + sa);
	                }
	            });

	            // Create a URI to connect to
	            URI uri = new URI("http://www.google.com");

	            // Get the default ProxySelector
	            ProxySelector selector = ProxySelector.getDefault();

	            // Ask the ProxySelector which proxies to use for this URI
	            List<Proxy> proxies = selector.select(uri);

	            // Print the proxies
	            System.out.println("Proxies returned for " + uri + ":");
	            for (Proxy proxy : proxies) {
	                System.out.println(proxy);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


