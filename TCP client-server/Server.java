import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[]args)throws Exception{
        ServerSocket ss = new ServerSocket(6000);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();
        String sq = isPalindrome(str)?"Palindrome":"Not Palindrome";
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(sq);
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
    public static boolean isPalindrome(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equalsIgnoreCase(s)){
            return true;
        }
        return false;
    }
}
