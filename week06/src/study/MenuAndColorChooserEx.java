package study;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	private JMenuBar mb = new JMenuBar();
	private JMenu fileMenu = new JMenu("Text");
	private JMenuItem colorItem = new JMenuItem("Color");
	
	MenuAndColorChooserEx(){
		this.setTitle("MenuAndColorChooserEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setJMenuBar(mb);
		mb.add(fileMenu);
		fileMenu.add(colorItem);
		
		this.add(la);
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setFont(new Font("Ravie",Font.ITALIC,30));
	}
	
	public void eventHandler() {
		colorItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
				
				if(selectedColor != null) {
					la.setForeground(selectedColor);
				}
			}
			
		});
	}

	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
