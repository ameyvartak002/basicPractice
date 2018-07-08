import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
	Developed by: Amey Vartak
	gitHub : https://github.com/ameyvartak002
*/

public class client_java_tcp 
{
	public static void main(String[] args) throws Exception
	{
		String str;
		String revStr;
		
		try 
		{
			Scanner sc = new Scanner(System.in);

			Socket clientSocket = new Socket("localhost", 15541);
			
			BufferedReader response = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter clientInput = new PrintWriter(clientSocket.getOutputStream(), true);
			
			System.out.println("Enter text: ");
			str = sc.nextLine();
			
			clientInput.println(str);
			revStr = response.readLine();
			
			System.out.println("Response from Server: " + revStr);
			
			sc.close();
			clientSocket.close();
		}
		catch(Exception e)
		{
			System.out.println("Excption occured! Terminated!");
		}
	}
}
