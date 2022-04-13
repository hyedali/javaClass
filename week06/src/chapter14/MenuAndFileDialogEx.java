package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame {
	private JMenuBar mb = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem openItem = new JMenuItem("Open");
	private JMenuItem saveItem = new JMenuItem("Save");
	
	private JLabel imgLabel = new JLabel("AAA");
	
	private JTextArea ta = new JTextArea();
	
	//���� ���̾�α״� path�� ���� ��, ��ü�� ����
	private JFileChooser chooser = new JFileChooser();
	
	MenuAndFileDialogEx(){
		this.setTitle("MenuAndFileDialogEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(350, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setJMenuBar(mb);
		mb.add(fileMenu);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		this.add(ta);
	}
	
	public void eventHandler() {
		//Open�޴� �����ۿ� Action�����ʸ� ����Ѵ�.
		openItem.addActionListener(new MyActionListener());
		
		saveItem.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == "Open") {
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT txt" , "txt");
				chooser.setFileFilter(filter);
				
				int ret = chooser.showOpenDialog(null);
				
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				//imgLabel.setIcon(new ImageIcon(filePath));
				
				try {
					BufferedReader rd = new BufferedReader(new FileReader(filePath));
					
					ta.setText("");
					String line;
					
					while((line = rd.readLine())!= null) {
						ta.append(line + "\n");
					}
					
					rd.close();
				}catch(Exception e1) {
					//JOptionPane.showMessageDialog(this, "�������");
					e1.printStackTrace();
					//return;
				}
				
				
			}else if(e.getActionCommand() == "Save") {
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT txt" , "txt");
				chooser.setFileFilter(filter);
				
				chooser.setCurrentDirectory(new File(".\\"));
				int ret = chooser.showSaveDialog(null);
				
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
					bw.write(ta.getText());
					bw.close();
				}catch(Exception e1) {
					//JOptionPane.showMessageDialog(this, "���� ����");
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}

}
