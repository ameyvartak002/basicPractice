import java.io.*;
import java.net.*;

/**
	Developed by: Amey Vartak
	gitHub : https://github.com/ameyvartak002
*/

public class server_java_tcp 
{
	public static void main(String[] args) throws Exception
	{
		String str;
		String revStr;
		try
		{
			ServerSocket serverSocket = new ServerSocket(15541);
			Socket socket = serverSocket.accept();
			
			BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter response = new PrintWriter(socket.getOutputStream(), true);
			
			str = clientInput.readLine();
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
			response.println(revStr);
			
			serverSocket.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred! Terminated!");
		}
	}
}
