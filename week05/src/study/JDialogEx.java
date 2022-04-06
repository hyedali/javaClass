package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	MyDialog(JFrame frame, String title){
		super(frame, title, true);
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200, 100);
	}
	
	public void dialogDesign() {
		this.setLayout(new FlowLayout());
		
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.this.setVisible(false);
			}
			
		});
	}
	
	//�ؽ�Ʈ�ʵ� â�� ����ڰ� �Է��� ���ڿ��� ����
	//�Էµ� ������ ������ null ����
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		}else {
			return tf.getText();
		}
	}
}

public class JDialogEx extends JFrame {
	private MyDialog md = new MyDialog(this, "Test Dialog");
	
	JButton btn = new JButton("Show Dialog");
	
	JDialogEx(){
		this.setTitle("JDialog");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(btn);
	}
	
	public void eventHandler() {
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				md.setVisible(true); //���̾�α� �۵� ����
				//=>setVisibel(false)�� ������ ���� �������� �ʴ´�
				
				//���̾�α׷κ��� ����ڰ� �Է��� ���ڿ��� �޾ƿ´�.
				//=> ���̾�αװ� ������ ��μ� �� ������ ����Ǹ� �ؽ�Ʈ�� ����
				String text = md.getInput();
				
				//�Է��� ���ڿ��� ���� ��� ����
				if(text == null) {
					return;
				}
				
				JButton btn = (JButton) e.getSource();
				//�Է��� ���ڿ��� �� ��ư�� ���ڿ� ����
				btn.setText(text);
			}
			
		});
	}

	public static void main(String[] args) {
		new JDialogEx();
	}

}
