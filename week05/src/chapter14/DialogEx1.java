package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	private JTextField tf = new JTextField(10); //���̾�α׿� ������ �ؽ�Ʈ �ʵ�
	private JButton okBtn = new JButton("OK"); //���̾�α׿� ������ ��ư
	
	MyDialog(JFrame frame, String title){
		//true�� �����ϸ� modal ���̾�α� ���ڷ� ���� - (������� �Է�) ������
		super(frame, title, true); //��� ���̾�α� Ÿ��
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200,100); //���̾�α��� ũ��
	}
	
	public void dialogDesign() {
		this.setLayout(new FlowLayout());
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {
		//���̾�α��� ok��ư�� Action������ �ޱ�
		//ok��ư�� ���õǸ� ���̾�αװ� ȭ�鿡�� ������� �ȴ�.
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.this.setVisible(false); //���̾�α׸� ������ �ʰ� �Ѵ�.
			}
			
		});
	}
}

//�͸���øŬ������ ����
public class DialogEx1 extends JFrame {
	JButton btn = new JButton("Show Dialog");
	MyDialog md = new MyDialog(this, "Test Dialog"); //���̾�α��� ���۷��� �� ����
	
	DialogEx1(){
		this.setTitle("Dialog");
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
		//Show Dialog ��ư�� Ŭ���ϸ� ���̾�α׸� �۵���Ų��.
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				md.setVisible(true); //���̾�α׸� ����ϰ� �۵���Ų��.
				
			}
			
		});
	}

	public static void main(String[] args) {
		new DialogEx1();
	}

}
