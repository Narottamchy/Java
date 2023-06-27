import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server started. Waiting for clients...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Received from client: " + message);

                // Echo the message back to the client
                outputStream.write(buffer, 0, bytesRead);
                outputStream.flush();
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
