package com.mrs.app;

import java.awt.Container;
import java.awt.Label;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainView extends JFrame {

	JButton b1 = new JButton(new ImageIcon("./image/one.jpg"));  //버튼에 이미지를 넣는다
	JButton b2 = new JButton(new ImageIcon("./image/two.gif"));  //버튼에 이미지를 넣는다
	JButton b3 = new JButton(new ImageIcon("./image/tree.jpg"));  //버튼에 이미지를 넣는다
	
	MainView() {

		setTitle("MEGABIX");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);  
		
	}

	public void createwindows() {

	
		
		
		b1.setBounds(700, 189, 100, 35);
		b1.setBounds(700, 189, 100, 35);
		b1.setBounds(700, 189, 100, 35);
		
		
		
		
		
        try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/movieView.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
        pack();

        
        
        
        
        
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		MainView main = new MainView();
		main.createwindows();
	}
}
