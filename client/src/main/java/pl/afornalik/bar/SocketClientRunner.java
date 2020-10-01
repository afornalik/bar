package pl.afornalik.bar;

import pl.afornalik.bar.socket.SocketClient;

import java.io.IOException;

public class SocketClientRunner {

    public static final String HI_SERVER = "hi server";
    public static final String BYE_BYE = "bye bye";
    public static final String MENU = "menu";
    public static final String HELLO_SERVER = "hello server";
    private static SocketClient socketClient = new SocketClient();

    public static void main(String[] args) throws IOException {

        socketClient.startConnection("127.0.0.1",54332);
      //  System.out.println("Response for \""+HI_SERVER+"\" is: "+ socketClient.sendMessage(HI_SERVER));
       // System.out.println("Response for \""+HELLO_SERVER+"\" is: "+ socketClient.sendMessage(HELLO_SERVER));
        //System.out.println("Response for \""+HI_SERVER+"\" is: "+ socketClient.sendMessage(HI_SERVER));
        System.out.println("Response for \""+MENU+"\" is: "+ socketClient.sendMessage(MENU));
       // System.out.println("Response for \""+HELLO_SERVER+"\" is: "+ socketClient.sendMessage(HELLO_SERVER));

        socketClient.stopConnection();

    }
}
