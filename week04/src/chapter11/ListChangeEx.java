package chapter11;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListChangeEx extends JFrame {
	private JPanel p = new JPanel();
	Vector<String> v = new Vector<String>();
	JList<String> nameList = new JList<String>(v);
	
	private TextField tf = new TextField(10);
	
	ListChangeEx(){
		this.setTitle("ListChange");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(new JLabel("이름 입력 후 <Enter> 키"));
		p.add(tf);
		
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		p.add(new JScrollPane(nameList));
	}
	
	public void eventHandler() {
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText());
				tf.setText("");
				nameList.setListData(v);
			}
			
		});
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}

}
