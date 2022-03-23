package chapter11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponentEx extends JFrame {
	private JPanel p = new JPanel();
	private JButton b1= new JButton("Manenda/Yellow Button");
	private JButton b2 = new JButton("Disable Button");
	private JButton b3 = new JButton("getX(), getY()");
	
	JComponentEx(){
		this.setTitle("JComponent 이용");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(260, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		b2.setEnabled(false);
	}
	
	//익명중첩클래스로 구현
	public void eventHendler() {
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
				frame.setTitle(b.getX() + ", " + b.getY());
			}
			
		});
	}

	public static void main(String[] args) {
		new JComponentEx();
	}

}
