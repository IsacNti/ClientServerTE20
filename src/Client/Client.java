package Client;

//import com.sun.corba.se.pept.transport.Client.ListenerThread;

//import com.sun.corba.se.pept.transport.Client.ListenerThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Socket socket;

    PrintWriter out;
    BufferedReader in;

    private String output;
    private String ip;
    private String input;

    public Client() {

    }
    
    public void Connect(String ip, int port) {
        try {
            socket = new Socket(ip,port);
        } catch (IOException e) {
            System.err.println("Failed to connect to server");
            e.printStackTrace();
        }
        System.out.println("Connection ready...");
    }

  


    private void getStreams() {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }

    private void runProtocol() {
        Scanner tgb = new Scanner(System.in);
        System.out.println("chatting...");
        String msg = "";
        while (!msg.equals("QUIT")) {
            msg = tgb.nextLine();
            out.println("CLIENT: " + msg);
        }
    }

  /*  public static void main(String[] args) throws InterruptedException {
        Client me = new Client(Ip, 1234);
        me.getStreams();
        ListenerThread l = new ListenerThread(me.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        me.runProtocol();
        listener.join();
        me.shutDown();
    }
*/
    public void shutDown() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOutput(String output) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("chatting...");
        String msg = "";
        while (!msg.equals("ytytfuygikg")) {
            msg = tgb.nextLine();
            out.println("CLIENT: " + msg);

        }
    }

    public void setIp(String ip) throws InterruptedException {
        System.out.println(ip);
        getStreams();
        ListenerThread l = new ListenerThread(in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        listener.join();
    }

    public void setquit(String ip) {
        shutDown();
    }

    public String getInput() {
        return null;
    }
}


