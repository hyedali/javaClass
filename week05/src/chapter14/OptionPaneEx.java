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

//������ ��ü���� ����
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
			//�Է� ���̾�α� ����
			String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
			
			if(name != null) {
				//����ڰ� �Է��� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
				tf.setText(name);
			}
		}else if(e.getSource() == confirmBtn) {
			//Ȯ�� ���̾�α� ����
			int result = JOptionPane.showConfirmDialog(null, "��� �� ���Դϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
			
			//����ڰ� ������ ��ư�� ���� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
			if(result == JOptionPane.CLOSED_OPTION) {
				tf.setText("Just Closed without Selection");
			}else if(result == JOptionPane.YES_OPTION) {
				tf.setText("Yes");
			}else {
				tf.setText("No");
			}
		}else {
			//�޽��� ���̾�α� ����
			JOptionPane.showMessageDialog(null, "�����ϼ���","Message", JOptionPane.ERROR_MESSAGE);
		}
	}

}
