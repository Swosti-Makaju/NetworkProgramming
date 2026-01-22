package lab;
import java.net.*;
import java.io.*;
import java.util.*;

public class HTTPHeader_swosti {


	    public static void main(String[] args) {
	        try {
	            // URL of your choice
	            URL url = new URL("https://www.example.com");

	            // Open connection
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Optional: Set request method (GET is default)
	            connection.setRequestMethod("GET");

	            // Connect to the URL
	            connection.connect();

	            // Get all headers
	            System.out.println("HTTP Response Headers:");
	            Map<String, List<String>> headers = connection.getHeaderFields();
	            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
	                String headerName = entry.getKey();
	                List<String> headerValues = entry.getValue();
	                System.out.println((headerName != null ? headerName : "Status") + ": " + String.join(", ", headerValues));
	            }

	            // Disconnect
	            connection.disconnect();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

