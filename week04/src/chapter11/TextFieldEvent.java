package chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEvent extends JFrame {
	private JPanel p = new JPanel();
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	
	TextFieldEvent(){
		this.setTitle("TextField Event");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���"));
		p.add(tf);
		tf.setEditable(false); //�ؽ�Ʈ �ʵ忡 �Է��� �Ҽ� ���Ե�
		p.add(new JScrollPane(ta));
	}
	
	public void eventHandler() {
		//�ؽ�Ʈ�ʱ׿� <Enter>Ű �Է� �� �߻��ϴ� Action�̺�Ʈ�� ������ ���
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				//�ؽ�Ʈ�ʵ��� ���ڿ��� �ؽ�Ʈ���� â�� �߰�
				ta.append(t.getText() + "\n");
				
				t.setText(""); //���� �ؽ�Ʈ�ʵ忡 �Էµ� ���� �����
			}
			
		});
	}

	public static void main(String[] args) {
		new TextFieldEvent();
	}

}
