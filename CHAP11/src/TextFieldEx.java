import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("Example of creating a TextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Name "));
		c.add(new JTextField(20)); // 창의 열 개수 20
		c.add(new JLabel("Department "));
		c.add(new JTextField("Department of Computer Science", 20)); // 창의 열 개수 20
		c.add(new JLabel("Address "));
		c.add(new JTextField("Seoul City ...", 20)); // 창의 열 개수 20
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new TextFieldEx();
	}
} 