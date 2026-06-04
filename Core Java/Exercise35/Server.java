package Exercise35;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket =
                new ServerSocket(5000);

        System.out.println("Server Started");

        Socket socket = serverSocket.accept();

        BufferedReader br =
                new BufferedReader(
                new InputStreamReader(
                socket.getInputStream()));

        System.out.println("Client: " + br.readLine());

        socket.close();
        serverSocket.close();
    }
}