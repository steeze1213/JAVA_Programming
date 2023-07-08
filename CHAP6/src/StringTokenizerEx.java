import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hong Gil-dong/Jang-Hwa/Hong-ryeon/Kong-ji/Pat-ji", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}