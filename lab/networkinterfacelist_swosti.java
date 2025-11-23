package lab;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class networkinterfacelist_swosti {
	public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                
                System.out.println("Interface Name: " + ni.getName());
                System.out.println("Display Name : " + ni.getDisplayName());

                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    System.out.println("IP Address: " + addr.getHostAddress());
                }

                System.out.println("-------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
