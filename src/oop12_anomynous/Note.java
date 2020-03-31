package oop12_anomynous;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Note extends JFrame{

	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu editMenu = new JMenu("편집");
	JMenu helpMenu = new JMenu("도움말");
	JTextArea textArea = new JTextArea();
	
	JMenuItem newMenuItem = new JMenuItem("새 파일");
	JMenuItem openMenuItem = new JMenuItem("열기");
	JMenuItem saveMenuItem = new JMenuItem("저장하기");
	JMenuItem exitMenuItem = new JMenuItem("끝내기");
	
	
	public Note() {
	
		setLayout(new BorderLayout());
		//새파일 클릭시 실행될 객체
		ActionListener al1 = (e) ->{JOptionPane.showMessageDialog(null, "새파일을 엽니다.");};
		JFileChooser chooser = new JFileChooser();
		//열기
		ActionListener al2 = (e) ->{chooser.showOpenDialog(null);};
		//저장
		ActionListener al3 = (e) ->{chooser.showSaveDialog(null);};
		//끝내기
		ActionListener al4 = (e) ->{System.exit(0);};
		
		
		newMenuItem.addActionListener(al1);
		openMenuItem.addActionListener(al2);
		saveMenuItem.addActionListener(al3);
		exitMenuItem.addActionListener(al4);
		
		
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		setJMenuBar(menuBar);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Note();
	}
	
}
