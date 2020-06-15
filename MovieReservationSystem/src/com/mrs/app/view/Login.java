package com.mrs.app.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mrs.app.Movie;

public class Login extends SuperView {

	private static final long serialVersionUID = -3656622646025106289L; //쓰레드 

	JTextField idField; // 텍스트 필드 변수 
	JPasswordField pwField; // 비밀번호 텍스트 필드 만듬
	
	JButton btnRegister = new JButton(new ImageIcon("./image/button/join.png")); // 회원가입 버튼이미지
	JButton btnLogin = new JButton(new ImageIcon("./image/button/login.png")); // 로그인 버튼 이미지
	
	public Login() {
		setTitle("MEGABIC_LOGIN"); // 제목
		setSize(600, 400); // 사이즈
		setLayout(null); // 레이아웃 설정 안함
		setResizable(false); // 화면 조절 안 됨
		createwindows(); 
	}

	public void createwindows() {
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/login.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();
		idField = new JTextField(10);
		pwField = new JPasswordField(15);

		idField.setBounds(400, 160, 200, 40);
		pwField.setBounds(400, 250, 200, 40);
		btnLogin.setBounds(700, 189, 100, 35);
		btnRegister.setBounds(700, 250, 100, 35);

		btnLogin.setBorderPainted(true);
		btnLogin.setFocusPainted(false);
		btnLogin.setContentAreaFilled(false);
		
		btnRegister.setBorderPainted(true);
		btnRegister.setFocusPainted(false);
		btnRegister.setContentAreaFilled(false);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 기존 화면 꺼짐
				main.showRegister(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		add(idField);
		add(pwField);
		add(btnLogin);
		add(btnRegister);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void isLoginCheck() {
		String inputID = idField.getText().trim();
		String inputPassword = new String(pwField.getPassword()).trim();

		if (inputID.isEmpty()) { // ID 
			JOptionPane.showMessageDialog(null, "ID를 입력하세요.");
		} else if (inputPassword.isEmpty()) { // Password 
			JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
		} else { // 아이디와 패스워드가 맞을 때
			if (isLogin(inputID, inputPassword)) { 
				JOptionPane.showMessageDialog(null, "접속 되었습니다.");
				this.dispose(); 
				this.main.showAccountInfo(main); // 
			} else { // 비밀번호 오류 시 
				JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다 다시 입력해주세요.");
			}
		}
	}

	public boolean isLogin(String inputID, String inputPassword) {
		boolean result = false;
		
		// DB ID, Password
		if (inputID.equals("test") && inputPassword.equals("1234")) {
			result = true;
		}
		return result;
	}
}
