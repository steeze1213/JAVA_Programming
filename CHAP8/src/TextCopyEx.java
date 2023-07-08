import java.io.*;

public class TextCopyEx {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // ���� ���� ��θ�
		File dest = new File("c:\\Temp\\system.txt"); // ���� ���� ��θ�

		int c;
		try {
			FileReader fr = new FileReader(src); // ���� �Է� ���� ��Ʈ�� ����
			FileWriter fw = new FileWriter(dest); // ���� ��� ���� ��Ʈ�� ����
			while((c = fr.read()) != -1) { // ���� �ϳ� �а�
				fw.write((char)c); // ���� �ϳ� ����
			}
			fr.close();
			fw.close();
			System.out.println("Copied " + src.getPath()+ " to " + dest.getPath()+ ".");
		} catch (IOException e) {
			System.out.println("File Copy Error");
		}
	}
}