import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20); // 한줄에 20개 입력 가능, 7줄 입력창
	
	public TextAreaEx() {
		setTitle("Example of creating a TextArea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Enter the <Enter> key"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		// 텍스트필드에 <Enter> 키 입력 때 발생하는 Action 이벤트의 리스너 등록
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); // 텍스트필드의 문자열을 텍스트영역 창에 붙임 
				t.setText(""); // 현재 텍스트필드에 입력된 내용 지우기
			}
		});

		setSize(300,300);
		setVisible(true);
	}
		
	public static void main(String [] args) {
		new TextAreaEx();
	}
}