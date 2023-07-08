import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		setTitle("Example of using DrawString");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // 생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(250,200);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Java is fun.~~", 30,30); // 패널의 (30,30) 위치에 문자열 출력
			g.drawString("How much? To the moon and back !!!!", 60, 60); // 패널의 (60,60) 위치에 문자열 출력
		}
	}
	
	public static void main(String [] args) {
		new GraphicsDrawStringEx();
	}
}