package Networking_Basics;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local Host Name:"+addr);

        //getByName()

        addr=InetAddress.getByName("msbte.org.in");
        System.out.println("MBSTE:"+addr);

        // getAllByName

        InetAddress ar[]=InetAddress.getAllByName("www.facebook.com");
        for(int i=0;i<ar.length;i++){
            System.out.println("facebook IP:"+ar[i]);
        }

        //isMulticastAddress

        System.out.println("Multicast Address:"+addr.isMulticastAddress());
    }
}
