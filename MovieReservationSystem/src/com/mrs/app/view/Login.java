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

public class Login extends SuperView {

	private static final long serialVersionUID = -3656622646025106289L;

	JTextField idField; // 텍스트 필드 변수
	JPasswordField pwField; // 패스워드 필드 변수
	
	JButton btnRegister = new JButton(new ImageIcon("./image/button/join.png")); // 회원 등록 버튼에 이미지를 넣는다
	JButton btnLogin = new JButton(new ImageIcon("./image/button/login.png")); // 버튼에 이미지를 넣는다

	public Login() {
		setTitle("MEGABIC_LOGIN"); // 메인이름
		setSize(600, 400); // 사이즈
		setLayout(null); // 레이아웃 없음
		setResizable(false); // 사이즈 조절 못 함
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
				dispose(); // 자기 창 닫기
				main.showRegister(); // 메인창 메소드를 이용해 영화 목록 창 띄우기
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

		if (inputID.isEmpty()) { // ID 공백 검증
			JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
		} else if (inputPassword.isEmpty()) { // Password 공백 검증
			JOptionPane.showMessageDialog(null, "패스워드를 입력하세요.");
		} else { // 회원 정보 검증 로직
			if (isLogin(inputID, inputPassword)) { // 회원 정보 검증 함수 호출
				JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
				this.dispose(); // 자기 창 닫기
				this.main.showMovieList(); // 메인창 메소드를 이용해 영화 목록 창 띄우기
			} else { // 검증 실패.
				JOptionPane.showMessageDialog(null, "아이디 혹은 패스워드가 잘못되었습니다.");
			}
		}
	}

	public boolean isLogin(String inputID, String inputPassword) {
		boolean result = false;
		
		// DB에 ID, Password 조회하여 유효한지 검증.
		if (inputID.equals("test") && inputPassword.equals("1234")) {
			result = true;
		}
		return result;
	}
}
