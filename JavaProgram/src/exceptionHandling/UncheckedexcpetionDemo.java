package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class UncheckedexcpetionDemo 
{
	public static void main(String[] args) throws MalformedURLException   
	{
		getURL();
	}
	
	static void getURL() throws MalformedURLException
	{
		URL url = new URL("http:\\www.google.com");
		
		try 
		{
			FileInputStream fis=new FileInputStream(new File("C:\\"));
		} 
		
		catch (FileNotFoundException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}