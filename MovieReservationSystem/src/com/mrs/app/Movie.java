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

public class Movie extends JFrame {

	Label mainId, mainPw;
	JTextField idfield, pwfield;
	JButton btn1 = new JButton("확인");
	ImageIcon icon;

	Movie() {

		setTitle("MEGABIX");
		setSize(600, 400);
		setLayout(null);

	}

	public void createwindows() {

		Container con = getContentPane();
        try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/1.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
        pack();
//
//		mainId = new Label("아이디");
//		mainPw = new Label("패스워드");
//
//		idfield = new JTextField(20);
//		pwfield = new JTextField(20);

//		mainId.setBounds(600, 300, 50, 20);
//		mainPw.setBounds(590, 360, 50, 20);
//
//		idfield.setBounds(700, 300, 100, 20);
//		pwfield.setBounds(700, 360, 100, 20);
//		btn1.setBounds(700, 400, 100, 30);

//		add(mainId);
//		add(mainPw);
//		add(idfield);
//		add(pwfield);
//		add(btn1);
//		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		Movie main = new Movie();
		main.createwindows();
	}
}
