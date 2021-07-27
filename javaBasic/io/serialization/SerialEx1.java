// FILE 로 직력화
package javaBasic.io.serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String ...args) throws Exception{
        String fileName = "UserInfo.ser";
        System.out.println(System.getProperty("user.dir"));
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        ObjectOutputStream out = new ObjectOutputStream(bos);

        UserInfo u1 = new UserInfo("Javaman", "1234", 30);
        UserInfo u2 = new UserInfo("JavaWomen", "8901", 26);

        ArrayList<UserInfo> infoList = new ArrayList<>();
        infoList.add(u1);
        infoList.add(u2);

        out.writeObject(u1);
        out.writeObject(u2);
        out.writeObject(infoList);
        out.close();
        System.out.println("Serialization OVER");
    }

}
