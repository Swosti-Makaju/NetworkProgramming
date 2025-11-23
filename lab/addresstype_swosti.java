package lab;

import java.net.*;

public class addresstype_swosti {

	    public static void main(String[] args) {
	        try {
	            InetAddress ip = InetAddress.getByName("255.234.180.23");

	            System.out.println("IP Address: " + ip.getHostAddress());

	            if (ip.isAnyLocalAddress())
	                System.out.println("Any Local Address");
	            else if (ip.isLoopbackAddress())
	                System.out.println("Loopback Address");
	            else if (ip.isMulticastAddress())
	                System.out.println("Multicast Address");
	            else if (ip.isLinkLocalAddress())
	                System.out.println("Link-Local Address");
	            else if (ip.isSiteLocalAddress())
	                System.out.println("Site-Local Address");
	            else
	                System.out.println("Global Address");

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

