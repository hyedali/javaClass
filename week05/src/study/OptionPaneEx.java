package study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame implements ActionListener{
	private JPanel p = new JPanel();
	private JTextField tf = new JTextField(10);
	private JButton inputBtn = new JButton("Input");
	private JButton confirmBtn = new JButton("Confirm");
	private JButton msgBtn = new JButton("Message");
	
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
		p.add(msgBtn);
		p.add(tf);
	}
	
	public void eventHandler() {
		inputBtn.addActionListener(this);
		confirmBtn.addActionListener(this);
		msgBtn.addActionListener(this);
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputBtn) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요");
			if(name != null) {
				tf.setText(name);
			}
		}else if(e.getSource() == confirmBtn) {
			int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?","Confirm",JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.CLOSED_OPTION) {
				tf.setText("Just Closed without Selection");
			}else if(result == JOptionPane.YES_OPTION) {
				tf.setText("Yes");
			}else {
				tf.setText("No");
			}
		}else {
			JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
		}
	}

}
