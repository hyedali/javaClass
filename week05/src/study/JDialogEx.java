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
	
	//텍스트필드 창에 사용자가 입력한 문자열을 리턴
	//입력된 내용이 없으면 null 리턴
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
				md.setVisible(true); //다이얼로그 작동 시작
				//=>setVisibel(false)로 닫힐때 까지 리턴하지 않는다
				
				//다이얼로그로부터 사용자가 입력한 문자열을 받아온다.
				//=> 다이얼로그가 닫히면 비로소 이 라인이 실행되며 텍스트를 얻어옴
				String text = md.getInput();
				
				//입력한 문자열이 없는 경우 리턴
				if(text == null) {
					return;
				}
				
				JButton btn = (JButton) e.getSource();
				//입력한 문자열로 이 버튼의 문자열 변경
				btn.setText(text);
			}
			
		});
	}

	public static void main(String[] args) {
		new JDialogEx();
	}

}
