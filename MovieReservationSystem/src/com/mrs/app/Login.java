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

public class Login extends JFrame {

	JTextField idfield, pwfield;    //텍스트 필드 변수
	
	ImageIcon icon;                 //이미지 아이콘 변수
	JButton b1 = new JButton(new ImageIcon("./image/loginbutton.png"));  //버튼에 이미지를 넣는다
	Login() {

		setTitle("MEGABIX_LOGIN");     //메인이름
		setSize(600, 400);			//사이즈
		setLayout(null);            //레이아웃 없음
		setResizable(false);        //사이즈 조절 못 함 

	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/login.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		idfield = new JTextField(25);
		pwfield = new JTextField(25);

		idfield.setBounds(400, 160, 200, 40);
		pwfield.setBounds(400, 250, 200, 40);
		b1.setBounds(700, 189, 100, 35);
		
		b1.setBorderPainted(true);
		b1.setFocusPainted(false);
		b1.setContentAreaFilled(false);


		add(idfield);
		add(pwfield);
		add(b1);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		Login main = new Login();
		main.createwindows();
	}
}
