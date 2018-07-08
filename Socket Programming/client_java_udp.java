import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
	Developed by: Amey Vartak
	gitHub : https://github.com/ameyvartak002
*/

public class client_java_udp 
{
	public static void main(String[] args) throws Exception
	{
		String str;
		String revStr;
		byte buffer1[] = new byte[80];
		byte buffer2[] = new byte[80];
		try
		{
			Scanner sc = new Scanner(System.in);
			
			InetAddress ip = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			
			DatagramSocket clientSocket = new DatagramSocket();
			
			System.out.println("Enter text: ");
			str = sc.nextLine();
			
			buffer1 = str.getBytes();
			DatagramPacket request = new DatagramPacket(buffer1, buffer1.length, ip, port);
			clientSocket.send(request);
			
			DatagramPacket reply = new DatagramPacket(buffer2, buffer2.length);
			clientSocket.receive(reply);
			
			revStr = new String(buffer2, 0, reply.getLength());
			System.out.println("Response from Server: " + revStr);
			
			sc.close();
			clientSocket.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception catched!");
		}
	}
}
