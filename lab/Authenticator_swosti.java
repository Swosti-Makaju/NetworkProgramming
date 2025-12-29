package lab;
import java.net.*;
import java.io.*;
public class Authenticator_swosti {
	
	    public static void main(String[] args) {
	        try {
	            // Set the default Authenticator
	            Authenticator.setDefault(new Authenticator() {
	                @Override
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    System.out.println("Requesting authentication for: " + getRequestingHost());
	                    // Return username and password
	                    return new PasswordAuthentication("username", "password".toCharArray());
	                }
	            });

	            // URL that requires authentication (example)
	            URL url = new URL("http://facebook.com/protected");
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Get response code
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            // Read and print content if response is OK
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                while ((inputLine = in.readLine()) != null) {
	                    System.out.println(inputLine);
	                }
	                in.close();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
