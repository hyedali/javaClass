package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

//하나의 프로젝트 안에서 다이얼로그의 클래스 이름이 곁치지 않도록 주의!
class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	MyModalDialog(JFrame frame, String title){
		super(frame, title, true); //true는 모달 타입을 만들도록 지시
		
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
				MyModalDialog.this.setVisible(false); //다이얼로그를 닫는다. 라인75에서 리턴
			}
			
		});
	}
	
	//텍스트필드 창에서 사용자가 입력한 문자열을 리턴
	//입력된 내용이 없으면 null을 리턴
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		}else {
			return tf.getText();
		}
	}
}

public class DialogEx2 extends JFrame {
	MyModalDialog mmd = new MyModalDialog(this, "Test Modal Dialog"); //다이얼로그 래퍼런스 및 생성
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
				
				//다이어로그로부터 사용자가 입력한 문자열을 받아온다.
				String text = mmd.getInput();
				
				//입력한 문자열이 없는 경우
				if(text == null) {
					return;
				}
				
				JButton btn = (JButton) e.getSource();
				//입력한 문자열로 이 버튼의 문자열을 변경
				btn.setText(text);
			}
			
		});
	}

	public static void main(String[] args) {
		new DialogEx2();
	}

}
