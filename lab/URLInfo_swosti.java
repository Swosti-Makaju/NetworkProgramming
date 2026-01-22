package lab;
import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class URLInfo_swosti {
	    public static void main(String[] args) {
	        try {
	            // URL of your choice
	            URL url = new URL("https://www.example.com");

	            // Open a connection to the URL
	            URLConnection connection = url.openConnection();

	            // Get last modified date
	            long lastModified = connection.getLastModified();
	            String lastModifiedStr = (lastModified == 0) ? "Not available"
	                    : new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(lastModified));

	            // Get content length
	            int contentLength = connection.getContentLength();

	            // Get content type
	            String contentType = connection.getContentType();

	            // Print the information
	            System.out.println("URL: " + url);
	            System.out.println("Last Modified: " + lastModifiedStr);
	            System.out.println("Content Length: " + ((contentLength == -1) ? "Not available" : contentLength + " bytes"));
	            System.out.println("Content Type: " + contentType);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
