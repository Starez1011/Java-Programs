import java.net.*;
import java.io.*;
import java.util.*;

public class Client1{
    public static void main(String [] agrs)throws Exception{
        Socket s = new Socket("localhost",5000);
        Scanner scan = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        while(true){
            System.out.print("Enter Message: ");
            String str = scan.next();
            dos.writeUTF(str);
            if(str.equalsIgnoreCase("bye")){
                break;
            }
            String reply = dis.readUTF();
            System.out.print("Message is: "+reply);
        }
        dis.close();
        dos.close();
        s.close();
        scan.close();
    }
}
