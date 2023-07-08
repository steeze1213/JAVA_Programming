import java.io.File;

public class FileEx {

	public static void listDirectory(File dir) {
		System.out.println("-----This is a sub-list of" + dir.getPath() + ".-----");
		
		File[] subFiles = dir.listFiles(); // ���丮�� ���Ե� ���ϰ� ���丮 �̸��� ����Ʈ ���
		for(int i=0; i<subFiles.length; i++) { // subFiles �迭�� �� File�� ���� ����
			File f = subFiles[i];
			long t = f.lastModified(); // ���������� ������ �ð�
			System.out.print(f.getName());
			System.out.print(f.isFile()?"\tfile":"\tdirectory");
			System.out.print("\tFile Size: " + f.length()); // ���� ũ��
			System.out.printf("\tModified time: %tb %td %ta %tT\n",t, t, t, t); //���� ���
		}		
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());		

		String res="";
		if(f1.isFile()) res = "File"; // ���� Ÿ���̸�
		else if(f1.isDirectory()) res = "Directory"; // ���丮 Ÿ���̸�
		System.out.println(f1.getPath() + " is " + res + ".");

		File f2 = new File("c:\\Temp\\java_sample"); // ���� ������� �ϴ� ���͸�
		if(!f2.exists()) { // f2 ���͸��� �����ϴ��� �˻�
			f2.mkdir(); // �������� ������ ���丮 ����
		}
		
		listDirectory(new File("c:\\Temp")); // c:\Temp�� �ִ� ���� ����Ʈ ���
		f2.renameTo(new File("c:\\Temp\\javasample")); // java_sample -> javasample�� �̸� ����
		listDirectory(new File("c:\\Temp")); // javasample�� ������ �� ����Ʈ ���
	}
}