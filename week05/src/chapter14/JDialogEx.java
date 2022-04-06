package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

//���̾�α� ���� �����
class MyJDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	//������ ����(�Ķ���� : ������, Ÿ��Ʋ)
	MyJDialog(JFrame frame, String title){
		super(frame, title);
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200,100);
	}
	
	//���⼭�� this�� myJDialog�� ����
	public void dialogDesign() {
		this.setLayout(new FlowLayout());
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {}
	
}

//��ư Ŭ�� �� ���̾�α� ���ڰ� ���µǵ���
//������ ��ü�� ����
public class JDialogEx extends JFrame implements ActionListener{
	JButton btn = new JButton("Show Dialog");
	MyJDialog md = new MyJDialog(this, "TestDialog"); //���� ���� ���̾�α� ��ü ����
	
	JDialogEx(){
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
		//����� �̺�Ʈ : ActionListener
		//�̺�Ʈ �ҽ� -> btn
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new JDialogEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		md.setVisible(true); //���� ������ ���̾�α׸� ���̰� ��
	}

}
