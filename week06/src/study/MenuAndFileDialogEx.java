package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame implements ActionListener {
	//private JLabel la = new JLabel();
	
	private JMenuBar mb = new JMenuBar();
	private JMenu FileMenu = new JMenu("File");
	private JMenuItem openItem = new JMenuItem("Open");
	private JMenuItem saveItem = new JMenuItem("Save");
	
	private JTextArea ta = new JTextArea();
	
	private JFileChooser fc = new JFileChooser();
	
	MenuAndFileDialogEx(){
		this.setTitle("MenuAndFileDialogEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(350,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setJMenuBar(mb);
		mb.add(FileMenu);
		FileMenu.add(openItem);
		FileMenu.add(saveItem);
		
		this.add(ta);
	}
	
	public void eventHandler() {
		openItem.addActionListener(this);
		saveItem.addActionListener(this);
	}

	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Open") {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT txt", "txt");
			fc.setFileFilter(filter);
			
			int ret = fc.showOpenDialog(null);
			
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = fc.getSelectedFile().getPath();
			
			try {
				BufferedReader rd = new BufferedReader(new FileReader(filePath));
				
				ta.setText("");
				String line;
				
				while((line = rd.readLine()) != null) {
					ta.append(line + "\n");
				}
				
				rd.close();
				
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(this, "경고");
			}
			
			
		}else if(e.getActionCommand() == "Save") {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT txt", "txt");
			fc.setFileFilter(filter);
			
			int ret = fc.showSaveDialog(null);
			
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = fc.getSelectedFile().getPath();
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
				bw.write(ta.getText());
				bw.close();
				
			}catch(Exception e1) {
				
			}
		}
	}

}
