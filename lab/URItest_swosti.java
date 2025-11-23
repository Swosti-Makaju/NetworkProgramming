package lab;

import java.net.URI;
import java.net.URISyntaxException;

public class URItest_swosti {

	 public static void main(String[] args) {
	        try {
	            // Base URI (http://example.com)
	            URI baseURI = new URI("http://example.com");

	            // Relative path (colleges/SWASTIK#admission)
	            String relativePath = "colleges/SWASTIK#admission";

	            // Resolve the complete URI
	            URI completeURI = baseURI.resolve(relativePath);

	            // Print the complete URI
	            System.out.println("Complete URI: " + completeURI.toString());
	        } catch (URISyntaxException e) {
	            // Handle invalid URI syntax
	            System.out.println("Error: Invalid URI syntax.");
	            e.printStackTrace();
	        }
	    }
	
}
