package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//프레임 자체에서 구현
public class OptionPaneEx extends JFrame implements ActionListener{
	private JPanel p = new JPanel();
	private JButton inputBtn = new JButton("Input Name");
	private JButton confirmBtn = new JButton("Confirm");
	private JButton messageBtn = new JButton("Message");
	private JTextField tf = new JTextField(10);
	
	OptionPaneEx(){
		this.setTitle("OptionPane");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(500,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p, BorderLayout.NORTH);
		
		p.setBackground(Color.LIGHT_GRAY);
		p.add(inputBtn);
		p.add(confirmBtn);
		p.add(messageBtn);
		p.add(tf);
	}
	
	public void eventHandler() {
		inputBtn.addActionListener(this);
		
		confirmBtn.addActionListener(this);
		
		messageBtn.addActionListener(this);
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputBtn) {
			//입력 다이얼로그 생성
			String name = JOptionPane.showInputDialog("이름을 입력하세요");
			
			if(name != null) {
				//사용자가 입력한 문자열을 텍스트필드 창에 출력
				tf.setText(name);
			}
		}else if(e.getSource() == confirmBtn) {
			//확인 다이얼로그 생성
			int result = JOptionPane.showConfirmDialog(null, "계속 할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
			
			//사용자가 선택한 버튼에 따라 문자열을 텍스트필드 창에 출력
			if(result == JOptionPane.CLOSED_OPTION) {
				tf.setText("Just Closed without Selection");
			}else if(result == JOptionPane.YES_OPTION) {
				tf.setText("Yes");
			}else {
				tf.setText("No");
			}
		}else {
			//메시지 다이얼로그 생성
			JOptionPane.showMessageDialog(null, "조심하세요","Message", JOptionPane.ERROR_MESSAGE);
		}
	}

}
