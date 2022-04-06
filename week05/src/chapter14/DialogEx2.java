package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

//�ϳ��� ������Ʈ �ȿ��� ���̾�α��� Ŭ���� �̸��� ��ġ�� �ʵ��� ����!
class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	MyModalDialog(JFrame frame, String title){
		super(frame, title, true); //true�� ��� Ÿ���� ���鵵�� ����
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200,100);
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
				MyModalDialog.this.setVisible(false); //���̾�α׸� �ݴ´�. ����75���� ����
			}
			
		});
	}
	
	//�ؽ�Ʈ�ʵ� â���� ����ڰ� �Է��� ���ڿ��� ����
	//�Էµ� ������ ������ null�� ����
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		}else {
			return tf.getText();
		}
	}
}

public class DialogEx2 extends JFrame {
	MyModalDialog mmd = new MyModalDialog(this, "Test Modal Dialog"); //���̾�α� ���۷��� �� ����
	JButton btn = new JButton("Show Modal Dialog");
	
	DialogEx2(){
		this.setTitle("Modal Dialog");
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
				mmd.setVisible(true);
				
				//���̾�α׷κ��� ����ڰ� �Է��� ���ڿ��� �޾ƿ´�.
				String text = mmd.getInput();
				
				//�Է��� ���ڿ��� ���� ���
				if(text == null) {
					return;
				}
				
				JButton btn = (JButton) e.getSource();
				//�Է��� ���ڿ��� �� ��ư�� ���ڿ��� ����
				btn.setText(text);
			}
			
		});
	}

	public static void main(String[] args) {
		new DialogEx2();
	}

}
