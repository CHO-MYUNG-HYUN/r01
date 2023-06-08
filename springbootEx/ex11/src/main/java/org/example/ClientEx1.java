package org.example;


import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {

    // bad code
    public static void main(String[] args) throws Exception{

        // 서버 아이피와 포트 번호
        Socket socket = new Socket("192.168.0.16", 8080);

        System.out.println(socket);

        //보내려면 OutputStream이 필요 -> 파일을 보내는 빨대
        OutputStream out = socket.getOutputStream();

        // 파일을 읽는 빨대
        FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");

        // 계속 읽어서 계속 보내기
        while (true) {
            // 1바이트 내용물
            int data = fin.read();
            // 내용물 전송
            out.write(data);

            // -1 파일을 다 읽었으면
            if (data == -1) {
                break;
            }
        }// end while

        // 사용했던 자원들 정리
        fin.close();
        out.close();
        socket.close();
    }
}
