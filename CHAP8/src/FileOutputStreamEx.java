import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		
		try { 
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch(IOException e) {
			System.out.println("Failed to save to c:\\Temp\\test.out. Please check the path name.");
			return;
		}
		System.out.println("saved c:\\Temp\\test.out.");
	}
}