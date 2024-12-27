import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("Server is listening on port 4999...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);


        String str = bf.readLine();
        System.out.println("Client: " + str);

        bf.close();
        s.close();
        ss.close();
    }
}
