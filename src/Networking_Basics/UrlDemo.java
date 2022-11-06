package Networking_Basics;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL ui= new URL("https://www.google.co.in/");
        System.out.println("Protocol Name:"+ui.getProtocol());
        System.out.println("Port Number:"+ui.getPort());
        System.out.println("Host Name:"+ui.getHost());
        System.out.println("File Path:"+ui.getFile());
    }
}
