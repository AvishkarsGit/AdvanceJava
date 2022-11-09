package Networking_Basics;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket server= new ServerSocket(8085);
        Socket client=server.accept();
        InputStream in = client.getInputStream();
        int c;
        while ((c=in.read())!=-1){
            System.out.print((char)c);
        }
    }
}
