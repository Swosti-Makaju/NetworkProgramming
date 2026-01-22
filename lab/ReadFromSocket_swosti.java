package lab;

import java.net.*;
import java.io.*;

public class ReadFromSocket_swosti {
	 public static void main(String[] args) {
		  try (Socket socket = new Socket("time.nist.gov", 13)) {
	            socket.setSoTimeout(15000);
	            InputStream in = socket.getInputStream();

	            InputStreamReader reader = new InputStreamReader(in);
	            BufferedReader br = new BufferedReader(reader);
	            
	            
	            String line;
	            while((line=br.readLine()) != null){
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("something went wrong");
	        }
	    }
}
