import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);
        
        PrintWriter w = new PrintWriter(s.getOutputStream(), true); // Use auto-flush

        w.println("Hello from the client!");
        s.close();
    }
}
