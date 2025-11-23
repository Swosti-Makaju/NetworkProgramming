package lab;

import java.net.*;

public class checkIPv_swosti {


	    public static void main(String[] args) {
	        try {
	            InetAddress ip = InetAddress.getByName("255.234.180.23"); // change IP here

	            if (ip instanceof Inet4Address) {
	                System.out.println("The IP address is IPv4");
	            } else if (ip instanceof Inet6Address) {
	                System.out.println("The IP address is IPv6");
	            }

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

