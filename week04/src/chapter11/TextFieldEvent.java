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
		p.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		p.add(tf);
		tf.setEditable(false); //텍스트 필드에 입력을 할수 없게됨
		p.add(new JScrollPane(ta));
	}
	
	public void eventHandler() {
		//텍스트필그에 <Enter>키 입력 때 발생하는 Action이벤트의 리스너 등록
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				//텍스트필드의 문자열을 텍스트영역 창에 추가
				ta.append(t.getText() + "\n");
				
				t.setText(""); //현재 텍스트필드에 입력된 내용 지우기
			}
			
		});
	}

	public static void main(String[] args) {
		new TextFieldEvent();
	}

}
