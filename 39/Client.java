import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Connected to server");

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String message = "Hello, server!";
            byte[] buffer = message.getBytes();
            outputStream.write(buffer);
            outputStream.flush();
            System.out.println("Sent to server: " + message);

            // Receive the echoed message from the server
            buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            message = new String(buffer, 0, bytesRead);
            System.out.println("Received from server: " + message);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
