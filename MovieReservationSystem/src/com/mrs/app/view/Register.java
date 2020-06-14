package com.mrs.app.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {

	private static final long serialVersionUID = 4309338501451187572L;
	
	JTextField rgName, rgId;
	JButton btnCheck = new JButton(new ImageIcon("./image/button/check.png")); // 버튼에 이미지를 넣는다
	JButton btnPrevious = new JButton(new ImageIcon("./image/button/previous.png")); // 버튼에 이미지를 넣는다
	JPasswordField pw, pwConfirm;

	public Register() {
		setTitle("MEGABIC_REGISTER"); // 메인이름
		setSize(600, 400); // 사이즈
		setLayout(null); // 레이아웃 없음
		setResizable(false); // 사이즈 조절 못 함

		rgName = new JTextField(25);
		rgId = new JTextField(25);
		pw = new JPasswordField(25);
		pwConfirm = new JPasswordField(25);
		
		createwindows();
	}

	public void createwindows() {
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/Register.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		btnCheck.setBounds(750, 345, 95, 36);
		btnPrevious.setBounds(650, 345, 95, 36);
		rgName.setBounds(420, 140, 200, 40);
		rgId.setBounds(420, 200, 200, 40);
		pw.setBounds(420, 270, 200, 40);
		pwConfirm.setBounds(420, 340, 200, 40);

		add(btnPrevious);
		add(btnCheck);
		add(rgName);
		add(rgId);
		add(pw);
		add(pwConfirm);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
