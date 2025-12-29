package lab19;
import java.net.*;
import java.io.*;
import java.util.*;
public class Client_swosti {
	 public static void main(String[] args) {
	        try {
	            Socket socket = new Socket("localhost", 5000);

	            DataInputStream in = new DataInputStream(socket.getInputStream());
	            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter a number: ");
	            int num = sc.nextInt();

	            out.writeInt(num);

	            long result = in.readLong();
	            System.out.println("Factorial: " + result);

	            socket.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}
