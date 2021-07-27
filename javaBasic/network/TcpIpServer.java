package javaBasic.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TcpIpServer {
    public static void main(String ...arg){
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(7878);
        } catch (IOException e){
            e.printStackTrace();
        }

        while (true){
            try {
                System.out.println("연결대기");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청이 들어옴 ");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[SERVER] TEST MSG");
                System.out.println(getTime() + "데이터 전송 완료");

                dos.close();
                socket.close();


            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
