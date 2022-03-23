package study;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponentEx extends JFrame {
	private JPanel p = new JPanel();
	private JButton btn1 = new JButton("Magenta/Yellow Button");
	private JButton btn2 = new JButton("Disabled Button");
	private JButton btn3 = new JButton("getX() getY()");
	
	JComponentEx(){
		this.setTitle("JComponent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(260, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.magenta);
		
		btn2.setEnabled(false);
	}
	
	public void eventHendler() {
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
				frame.setTitle(b.getX() + ", " + b.getY());
			}
			
		});
	}

	public static void main(String[] args) {
		new JComponentEx();
	}

}
