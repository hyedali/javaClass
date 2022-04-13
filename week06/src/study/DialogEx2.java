package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	MyModalDialog(JFrame frame, String title){
		super(frame, title);
		
		this.dialogForm();
		this.dialogEvent();
		
		this.setSize(200,100);
	}
	
	public void dialogForm() {
		this.setLayout(new FlowLayout());
		this.add(tf);
		this.add(okBtn);
	}
	
	public void dialogEvent() {
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
	}
	
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		}else {
			return tf.getText();
		}
	}
}

public class DialogEx2 extends JFrame {
	private JButton btn = new JButton("JAVA");
	private MyModalDialog mDialog = new MyModalDialog(this, "Title");
	
	DialogEx2(){
		this.setTitle("DialogEx2");
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
				mDialog.setVisible(true);
				
				String text = mDialog.getInput();
				
				if(text == null) {
					return;
				}
				
				JButton btn1 = (JButton) e.getSource();
				btn1.setText(text);
			}
			
		});
	}

	public static void main(String[] args) {
		new DialogEx2();
	}

}
