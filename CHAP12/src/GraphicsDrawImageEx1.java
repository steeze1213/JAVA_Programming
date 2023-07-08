import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx1() {
		setTitle("Draw an image in the desired location with the original size");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg"); // 이미지 로딩
		private Image img = icon.getImage(); // 이미지 객체

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// 이미지를 패널의(20,20)에 원래의 크기로 그린다.
			g.drawImage(img, 20, 20, this);
		}	
	}
	
	public static void main(String [] args) {
		new GraphicsDrawImageEx1();
	}
} 