package lab;
import java.net.*;
import java.util.*;

public class CookieInfo_swosti {
	 public static void main(String[] args) {
	        try {
	            // Create a CookieManager to store cookies
	            CookieManager manager = new CookieManager();
	            CookieHandler.setDefault(manager);

	            // URL to connect
	            URL url = new URL("https://www.google.com");
	            URLConnection connection = url.openConnection();
	            connection.getContent(); // establishes connection

	            // Retrieve stored cookies
	            CookieStore store = manager.getCookieStore();
	            List<HttpCookie> cookies = store.getCookies();

	            System.out.println("Cookies Retrieved:");
	            for (HttpCookie cookie : cookies) {
	                System.out.println("Name  : " + cookie.getName());
	                System.out.println("Value : " + cookie.getValue());
	                System.out.println("Domain: " + cookie.getDomain());
	                System.out.println("----------------------");
	            }

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}