package lab_multithreaded;
import java.net.*;
import java.io.*;
public class DaytimeClient_swosti {
public static void main(String[] args) {
String serverAddress = "localhost"; int port = 13;
try (Socket socket = new Socket(serverAddress, port)) {
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
String serverResponse = in.readLine(); 
System.out.println("Server Date and Time: " + serverResponse);
} catch (IOException ex) {
System.err.println(ex);
}
}
}
