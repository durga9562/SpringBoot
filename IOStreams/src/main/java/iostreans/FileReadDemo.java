package iostreans;

import java.io.File;
import java.io.FileInputStream;

public class FileReadDemo throws IOException
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("D:\workspace\IOStreams\src\main\java\iostreans\practice.java");
	 FileInputStream fis=null;
	 try{
		 fis=new FileInputStream(file);
		 System.out.println("Total file sizze to read (in bytes): " + fis.available());
		 
	 }
	}

}
