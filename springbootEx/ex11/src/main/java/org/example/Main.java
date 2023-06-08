package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    //bad code
    public static void main(String[] args) throws Exception{

        URL url = new URL("https://img.megabox.co.kr/SharedImg/2023/05/17/2JKK6tEBrtIA0Gun1yMvSOm6yW34ZA0x_1100.jpg");
        InputStream fin = url.openStream();

        // 1단계 : 빨대 준비
        // FileInputStream fin =
        //        new FileInputStream("C:\\zzz\\test.jpg");

        System.out.println(fin);

        FileOutputStream fos =
                new FileOutputStream("C:\\zzz\\copy.jpg");

        System.out.println(fos);

        // 2단계 : 읽고 쓰기
        while (true) {
            int data = fin.read();
            if (data == -1) {
                break;
            }
            fos.write(data);
        }//end while
    }
}