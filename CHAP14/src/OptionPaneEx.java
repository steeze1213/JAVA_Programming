import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		setTitle("Example of OptionPane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}
	
	class MyPanel extends Panel {
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 입력 다이얼로그 생성
					String name = JOptionPane.showInputDialog("Please enter your name.");
					if(name != null)
						tf.setText(name); // 사용자가 입력한 문자열을 텍스트필드 창에 출력
				}
			});

			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 확인 다이얼로그 생성
					int result = JOptionPane.showConfirmDialog(null, 
							"Will you continue?", "Confirm", JOptionPane.YES_NO_OPTION);

					// 사용자가 선택한 버튼에 따라 문자열을 텍스트필드 창에 출력
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 메시지 다이얼로그 생성
					JOptionPane.showMessageDialog(null, "Be careful", "Message", JOptionPane.ERROR_MESSAGE); 
				}
			});
		}
	}

	public static void main(String [] args) {
		new OptionPaneEx();
	}
}