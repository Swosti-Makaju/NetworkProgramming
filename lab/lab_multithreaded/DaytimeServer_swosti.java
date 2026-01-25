package lab_multithreaded;
import java.net.*;
import java.io.*;
import java.util.Date;
public class DaytimeServer_swosti {
	public static void main(String[] args) {
		int port=13;
		try (ServerSocket server = new ServerSocket(port)) {
		System.out.println("Daytime Server Started on port"+port);
		while (true) {
		try (Socket connection = server.accept()) {
		Writer out = new OutputStreamWriter(connection.getOutputStream());
		Date now = new Date();
		out.write(now.toString() + "\n");
		out.flush();
		connection.close();
		}
		catch (IOException ex) {
		}
		}
		} catch (IOException ex) {
		System.err.println(ex);
		}
		}
		}
