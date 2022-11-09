package Networking_Basics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class clientDemo {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8085);
        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        byte data[] = "Hello Server".getBytes();
        out.write(data);
        client.close();
    }
}
