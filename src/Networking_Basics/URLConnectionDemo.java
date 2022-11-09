package Networking_Basics;

import java.io.*;
import java.net.*;
import java.util.*;
public class URLConnectionDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u1 = new URL("https://www.amazon.com/");
        URLConnection u2=u1.openConnection();
        System.out.println("Date:"+new Date(u2.getDate()));
        System.out.println("Type of Content:"+u2.getContentType());
        System.out.println("length of Content:"+u2.getContentLength());
        System.out.println("Date of Expiration:"+new Date(u2.getExpiration()));
        System.out.println("Date of Modify:"+new Date(u2.getLastModified()));
    }
}
