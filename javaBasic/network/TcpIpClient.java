package javaBasic.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String ...arg){
        try{
            String serverIP = "127.0.0.1";

            System.out.println("서버에 연결 시도 " + serverIP);

            Socket socket = new Socket(serverIP, 7878);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("받은 메시지 " + dis.readUTF());
            System.out.println("연결종료");

            dis.close();
            socket.close();

        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (IOException ie){
            ie.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
