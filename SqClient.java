

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Работа по протоколу TCP
 * Клиент отправляет байт (число) серверу,
 * затем получает квадрат числа
 */
public class SqClient {
    public static void main(String[] args) throws IOException {
        int numb = 0;
        try(Socket socket = new Socket("DESKTOP-ASVK2VM", 1020)){
            numb++;
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(numb);
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();

            while(numb < 10){
                int response = inputStream.read();
                System.out.println(response);
            }

        }
    }
}
