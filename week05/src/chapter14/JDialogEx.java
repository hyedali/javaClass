package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

//다이어로그 상자 만들기
class MyJDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	//생성자 생성(파라미터 : 프레임, 타이틀)
	MyJDialog(JFrame frame, String title){
		super(frame, title);
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200,100);
	}
	
	//여기서의 this는 myJDialog을 뜻함
	public void dialogDesign() {
		this.setLayout(new FlowLayout());
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {}
	
}

//버튼 클릭 시 다이어로그 상자가 오픈되도록
//프레임 자체로 구현
public class JDialogEx extends JFrame implements ActionListener{
	JButton btn = new JButton("Show Dialog");
	MyJDialog md = new MyJDialog(this, "TestDialog"); //내가 만든 다이어로그 객체 생성
	
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
		//사용할 이벤트 : ActionListener
		//이벤트 소스 -> btn
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new JDialogEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		md.setVisible(true); //내가 생성한 다이어로그를 보이게 함
	}

}
