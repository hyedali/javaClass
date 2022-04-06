package chapter14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	private JTextField tf = new JTextField(10); //다이얼로그에 삽입할 텍스트 필드
	private JButton okBtn = new JButton("OK"); //다이얼로그에 삽입할 버튼
	
	MyDialog(JFrame frame, String title){
		//true로 설정하면 modal 다이얼로그 상자로 설정 - (사용자의 입력) 독점권
		super(frame, title, true); //모달 다이얼로그 타입
		
		this.dialogDesign();
		this.dialogEvent();
		
		this.setSize(200,100); //다이얼로그의 크기
	}
	
	public void dialogDesign() {
		this.setLayout(new FlowLayout());
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {
		//다이얼로그의 ok버튼에 Action리스너 달기
		//ok버튼이 선택되면 다이얼로그가 화면에서 사라지게 된다.
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.this.setVisible(false); //다이얼로그를 보이지 않게 한다.
			}
			
		});
	}
}

//익명중첩클래스로 구현
public class DialogEx1 extends JFrame {
	JButton btn = new JButton("Show Dialog");
	MyDialog md = new MyDialog(this, "Test Dialog"); //다이얼로그의 레퍼런스 및 생성
	
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
		//Show Dialog 버튼을 클릭하면 다이얼로그를 작동시킨다.
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				md.setVisible(true); //다이얼로그를 출력하고 작동시킨다.
				
			}
			
		});
	}

	public static void main(String[] args) {
		new DialogEx1();
	}

}
