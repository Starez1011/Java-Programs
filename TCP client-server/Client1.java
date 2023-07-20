import java.net.*;
import java.io.*;
import java.util.*;

public class Client1 {
    public static void main(String[]args)throws Exception{
        Scanner scan = new Scanner(System.in);
        Socket s = new Socket("localhost",6000);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(str);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String sq = dis.readUTF();
        System.out.print("Server reply "+sq);
        dis.close();
        dos.close();
        s.close();
        scan.close();
    }
}
