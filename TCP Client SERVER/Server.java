import java.net.*;
import java.io.*;

class Server{
    public static void main(String[]args)throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        System.out.print("Server running on 5000");
        while (true){
            Socket s = ss.accept();
            System.out.print("Client Connected");
            ClientHandler ch = new ClientHandler(s);
            ch.start();
            ss.close();
        }
    }
}
class ClientHandler extends Thread{
    Socket s;
    public ClientHandler(Socket s){
        this.s=s;
    }
    public void run(){
        try{
            DataOutputStream dos = new DataOutputStream(this.s.getOutputStream());
            DataInputStream dis = new DataInputStream(this.s.getInputStream());

            while(true){
                String Msg = dis.readUTF();
                if(Msg.equalsIgnoreCase("bye")){
                    break;
                }
                dos.writeUTF(Msg.toUpperCase());
            }
            dos.close();
            dis.close();
            this.s.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}