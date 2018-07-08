import java.net.*;

/**
	Developed by: Amey Vartak
	gitHub : https://github.com/ameyvartak002
*/

public class server_java_udp 
{
	public static void main(String[] args) throws Exception
	{
		String str;
		String revStr;
		byte buffer1[] = new byte[80];
		byte buffer2[] = new byte[80];

		try
		{
			int port = Integer.parseInt(args[0]);
			DatagramSocket serverSocket = new DatagramSocket(port);
			
			DatagramPacket request = new DatagramPacket(buffer1, buffer1.length);
			serverSocket.receive(request);
			
			str = new String(buffer1, 0, request.getLength());			
			StringBuilder sb = new StringBuilder(str);
			
			for(int i = 0; i < str.length(); i++)
			{
				if(Character.isUpperCase(str.charAt(i)))
				{
					sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
				else
					sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			
			revStr = sb.reverse().toString();
			
			port = request.getPort();
			InetAddress ip = request.getAddress();
			
			buffer2 = revStr.getBytes();
			
			DatagramPacket reply = new DatagramPacket(buffer2, buffer2.length, ip, port);
			serverSocket.send(reply);
			
			serverSocket.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception catched!");
		}
	}
}
